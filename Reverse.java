import java.lang.*;
 
public class Reverse {
 
    public static void main(String args[])
    {
        StringBuffer sbf = new StringBuffer("Aliah University");
        System.out.println("String buffer = " + sbf);
       
        sbf.reverse();
        System.out.println("String buffer after reversing = " + sbf);
    }
}