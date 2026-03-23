package pen;

public class Ink {
    private String color;
    private String type; // e.g., Water-based, Oil-based

    public Ink(String color, String type) {
        this.color = color;
        this.type = type;
    }

    public String getColor() { return color; }
    public String getType() { return type; }
}
