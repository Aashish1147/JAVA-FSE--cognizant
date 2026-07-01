package ProxyPatternExample;

class RealImage implements Image {

    private String fileName;

    RealImage(String fileName) {
        this.fileName = fileName;
        loadFromServer();
    }

    private void loadFromServer() {
        System.out.println("Loading " + fileName + " from Remote Server...");
    }

    public void display() {
        System.out.println("Displaying " + fileName);
    }

}