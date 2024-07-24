package proxy;

//the real subject

public class RealImage implements Image{
    private String filename;
    
    public RealImage(String filename) {
        this.filename = filename;
        System.out.println("loading image ....");
    }

    @Override
    public void display() {
        System.out.println("Image :"+filename);   
    }
    
}
