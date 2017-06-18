package router;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.bindy.csv.BindyCsvDataFormat;
import org.apache.camel.model.dataformat.BindyType;
import org.apache.camel.spi.DataFormat;

import domain.DailySalesRecord;



public class SalesRecordRouter extends RouteBuilder {

    @Override
    public void configure() throws Exception {
    	
        final DataFormat bindy = new BindyCsvDataFormat(DailySalesRecord.class);


    	from("file:src/data/csv?noop=true")
    	.split(body(String.class).tokenize("\n"))
    	.log("CSV line has been split")
        .unmarshal(bindy)
        .log("CSV record has been transformed into POJO")
        .beanRef("salesRecordMapper", "getSalesRecord")
        .to("sqlComponent:{{sql.insertSalesRecord}}")
        .log("Record loaded into database");

       
    }

}