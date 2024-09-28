package DSA.bit_manipulation;
import java.util.*;

public class convertdectobin {
    public static void main(String [] args){
        System.out.println("Enter the number which you want to convert");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        Shortest method to convert  into binary
//        String binarynum = Integer.toBinaryString(n);
//        System.out.println(binarynum);

        String result = "";
        while(n > 0) {
            int remainder = n % 2;
            result = remainder + result;
            n /= 2;
        }
        System.out.println(result);
    }
}
