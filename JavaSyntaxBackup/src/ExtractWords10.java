import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractWords10 {
    public static void main(String[] args) {
        System.out.println("Write the text");
        Scanner Console = new Scanner(System.in);
        String text = Console.nextLine();

        Pattern regex = Pattern.compile("([A-Za-z]+)");
        Matcher match = regex.matcher(text);

        while (match.find()){
            System.out.print(match.group(0) + " ");
        }
    }
}
