import java.util.Scanner;

/**
 * Created by User on 19.10.2015 ã..
 */
public class RectangleArea01 {
    public static void main(String[] args) {
        System.out.println("Write 2 numbers on a single line-seperated");
        Scanner Console = new Scanner(System.in);
        String[] input = Console.nextLine().split(" ");
        int firstNumber = Integer.parseInt(input[0]);
        int secondNumber = Integer.parseInt(input[1]);
        int result = firstNumber*secondNumber;
        System.out.println(result);
    }
}
