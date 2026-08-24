import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner java = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = java.nextInt();
        System.out.print("Enter a character: ");
        char sign = java.next().charAt(0);
        Day11 main10 = new Day11();
        main10.Sv10(n,sign);
    }
}