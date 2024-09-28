package DSA.bit_manipulation;
import java.util.Scanner;
public class checkiset {
    public static void main (String [] args){
        System.out.println("Enter a no. ");
        Scanner kd = new Scanner(System.in);
        int n = kd.nextInt();
        System.out.println("Enter a position");
        int k = kd.nextInt();
//        if(((1 << k) & n) != 0) {
//            System.out.println("Set");
//        }else System.out.println("not set");

//        this is done by using right shift operator
        if(((n >> k) & 1) != 0) System.out.println("set");
        else System.out.println("not set");
    }
}
