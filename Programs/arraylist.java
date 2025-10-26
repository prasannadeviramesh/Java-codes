import java.util.*;
public class Main{
    public static void main (String [] args){
        ArrayList<String>stu=new ArrayList<String>();
        stu.add("Prasanna");
        stu.add("sahana");
        stu.add("sanjana");
        stu.add("saritha");
        stu.add("ramesh");
        System.out.println("Names : " + stu);
        System.out.println("Totalstudents : " + stu.size());
        stu.remove("Prasanna");
        stu.add(3,"saho");
        stu.set(4,"vasantha");
        System.out.println("Names : " + stu);
        for(String name: stu){
            System.out.println(name);
        }
        System.out.println(stu.get(3));
        
        
    }
}
