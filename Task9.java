import java.util.Scanner;

public class Task9 {
    public static void main(String[] args){
        Scanner java = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char sign = java.next().charAt(0);
        Day11 main9 = new Day11();
        main9.Sv9(sign);
    }
}
