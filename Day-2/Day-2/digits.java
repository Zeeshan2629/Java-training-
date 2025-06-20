import java.util.*;

public class digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int num = sc.nextInt();
        while (num != 0) {
            int digit = num % 10;
            num = num / 10;
            System.out.println(digit);
        }
    }
}
