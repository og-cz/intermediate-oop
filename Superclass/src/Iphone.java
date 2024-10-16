public class Iphone extends Smartphone {
    
    private String faceId;
    
    public Iphone(String model, String os, int year, String faceId) {
        super(model, os, year);
        this.faceId = faceId;
    }
    
    public String getFaceId() {
        return faceId;
    }
    
    public void setFaceId(String faceId) {
        this.faceId = faceId;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Face ID: " + faceId);
    }
}
