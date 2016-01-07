import java.util.Scanner;


import java.util.Locale;
import java.util.Scanner;
public class FormattingNumbers03 {
    public static void main(String[] args) {
        Scanner Console = new Scanner(System.in);
        System.out.println("Write 3 numbers on a different lines");
        int a = Integer.parseInt(Console.nextLine());
        float b = Console.nextFloat();
        float c = Console.nextFloat();
        String binaryA = (String.format("%010d", Integer.parseInt(Integer.toBinaryString(a))));
        System.out.printf("|%-10X|%s|%10.2f|%-10.3f|", a,binaryA,b,c);
    }
}
