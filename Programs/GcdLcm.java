package Numbers;
import java.util.Scanner;
public class GcdLcm{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter First number : ");
       int a=sc.nextInt();
       System.out.println("Enter second number : ");
       int b=sc.nextInt();
       int tempB=b;
       int tempA=a;
       while(b!=0){
        int temp=b;
        b=a%b;
        a=temp;
       }
       int GCD=a;
       int lcm=tempA*tempB/GCD;
       System.out.println("GCD of " + tempA+ " and " + tempB+ " is: " + GCD);
       System.out.println("LCM of " + tempA + " and " + tempB + " is: " + lcm);
    }
}
