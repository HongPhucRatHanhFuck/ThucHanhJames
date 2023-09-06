import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner inputWeight = new Scanner(System.in);
        Scanner inputHeight = new Scanner(System.in);
        System.out.println("ENTER Weight: ");
        int weight = inputWeight.nextInt();
        System.out.println("ENTER HEIGHT: ");
        int height = inputHeight.nextInt();
        double SRectangle = weight * height;
        System.out.println("S RECTANGLE IS: " + SRectangle);
    }
}
