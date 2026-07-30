class Solution {
    public int magicalString(int n) {
        if (n <= 0)
            return 0;

        if (n <= 3)
            return 1;

        int[] a = new int[n + 2];
        a[0] = 1;
        a[1] = 2;
        a[2] = 2;

        int countOnes = 1;
        int read = 2;
        int write = 3;
        int current = 1;

        while (write < n) {
            int times = a[read];

            for (int k = 0; k < times && write < n; k++) {
                a[write] = current;
                if (current == 1)
                    countOnes++;
                write++;
            }

            current = 3 - current;
            read++;
        }

        return countOnes;
    }
}