public class RemoveNonAlpha {
    public static void main(String[]args){
        String value ="San$3*";
        String result ="";
        int value1= value.length();
        for( int i=0;i<value1;i++){
           char name =value.charAt(i);
           if((name >='a' && name<='z' ) || (name >='A' && name<='Z') || (name >='0' && name<='9') ){
            result+=name;
           }
        }
        System.out.println(result);
        
    }
    
}
