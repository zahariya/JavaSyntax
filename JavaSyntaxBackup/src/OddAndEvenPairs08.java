import java.util.Scanner;

public class OddAndEvenPairs08 {
    public static void main(String[] args) {
        Scanner Console = new Scanner(System.in);
        System.out.println("Write numbers seperated by space");
        String input = Console.nextLine();
        String[] inputSplit = input.split(" ");

        if (inputSplit.length % 2 == 0){
            for (int i = 0; i <inputSplit.length ; i++) {
                int firstNum = Integer.parseInt(inputSplit[i]);
                int secNum = Integer.parseInt(inputSplit[i+1]);

                if (firstNum % 2 == 0 && secNum % 2 ==0) {
                    System.out.printf("%d, %d -> both are even\n", firstNum,secNum);
                }
                else if(firstNum % 2 != 0 && secNum % 2 !=0){
                    System.out.printf("%d, %d -> both are odd\n", firstNum, secNum);
                }
                else{
                    System.out.printf("%d, %d -> different\n", firstNum, secNum);
                }
                i++;
            }
        }
        else{
            System.out.println("Invalid length");
        }
    }
}
