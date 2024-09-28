package DSA.bit_manipulation;
import java.util.Scanner;
public class bit_flips {
    public static void main (String [] args){
        System.out.println("Enter a start no.");
        Scanner kd = new Scanner(System.in);
        int start = kd.nextInt();
        System.out.println("enter a goal no.");
        int end = kd.nextInt();
        int n = start ^ end;
        int count = 0;
        for(int i= 0; i<=31; i++){
            if(((1 << i) & n) !=0){
                count = count + 1;

            }
        }
        System.out.println("The no. of bit flip to achieve goal is:- " + count);

//        The time complexity in this is logarithmic base 2 (START ^ GOAL)
//    Space complexity is 1
    }
}
