import java.util.*;

public class alternate {
    public static void main(String[] args) {
        System.out.println("PRINTING ALTERNATE PRIME NUMBERS:");
        int num = 101;
        int count = 0;

            for (int i = 2; i <= num; i++) {
                if (isPrime(i)) {
                    if (count % 2 == 0) {
                        System.out.println(i + " IS A PRIME NUMBER.");
                    }
                    count++;

                }
            }
        }


    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
