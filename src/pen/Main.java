package pen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Interactive Pen Client ---");
        System.out.println("Select a Pen to use:");
        System.out.println("1. Ball Pen");
        System.out.println("2. Fountain Pen");
        System.out.print("Choice: ");
        
        int choice = 1;
        try {
            choice = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {}

        Pen pen;
        if (choice == 2) {
            Ink ink = new Ink("Black", "Water-based");
            pen = new FountainPen("Parker", "Vector", ink, NibType.ITALIC);
            System.out.println("You are now holding a Parker Vector Fountain Pen.");
        } else {
            Ink ink = new Ink("Blue", "Oil-based");
            Refill refill = new Refill(ink, NibType.ROUND, 0.5);
            pen = new BallPen("Trimax", "Standard", refill);
            System.out.println("You are now holding a Trimax Standard Ball Pen.");
        }

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Open Pen Cap (start)");
            System.out.println("2. Write Text");
            System.out.println("3. Close Pen Cap (close)");
            System.out.println("4. Refill Pen");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            String optStr = scanner.nextLine();
            int opt = -1;
            try {
                opt = Integer.parseInt(optStr);
            } catch (Exception e) {}

            switch (opt) {
                case 1:
                    pen.start();
                    break;
                case 2:
                    System.out.print("Enter text to write: ");
                    String text = scanner.nextLine();
                    pen.write(text);
                    break;
                case 3:
                    pen.close();
                    break;
                case 4:
                    if (pen instanceof BallPen) {
                        System.out.print("Enter refill color (e.g., Red): ");
                        String color = scanner.nextLine();
                        Ink newInk = new Ink(color, "Oil-based");
                        Refill newRefill = new Refill(newInk, NibType.ROUND, 0.5);
                        ((BallPen) pen).refill(newRefill);
                    } else if (pen instanceof FountainPen) {
                        System.out.print("Enter ink color (e.g., Blue): ");
                        String color = scanner.nextLine();
                        Ink newInk = new Ink(color, "Water-based");
                        ((FountainPen) pen).fillInk(newInk);
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
