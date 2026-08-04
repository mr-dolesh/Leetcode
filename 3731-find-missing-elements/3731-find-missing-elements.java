class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        int last = nums[nums.length-1];
        int idx = 0;
        int first = nums[0];
        while(first < last){
            if(nums[idx] == first){
                first++;
                idx++;
                continue;
            } else{
                while(first < nums[idx]){
                    ans.add(first++);
                }
                idx++;
                first++;
            }
        } return ans;
    }
}