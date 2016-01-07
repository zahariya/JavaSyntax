import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MagicExchangeableWords14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write 2 strings");

        String stringA = scanner.next();
        String stringB = scanner.next();
        System.out.println(FindWords(stringA, stringB));
    }

    private static boolean FindWords(String strA, String strB) {
        Map<Character, Character> result = new HashMap<>();

        for (int i = 0; i < strA.length(); i++) {
            char A = strA.charAt(i);
            char B = strB.charAt(i);

            if (result.containsKey(A)) {
                if (result.get(A) != B) {
                    return false;
                }
            } else {
                if (result.containsValue(B)) {
                    return false;
                }

                result.put(A, B);
            }
        }

        return true;
    }
}