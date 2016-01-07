import java.util.*;
public class RandomizeNumbersFromNToM07 {
    public static void main(String[] args) {
        Scanner Console = new Scanner(System.in);
        System.out.println("Write 2 numbers on a different lines");
        int n = Integer.parseInt(Console.nextLine());
        int m = Integer.parseInt(Console.nextLine());
        int bigger = Math.max(n,m);
        int smaller = Math.min(n, m);

        List<Integer> result = new ArrayList<>();

        Random r = new Random();
        for (int i = smaller; i <= bigger; i++) {
            result.add(i);
        }

        Collections.shuffle(result);
        for (int i = 0; i < result.size(); i++) {
            System.out.printf("%d ", result.get(i));
        }
    }
}
