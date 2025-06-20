import java.util.*;
public class rangee {
    public static void main(String[] args){
        int start,end;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE START AND END OF YOUR RANGE : ");
        start = sc.nextInt();
        end = sc.nextInt();
        for(int i = start ; i<=end ; i++){
            int j = 2;
            while(j<i){
                if(i%j==0)
                    break;
                j++;
            }
            if(i==j){
                System.out.println(i +" IS A PRIME NUMBER");
            }
        }

    }
}
