package DSA;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class factoriallargeno {
    public void multiply(List<Integer> nums, int[] size, int multiplier){
        int carry = 0;
        for(int i =0; i<size[0]; i++){
            int result = (multiplier * nums.get(i) + carry);
            nums.set(i, result % 10);
            carry = result/10;
        }
        while (carry>0){
            nums.set(size[0], carry%10);
            size[0]++;
            carry /= 10;
        }
    }
    public List<Integer> factorial(int N){
        List<Integer> nums = new ArrayList<>();
        for(int i=0; i<10000; i++){
            nums.add(0);
        }
        nums.set(0, 1);
        int[] size = {1};
        for(int multiplier = 2; multiplier <= N; multiplier++){
            multiply(nums, size, multiplier);
        }
        List<Integer> result = new ArrayList<>();
        for(int i=size[0]-1; i>=0; i--){
            result.add(nums.get(i));
        }
        return result;
    }

    public static void main(String[] args) {
        factoriallargeno sl = new factoriallargeno();
        int N = 100;
        List<Integer> result = sl.factorial(N);
        System.out.println("factorial of" +N+ " is ");
        for(int digit: result){
            System.out.print(digit);
        }
    }
}
