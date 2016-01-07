import java.util.Scanner;

/**
 * Created by User on 15.10.2015 ã..
 */
public class TriangleArea02 {
    public static void main(String[] args) {
    Scanner Console = new Scanner(System.in);
        System.out.println("Write 3 couples of numbers");
        String firstCouple = Console.nextLine();
        String[] firstSplit = firstCouple.split(" ");
        int aX = Integer.parseInt(firstSplit[0]);
        int aY = Integer.parseInt(firstSplit[1]);

        String secondCouple = Console.nextLine();
        String[] secondSplit = secondCouple.split(" ");
        int bX = Integer.parseInt(secondSplit[0]);
        int bY = Integer.parseInt(secondSplit[1]);

        String thirdCouple = Console.nextLine();
        String[] thirdSplit = thirdCouple.split(" ");
        int cX = Integer.parseInt(thirdSplit[0]);
        int cY = Integer.parseInt(thirdSplit[1]);

        int result = ((aX*(bY-cY)) + (bX*(cY-aY)) + (cX*(aY-bY)))/2;

        if (result==0){
            System.out.println('0');
        }
        else{
            System.out.println(Math.abs(result));
        }

    }
}
