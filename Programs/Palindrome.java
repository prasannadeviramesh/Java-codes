public class Palindrome {
    public static void main(String []args){
        String orginal="madam";
        String reverse="";
        int len=orginal.length();
        for(int i=len-1;i>=0;i--){
            reverse=reverse+(orginal).charAt(i); 
        }
        if(reverse.equals(orginal)){
            System.out.println(orginal+"-is a palindrome");
        }
        else{
            System.out.println(orginal+"-is not a palindrome");
        }
    }
}
