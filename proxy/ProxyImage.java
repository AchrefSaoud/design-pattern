package proxy;

//the proxy subject

public class ProxyImage implements Image{
    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage==null) {
            this.realImage=new RealImage(this.filename);
        }
        realImage.display();
    }
    
}
