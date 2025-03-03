public class Armstrong {
    public static void main(String[] args) {
        int num=153,sum=0,temp=num;
        while(num>0){
            int digit=num%10;
            int cube =digit*digit*digit;
            sum=sum+cube;
            num=num/10;
        }
        num=temp;
        if(num==sum){
        System.out.println(sum);
        }
    }
}
