class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        for(int i=0; i<s.length(); i++){
            int c = s.charAt(i) - 'a';
            ans = ans + (26-c)*(i+1);
        } return ans;
    }
}