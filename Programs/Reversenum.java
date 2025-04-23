package Numbers;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        ReverseNumber();
    }
    static void ReverseNumber(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num =sc.nextInt();
        int Reverse=0;//store the reverse sns
        while(num>0){
            int digit=num%10;// extract last digit
            Reverse=Reverse*10+digit;
            num=num/10;// remove last digit

        }
        System.out.println("the reverse num is:" + Reverse);

    }
}
