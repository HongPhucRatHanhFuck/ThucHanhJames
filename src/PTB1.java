import java.util.Scanner;

public class PTB1 {
    public static void main(String[] args) {
        System.out.println("Giai phuong trinh bac nhat: 'a * x + b = c', hay nhap so a, b ,c");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so a");
        double a = scanner.nextDouble();
        System.out.println("Nhap so b");
        double b = scanner.nextDouble();
        System.out.println("Nhap so c");
        double c = scanner.nextDouble();

        if (a !=0){
            double answer = (c - b) / a;
            System.out.println("Phuong trinh co 1 nghiem duy nhat" + answer);
        } else {
            if (b == c){
                System.out.println("Phuong luon co nghiem voi moi x");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }

    }
}
