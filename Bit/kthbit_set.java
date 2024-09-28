package DSA.bit_manipulation;
import java.util.Scanner;
import java.lang.String;

public class kthbit_set {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. whose kth bit are set are not");
        int n = sc.nextInt();
        System.out.println("enter the kth position");
        int pos = sc.nextInt();

        if((n & (1<<pos)) != 0){
            System.out.println("The bit is set already...");
        }else{
            System.out.println("The bit is not set...... ");
        }

    }

}
