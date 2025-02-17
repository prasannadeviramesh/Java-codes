public class printlargestnum{
    public static void main(String[]args){
        int num1=19;
        int num2=25;
        int num3=60;
        int largest;
        if((num1>=num2) &&(num1>=num2) && (num1>=num3)){
           largest =num1;
        }
        else if ((num2>=num1) && (num2>=num3)){
            largest =num2;
        }
        else{
            largest=num3;
        }
        System.out.println(largest);
    }
}
