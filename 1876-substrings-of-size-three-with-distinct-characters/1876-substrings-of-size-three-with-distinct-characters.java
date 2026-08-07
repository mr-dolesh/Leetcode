class Solution {
    public int countGoodSubstrings(String s) {
        int n = s.length();
        int count = 0;
        int i = 0;

        for(int j=0; j<n; j++){
            if(j-i+1 == 3){
                char a = s.charAt(i);
                char b = s.charAt(i+1);
                char c = s.charAt(i+2);

                if(a !=b && b != c && a != c){
                    count++;
                }
                i++;
            }
        } return count;
    }
}