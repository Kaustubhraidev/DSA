package DSA.bit_manipulation;
import java.util.*;
public class swap2no {
    public static void main(String [] args){
//        This swapping is done by using third variable
        System.out.println("Enter two no. which you want to swap between each other");
        Scanner kd = new Scanner(System.in);
        int a = kd.nextInt();
        int b = kd.nextInt();
        System.out.println("a : " +a+ " b : " +b);
//        int temp = a ;
//        a = b;
//        b = temp;
//        System.out.println("a is : " +a+ " b is : " +b);

//    Now, we swap without using any variable we just use XOR  operations
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("a : " +a+ " b : " +b);
    }
}
