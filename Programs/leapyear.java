import java.util.Scanner;
public class leapyear {
    public static void main(String []args){
        Scanner value =new Scanner(System.in);
        int  year = value.nextInt();
        
        if((year %4==0) && (year%100!=0) || (year%400==0)){
            System.out.println("given year is leap year");
        }
        else{
            System.out.println("given year is Not leap year");

        }
    }
}
