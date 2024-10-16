package B_MarketSoftware;

public class Product {
	
	String productCode = EncapDatabase.getProductCode();
	int price = 0;
	String name = null;
	
	int price() {
		switch (productCode) {

		case "A": price = 100; break;
		case "B": price = 200; break;
		case "C": price = 100; break;
		case "D": price = 300; break;
		case "E": price = 100; break;
		
		default: ; break;
		}
		return price; 
	}
	
	String name() {
		switch(productCode) {
		
		case "A": name = "soda"; break;
		case "B": name = "milk"; break;
		case "C": name = "biscuit"; break;
		case "D": name = "rice"; break;
		case "E": name = "chocolate"; break;
		
		default: break;
		}
		return name;
	}
	
	
}
