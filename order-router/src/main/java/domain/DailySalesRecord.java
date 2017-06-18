package domain;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = ",", crlf = "MAC")
public class DailySalesRecord {

	    @DataField(pos = 1)
	    private String siteRef;
	 
	    @DataField(pos = 2)
	    private String itemCode;
	    
	    @DataField(pos = 3)
	    private String quantity;
	    
	    @DataField(pos = 4)
	    private String unitPrice;
	   
	    public String getSiteRef() {
	        return siteRef;
	    }

	    public void setSiteRef(String siteRef) {
	        this.siteRef = siteRef;
	    }

	    public String getItemCode() {
	        return itemCode;
	    }

	    public void setItemCode(String itemCode) {
	        this.itemCode = itemCode;
	    }

	    public String getQuantity() {
	        return quantity;
	    }

	    public void setQuantity(String quantity) {
	        this.quantity = quantity;
	    }
	    
	    public String getUnitPrice() {
	        return unitPrice;
	    }

	    public void setUnitPrice(String unitPrice) {
	        this.unitPrice = unitPrice;
	    }
	    
	   
	    
	
}
