package Numbers;
import java.util.Scanner;
public class DigitFrequency {
    static void Digitfrequency(){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num=sc.nextInt();
    int[]freq=new int[10];
    if(num==0){
        freq[0]=1;
    }
        else{
            while(num>0){
                int digit=num%10;
            freq[digit]++;
            num=num/10;
            }
        }
        System.out.println("DigitFrequencys");
        for(int i=0;i<10;i++){
        if(freq[i]>0){
            System.out.println("Digits : "+i+", Occurs: "+freq[i]+"time(s)");
        }
        }
    }
public static void main(String[] args) {
    Digitfrequency();
}
}

   

