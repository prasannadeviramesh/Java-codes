package Numbers;
import java.util.Scanner;
public class Factorial {
    public static void main(String args[]){ 
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num= sc.nextInt();
        int result= factorial(num);
       System.out.println("Given number factorial is : "+ result);
    } 
       static int factorial(int num){ 
        if(num==0 || num==1){
            return 1;
        }
        else{
            return num*factorial(num-1);
            }
        }
    }
 //easy method for using forloop
       /*int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println(fact);
        }*/
    
