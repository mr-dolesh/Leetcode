class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder dolesh = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            int remainder = columnNumber%26;
            dolesh.append((char) ('A' + remainder));

            columnNumber /= 26;
        }

        return dolesh.reverse().toString();
    }
}