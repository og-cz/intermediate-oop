
public class Iphone {
	
	private String model;
	private String ios;
	private int year;
	
	public Iphone(String model, String ios, int year){
		this.model=model;
		this.ios=ios;
		this.year=year;
	}
	
	public String getModel() {
		return model;
	}
	public String getIos() {
		return ios;
	}
	public int getYear() {
		return year;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	public void setIos(String ios) {
		this.ios = ios;
	}
	public  void setYear(int year) {
		this.year = year;
	}

     	void displayInfo() {
        System.out.println("Model		:	" + model);
        System.out.println("IOS Version	:	" + ios);
        System.out.println("Year Bought	:	" + year);
}
}