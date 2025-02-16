public class Reversestring {
        public static void main(String []args){
        String name ="prass";
        int length = name.length();
        char[]sis =name.toCharArray();
        for(int i=sis.length-1;i>=0;i--){
            System.out.print("");//char[i];
        }
        for(int i=name.length()-1;i>=0;i--){
            System.out.print(name.charAt(i));
        }
    }
}