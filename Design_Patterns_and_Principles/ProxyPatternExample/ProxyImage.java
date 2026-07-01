package ProxyPatternExample;

class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    public void display() {

        if (realImage == null) {
            realImage = new RealImage(fileName);
        }

        realImage.display();
    }

}