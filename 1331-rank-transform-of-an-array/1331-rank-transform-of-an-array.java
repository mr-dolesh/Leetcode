class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] copyArr = arr.clone();
        Arrays.sort(copyArr);

        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;

        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(copyArr[i])) {
                map.put(copyArr[i], rank++);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }
}