package DSA.bit_manipulation;
import java.util.*;

public class clearupdatebit {
    public static void main(String [] args) {
//        System.out.println("Clear bit");
//        int n=5;
//        int pos=2;
//        int bitmask= 1<<pos;
//        int notbitmask = ~(bitmask);
//
//        int newno = notbitmask & n;
//        System.out.println(newno);

        System.out.println("update bit");
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        int n=5; // 0101
        int pos=1;
//        int oper=1;  update bit to 1 else update bit to 0
        int bitmask = 1<<pos;
        if(oper == 1){
//            set
            int newno = bitmask | n;
            System.out.println(newno);
        }else{
//            clear
            int newbit = ~(bitmask);
            int newnom = newbit & n;
            System.out.println(newnom);
        }

    }
}
