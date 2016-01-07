import java.util.Scanner;

public class HitTarget09 {
    public static void main(String[] args) {
        Scanner Console = new Scanner(System.in);
        System.out.println("Write a number");
        int target = Integer.parseInt(Console.nextLine());

        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i + j  == target){
                    System.out.printf("%s + %s = %s\n",i,j,target);
                }
                if(i-j == target){
                    System.out.printf("%s - %s = %s\n",i,j,target);
                }
            }
        }
    }
}
