package B_MarketSoftware;

public class EncapDatabase {

	private String buyerName;
	private static String productCode;
	
	void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	
	void setProductCode(String productCode) {
		EncapDatabase.productCode = productCode;
	}
	
	String getBuyerName() {
		return buyerName;
	}
	
	static String getProductCode() {
		return productCode;
	}
}
