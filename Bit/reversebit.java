package DSA.bit_manipulation;
import java.util.Scanner;

public class reversebit {
    public static void main(String [] args){
        System.out.println("Enter a no. which you want to reverse");
        Scanner kd = new Scanner(System.in);
        int n = kd.nextInt();
        int k = n & n -1;
        String binarynum = Integer.toBinaryString(k);
        System.out.println(binarynum);
//        System.out.println(n & n -1);
    }
}
