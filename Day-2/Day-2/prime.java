import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("ENTER A NUMBER : ");
        num = sc.nextInt();
        int i = 2;
        while(i<num){
            if(num%i==0)
                break;
            else
                i++;
            
        }
        if(i==num){
            System.out.println("PRIME NUMBER");
        }else{
            System.out.println("NOT PRIME.");

        }
        sc.close();
    }
}
