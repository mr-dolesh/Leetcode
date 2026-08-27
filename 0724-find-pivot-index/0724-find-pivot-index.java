class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;

        if(n == 3){
            for(int i=0; i<n; i++){
                if(nums[i]<0){
                    return 0;
                }
            }
        } 

        int totalSum = 0;
        for(int i : nums){
            totalSum += i; 
        }

        int leftSum = 0;

        for(int i=0; i<n; i++){
            int rightSum = totalSum - leftSum - nums[i];

            if(leftSum == rightSum){
                return i;
            }
            leftSum += nums[i];
        } 
        return -1;




    }
}