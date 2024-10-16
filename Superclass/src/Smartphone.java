public class Smartphone {
    
    protected String model;
    protected String os;
    protected int year;
    
    public Smartphone(String model, String os, int year){
        this.model = model;
        this.os = os;
        this.year = year;
    }
    
    public String getModel() {
        return model;
    }
    
    public String getOs() {
        return os;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public void setOs(String os) {
        this.os = os;
    }
    
    public void setYear(int year) {
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("OS: " + os);
        System.out.println("Year: " + year);
    }
}
