import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetFirstOddEvenElements13 {
    public static void main(String[] args) {
        Scanner Console = new Scanner(System.in);
        System.out.println("Write numbers separeted by space and command onn a different line");

        String input = Console.nextLine();
        String[] inputSplit = input.split(" ");

        String[] command = Console.nextLine().split(" ");
        int count = Integer.parseInt(command[1]);
        String type = command[2];

        int countSec = 0;
     //   List<Integer> resultOdd = new ArrayList<Integer>();
     //  List<Integer> resultEven = new ArrayList<Integer>();

        for (int i = 0; i < inputSplit.length; i++) {
            int number = Integer.parseInt(inputSplit[i]);
            if ((number % 2 != 0 && type.equals("odd") || (number % 2 == 0 && type.equals("even")))) {
                if (countSec < count) {
                    System.out.printf("%s ", number);
                    countSec++;
                } else {
                    break;
                }
            }
        }
    }
}

//                if (type.equals("odd") && number % 2 !=0 ){
//                    resultOdd.add(number);
//                    countSec++;
//                    if (countSec >= count){
//                        break;
//                    }
//                }
//                else if (type.equals("even") && number % 2 == 0) {
//                    resultEven.add(number);
//                    countSec++;
//                    if (countSec >= count){
//                        break;
//                    }
//                }
//            }
//        if (type.equals("odd")) {
//            for (int i = 0; i < resultOdd.size(); i++) {
//                System.out.printf("%s ",resultOdd.get(i));
//            }
//        }
//        else if(type.equals("even")){
//            for (int i = 0; i < resultEven.size(); i++) {
//                System.out.printf("%s ",resultEven.get(i));
//            }
//        }

