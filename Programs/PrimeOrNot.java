import java.util.*;
public class PrimeOrNot {
    public static void main (String[]args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
            count++;
            }
        }
        if(count==2 || count==1 ){
            System.out.println("The given number is Prime");
        }
        else{
            System.out.println("The given number not is Prime");
        }
    }
}
