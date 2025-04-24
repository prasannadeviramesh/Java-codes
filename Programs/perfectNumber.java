package Numbers;
import java.util.Scanner;
public class perfectNumber {
    static void perfectnum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        int orginal=num;
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
             sum+=i;
            }
        }
        if(orginal==sum){
            System.out.println( num +" : this is perfect number");
        }
        else{
            System.out.println(num+" : this is not a perfectnumber");
        }
        }
    public static void main(String[]args){
        perfectnum();
    
    }
    }

    

