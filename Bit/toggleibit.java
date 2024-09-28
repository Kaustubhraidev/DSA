package DSA.bit_manipulation;
import java.util.*;

public class toggleibit {
    public static void main(String [] args){
        System.out.println("Enter a number");
        Scanner kd = new Scanner(System.in);
        int n = kd.nextInt();
        System.out.println("Enter the position");
        int k = kd.nextInt();
        System.out.println(n ^ ( 1<<k));
//        ^ is a XOR operator
    }
}
