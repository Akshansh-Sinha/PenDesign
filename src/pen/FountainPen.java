package pen;

public class FountainPen extends Pen {
    private Ink ink;
    private NibType nibType;

    public FountainPen(String brand, String name, Ink ink, NibType nibType) {
        super(brand, name);
        this.ink = ink;
        this.nibType = nibType;
    }

    @Override
    public void write(String text) {
        if (!isCapOpen()) {
            System.out.println("Please start() / open the " + getBrand() + " fountain pen first.");
            return;
        }
        if (ink == null) {
            System.out.println("No ink in the fountain pen.");
            return;
        }
        System.out.println("Writing smoothly with FountainPen using " + ink.getColor() + " ink: " + text);
    }

    public void fillInk(Ink ink) {
        this.ink = ink;
        System.out.println("Fountain pen has been refilled with " + ink.getColor() + " ink directly.");
    }
}
