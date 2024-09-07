package DSA;

public class trapped_water42 {
//    Method to get the left maximum values
    public int[] getLeftMax(int [] height, int n){
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i<n; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }
        return leftMax;
    }

//    Method to get the right maximum values
    public int[] getRightMax(int[] height, int n){
        int[] rightMax = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i>=0; i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }
        return rightMax;
    }

//    Method to calculate trapped water
    public int trap(int[] height){
        int n = height.length;
        if(n==1 || n==0)
            return 0;
        int[] leftMax = getLeftMax(height, n);
        int[] rightMax = getRightMax(height, n);
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return sum;
    }

//    Main method to test the solution
    public static void main(String args[]){
        trapped_water42 sol = new trapped_water42();

//        Example test case
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int trapwater = sol.trap(height);
        System.out.println("Trapped water " + trapwater);
    }
}
