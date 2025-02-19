import java.util.*;
public class Fibonaciseries {
    public static void main(String[]args){
        Scanner sh=new Scanner(System.in);
        int n =sh.nextInt();
        int num1=0;
        int num2=1;
        for(int i=0;i<n;i++){
        int num3=num1+num2;
        num1=num2;
        num2=num3;
        System.out.println(num2);
        }

    }
    
}
