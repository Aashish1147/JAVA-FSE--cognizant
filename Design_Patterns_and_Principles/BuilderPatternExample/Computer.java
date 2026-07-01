package BuilderPatternExample;

class Computer {

    private String cpu;
    private int ram;
    private int storage;

    // Private constructor
    private Computer(Builder builder) {
        cpu = builder.cpu;
        ram = builder.ram;
        storage = builder.storage;
    }

    void display() {
        System.out.println("CPU : " + cpu);
        System.out.println("RAM : " + ram + " GB");
        System.out.println("Storage : " + storage + " GB");
    }

    // Static Nested Builder Class
    static class Builder {

        private String cpu;
        private int ram;
        private int storage;

        Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        Builder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        Computer build() {
            return new Computer(this);
        }
    }
}