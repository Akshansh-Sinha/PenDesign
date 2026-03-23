package pen;

public abstract class Pen {
    private String brand;
    private String name;
    private boolean isCapOpen = false;

    public Pen(String brand, String name) {
        this.brand = brand;
        this.name = name;
    }

    public void start() {
        if (!isCapOpen) {
            isCapOpen = true;
            System.out.println("Opened the pen cap of " + brand + " " + name);
        } else {
            System.out.println(brand + " " + name + " is already open.");
        }
    }

    public void close() {
        if (isCapOpen) {
            isCapOpen = false;
            System.out.println("Closed the pen cap of " + brand + " " + name);
        } else {
            System.out.println(brand + " " + name + " is already closed.");
        }
    }

    public boolean isCapOpen() {
        return isCapOpen;
    }
    
    public String getBrand() {
        return brand;
    }

    public abstract void write(String text);
}
