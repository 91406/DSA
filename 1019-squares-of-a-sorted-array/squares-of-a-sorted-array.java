import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        int left = 0;         
        int right = n - 1;  
        int pos = n - 1;       
        
        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            
            if (leftSquare > rightSquare) {
                result[pos--] = leftSquare;
                left++;
            } else {
                result[pos--] = rightSquare;
                right--;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] nums1 = {-4, -1, 0, 3, 10};

        int[] nums2 = {-7, -3, 2, 3, 11};
        
     System.out.println("Output 1:" + Arrays.toString(sol.sortedSquares(nums1)));
        System.out.println("Output 2:" + Arrays.toString(sol.sortedSquares(nums2)));
    }
}
