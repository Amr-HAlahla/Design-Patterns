package proxy.image;

public class proxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public proxyImage(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
