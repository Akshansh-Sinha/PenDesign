package pen;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Pen Design Client ---");

        Ink blueInk = new Ink("Blue", "Oil-based");
        Refill blueRefill = new Refill(blueInk, NibType.ROUND, 0.5);

        Pen trimsBallPen = new BallPen("Trimax", "Standard", blueRefill);
        trimsBallPen.write("Hello World!"); // Should prompt to open

        trimsBallPen.start();
        trimsBallPen.write("Hello World! This is a SOLID Pen Design.");
        trimsBallPen.close();

        System.out.println();

        Ink blackInk = new Ink("Black", "Water-based");
        FountainPen parker = new FountainPen("Parker", "Vector", null, NibType.ITALIC);

        parker.start();
        parker.write("Trying to write without ink..."); // Should prompt no ink
        parker.fillInk(blackInk); // Refill action
        parker.write("Beautiful calligraphy with my Parker Fountain Pen!");
        parker.close();
    }
}
