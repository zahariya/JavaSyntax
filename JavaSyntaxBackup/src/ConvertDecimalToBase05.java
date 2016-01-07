import java.util.Scanner;

public class ConvertDecimalToBase05 {
    public static void main(String[] args) {
        Scanner Console = new Scanner(System.in);
        System.out.println("Write the number to be converted");
        Integer number = Console.nextInt();
        System.out.print(Integer.toString(number, 7));
    }
}
