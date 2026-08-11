class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        Set<Integer> arr = new HashSet<>(n);

        for(int i : nums){
            arr.add(i);
        }
        int sum = nums[0];

        for(int i=1; i<n; i++){
            if(nums[i] == nums[i-1] + 1){
                sum += nums[i];
            } else{
                break;
            }
        }
        while(arr.contains(sum)){
            sum++;
        }
        return sum;

        
    }
}