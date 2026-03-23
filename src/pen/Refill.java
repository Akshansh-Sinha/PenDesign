package pen;

public class Refill {
    private Ink ink;
    private NibType nibType;
    private double radius;

    public Refill(Ink ink, NibType nibType, double radius) {
        this.ink = ink;
        this.nibType = nibType;
        this.radius = radius;
    }

    public Ink getInk() { return ink; }
    public NibType getNibType() { return nibType; }
    public double getRadius() { return radius; }
}
