import java.util.Scanner;

public class CharacterMultiplier12 {
    public static void main(String[] args) {
        Scanner Console = new Scanner(System.in);
        System.out.println("Write two strings seperated by space");

        String firstString = Console.next();
        String secondString = Console.next();

        Long totalSum = 0L;
        for (int i = 0; i < firstString.length(); i++) {
            totalSum += firstString.charAt(i) * secondString.charAt(i);
        }
        Long totalSumOfRemainder = 0L;
        if(firstString.length() > secondString.length()) {
            String remainder = firstString.substring(secondString.length());
            for (int i = 0; i < remainder.length(); i++) {
                totalSumOfRemainder += remainder.charAt(i);
            }
        } else  if(secondString.length() > firstString.length()) {
            String remainder = secondString.substring(firstString.length());
            for (int i = 0; i < remainder.length(); i++) {
                totalSumOfRemainder += remainder.charAt(i);
            }
        }
        totalSum += totalSumOfRemainder;
        System.out.println(totalSum);
    }
}