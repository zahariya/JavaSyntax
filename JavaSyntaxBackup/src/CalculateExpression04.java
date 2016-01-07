import java.util.Scanner;

/**
 * Created by User on 16.10.2015 ã..
 */
public class CalculateExpression04 {
    public static void main(String[] args) {
        Scanner Console = new Scanner(System.in);
        System.out.println("Write 3 numbers on a different lines");
        float a = Float.parseFloat(Console.nextLine());
        float b = Float.parseFloat(Console.nextLine());
        float c = Float.parseFloat(Console.nextLine());

        float firstFormula = (float)(Math.pow(((a * a + b * b) / (a * a - b * b)), ((a + b + c) / Math.sqrt(c))));
        float secondFormula = (float)(Math.pow(((a * a + b * b) - c * c * c),(a-b)));

        float formulasAverage = (firstFormula + secondFormula)/2;
        float numbersAverage = (a + b + c)/3;

        float difference = Math.abs(numbersAverage-formulasAverage);

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", firstFormula, secondFormula, difference);

    }
}
