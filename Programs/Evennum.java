import java.util.Scanner;
class Evennum{
    public static void main(String []args){
        Scanner num = new Scanner(System.in);
         int sum =num.nextInt();
        if(sum %2 == 0){
            System.out.println( "Given number is a Even ");
        }
        else{
            System.out.println("Given number is a not a Even  ");
        }
    }
}