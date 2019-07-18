import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        double d = scan.nextDouble();
        //String s = scan.next(Pattern.compile("\\w+"));
        String s = scan.next(Pattern.compile("\\s+", Pattern.CASE_INSENSITIVE));

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
