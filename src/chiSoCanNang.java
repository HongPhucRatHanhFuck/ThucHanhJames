import java.util.Scanner;

public class chiSoCanNang {
    public static void main(String[] args) {
        System.out.println("Vui long nhap can nang");
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Nhap so can nang: ");
        weight = scanner.nextDouble();
        System.out.println("Nhap chieu cao: ");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.println("bmi");

        if(bmi < 18.5){
            System.out.println(bmi + " Underweight" );
        } else if (bmi< 25.0 && bmi >= 18.5) {
            System.out.println(bmi + " Normal");
        } else if (bmi <30.0 && bmi >= 25.0) {
            System.out.println(bmi + "Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
