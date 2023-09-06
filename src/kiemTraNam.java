import java.util.Scanner;

public class kiemTraNam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter year");
        year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Day la nam nhuan" + year);

                } else {
                    System.out.println("Day khong phai la nam nhuan" + year);
                }
            } else {
                System.out.println("Day la nam nhuan" + year);
            }
        } else {
            System.out.println("Day khong phai la nam nhuan" + year);
        }
    }
}
