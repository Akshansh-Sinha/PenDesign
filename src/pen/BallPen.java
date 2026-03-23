package pen;

public class BallPen extends Pen implements Refillable {
    private Refill refill;

    public BallPen(String brand, String name, Refill refill) {
        super(brand, name);
        this.refill = refill;
    }

    @Override
    public void write(String text) {
        if (!isCapOpen()) {
            System.out.println("Please start() / open the " + getBrand() + " pen first.");
            return;
        }
        if (refill == null || refill.getInk() == null) {
            System.out.println("No ink in the refill.");
            return;
        }
        System.out.println("Writing with BallPen (" + refill.getInk().getColor() + "): " + text);
    }

    @Override
    public void refill(Refill newRefill) {
        this.refill = newRefill;
        System.out.println("BallPen has been refilled with a new " + newRefill.getInk().getColor() + " refill.");
    }
}
