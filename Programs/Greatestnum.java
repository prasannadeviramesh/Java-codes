public class Greatestnum {

    public static void main(String[]args){
        int num=123;
        int big=0;
        while(num>0){
            int digit =num%10;
            if(digit>big){
                big=digit;
                num=num/10;
                System.out.println(big);
            }
        }
}
}