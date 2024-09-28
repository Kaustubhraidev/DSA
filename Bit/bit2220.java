package DSA.bit_manipulation;

public class bit2220 {
    public static void main(String[] args){
        int start = 10;
        int goal = 7;
        System.out.println(minBitFlips(start, goal));

    }
    public static int minBitFlips(int start, int goal){
        int xor = start ^ goal;
//        count the number of 1s in the xor result (hamming weight)
        int count = 0;
        while(xor != 0){
            count += xor & 1;
            xor >>=1;
        }
        return count;
    }
}