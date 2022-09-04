import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers you wanna Enter: ");
        int n = sc.nextInt();
        System.out.println("Enter the String of Numbers");
        sc.nextLine();
        String s = sc.nextLine();

        StringCalculator ob = new StringCalculator();
        System.out.println(ob.add(s, n));

    }

    static class StringCalculator {

        int add(String numbers, int n) {
            int sum = 0;
            String num[] = numbers.split(",");
            for (int i = 0; i < num.length; i++) {
                sum += convert(num[i]);
            }

            return sum;
        }
    }

    static int convert(String a) {
        int sum = 0;
        if (a.charAt(0) >= 'a' && a.charAt(0) <= 'z') {
            int temp = a.charAt(0) - 'a' + 1;
            sum += temp;
        } else {
            int temp = Integer.parseInt(a);
            if (temp < 0) {
                throw new IllegalArgumentException("you can not enter negative numbers" + temp);
            }
            if (temp <= 1000) {
                sum += temp;
            }

        }
        return sum;

    }

}
