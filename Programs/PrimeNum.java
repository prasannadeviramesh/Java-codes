import java.util.*;
public class PrimeNum {
    public static void main (String[]args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int count=0;
        for(int i=2;i<=n;i++){
            if(n%i==0){
            count=count+1;
            }
        }
        if(count==1){
            System.out.println("The given number is Prime");
        }
        else{
            System.out.println("The given number not is Prime");
        }
    }
}
