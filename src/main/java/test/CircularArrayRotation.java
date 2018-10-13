package test;

public class CircularArrayRotation {

    public int[] circularArrayRotation(int[] a, int k, int[] queries) {
        while (true) {
            if (k > a.length - 1) {
                k = k - (a.length);
            } else {
                break;
            }
        }
        int[] numbers = new int[a.length];
        if (k > 0) {
            boolean first = true;
            int lastPosition = a[a.length - k - 1];
            int index = a.length - k + 1;
            for (int i = 0; i < a.length - 1; i++) {
                if (first) {
                    numbers[i] = a[a.length - k];
                    first = false;
                } else {
                    if (index > a.length - 1) {
                        index = 0;
                    }
                    numbers[i] = a[index];
                    index++;
                }
            }
            numbers[numbers.length - 1] = lastPosition;
        } else {
            numbers = a;
        }
        for (int it = 0; it < queries.length; it++) {
            queries[it] = numbers[queries[it]];
        }
        return queries;
    }
}
