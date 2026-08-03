class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> Dolesh = new HashMap<>();

        for(int i=0; i<magazine.length(); i++){
            char c = magazine.charAt(i);

            if(!Dolesh.containsKey(c)){
                Dolesh.put(c,1);
            } else {
                Dolesh.put(c, Dolesh.get(c) + 1);
            }
        }

        for(int i=0; i<ransomNote.length(); i++){
            char c = ransomNote.charAt(i);

            if(Dolesh.containsKey(c) && Dolesh.get(c)>0){
                Dolesh.put(c, Dolesh.get(c)-1);
            }else{
                return false;
            }
        }
        return true;
    }
}