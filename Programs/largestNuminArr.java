public class largestNuminArr {
    public static void main(String[]args){
        int[]value={1,3,5,90,87,86,7,8,90};
        int largest=value[0];
        int name=value.length;
        for(int i=0;i<name;i++){
            if(value[i]>largest){
                largest = value[i];
            }
            
        }
        System.out.println("the largest number is :"+largest);
        
    }    
}
