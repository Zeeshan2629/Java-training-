public class first50 {
   public static void main(String[] args) {
    int count = 50;
    int j = 1;
    while(j<=count){
        int i = 2;
        while(i<j){
            if(j%i==0)
                break;
            else
                i++;
            
        }
        if(i==j){
            System.out.println("PRIME NUMBER " + j);
        }
        j++;
    }
   } 
}
