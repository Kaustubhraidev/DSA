package DSA;
import java.util.*;
import java.util.Scanner;

public class two_sum167 {
    public int[] twoSum(int[] numbers, int target){
        int i=0, j=numbers.length -1 ;
        while(i < j){
            if(numbers[i] + numbers[j] == target){
                return new int[]{i + 1, j+1};
            }
            if(numbers[i] + numbers[j] > target){
                j--;
            }else{
                i++;
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        two_sum167 sol = new two_sum167();
        int u;
        System.out.println("Enter the size of an array");
        Scanner sc = new Scanner(System.in);
        u = sc.nextInt();
        int numbers[]  = new int[u];
        for (int i=0; i<u; i++){
            numbers[i] = sc.nextInt();
        }
        int tar;
        System.out.println("Enter the target");
        tar = sc.nextInt();

        int[] result = sol.twoSum(numbers, tar);

        if(result.length > 0 ){
            System.out.println("position" + result[0] + " and " + result[1]);
        } else{
            System.out.println("no solution found");
        }
    }
}
