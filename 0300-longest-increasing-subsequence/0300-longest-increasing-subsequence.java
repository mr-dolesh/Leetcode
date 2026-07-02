class Solution {
    public int lengthOfLIS(int[] nums) {
        
        int[] t = new int[nums.length];
        int count = 0;

        for(int i: nums){
            int l=0, h=count;
            while(l != h){
                int m = (l+h)/2;
                if(t[m]<i){
                    l = m+1;
                }
                else{
                    h = m;
                }

            }
            t[l] = i;
            if(l == count) ++count;
        }
        return count;

    }
}