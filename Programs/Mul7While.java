package Numbers;

public class Mul7While {
    public static void main(String[] args) {
        int n=7;
        int i=0;
        while(i<=1000){
            if(i%n==0){
                System.out.println(i);
            }
            i++;
        }
        
    }
    
}
