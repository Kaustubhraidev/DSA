package DSA.array;

import java.util.Arrays;

public class product_except_self {
    public int[] productExceptSelf(int [] num){
        int[] result = new int[num.length];
        Arrays.fill(result, 1);
        int pre = 1, post = 1;
        for(int i=0; i<num.length; i++){
            result[i] = pre;
            pre = num[i]*pre;
        }
        for(int i = num.length-1; i>=0; i--){
            result[i] = result[i]*post;
            post = post*num[i];
        }
        return result;
    }
    public static void main(String [] args){

    }

}
