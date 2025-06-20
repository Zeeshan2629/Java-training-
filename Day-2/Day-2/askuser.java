import java.util.*;
public class askuser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean flag = true;
        do {
            System.out.println("ENTER A NUMBER : ");
            num = sc.nextInt();
            int i = 2;
            while (i < num) {
                if (num % i == 0)
                    break;
                i++;

            }
            if (i == num) {
                System.out.println(num + " IS A PRIME NUMBER.");
            } else {
                System.out.println(num + " IS NOT A PRIME NUMBER.");
            }

            System.out.println("PRESS Y TO CONTINUE : ");
            char ch = sc.next().charAt(0);
            if(ch=='y' || ch=='Y'){
                flag = true;
            }else{
                flag = false;
            }

        }while(flag);

    }
}