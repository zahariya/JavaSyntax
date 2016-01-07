import java.util.Scanner;

/**
 * Created by User on 16.10.2015 ã..
 */
public class ConvertBaseToDecimal06 {
    public static void main(String[] args) {

        Scanner Console = new Scanner(System.in);
        System.out.println("Write the number to be converted");
        String number = Console.nextLine();
        Integer decimalRepresentation = Integer.valueOf(number, 7);
        System.out.println(decimalRepresentation);
    }
}
