import java.util.Scanner; 
public class CountNonAlpha {
public static void main(String[]args){
    Scanner sh=new Scanner(System.in);
    System.out.println("Enter a word:");
    String word=sh.nextLine();
    int len=word.length();
    int count=0;
    for(int i=0;i<len;i++){
        char name=word.charAt(i);
        if(!((name >='a' && name<='z') || (name>='A' && name<='Z' )  || (name>= '0' && name<='9'))){
            count++;
        }
    }
System.out.println("Non AlphaNumeric char count:"+count);  
sh.close();
}
}