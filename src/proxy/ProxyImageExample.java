package proxy;

interface Image {
    void display();
}

class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
    }

    private void loadFromDisk() {
        System.out.println("Loading image " + fileName);
    }

    public void display() {
        System.out.println("Displaying image " + fileName);
    }
}

class proxyImage implements Image {
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

public class ProxyImageExample {
    public static void main(String[] args) {
        Image image = new proxyImage("image.jpg");
        // Image will be loaded from disk only when display() is called
        image.display();
        // Image will not be loaded again, as it has been cached in the Proxy
        image.display();
    }
}
