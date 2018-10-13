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
        int[] retorna = new int[a.length];
        if (k > 0) {
            boolean primeiraVez = true;
            int ultimaPosicao = a[a.length - k - 1];
            int index = a.length - k + 1;
            for (int i = 0; i < a.length - 1; i++) {
                if (primeiraVez) {
                    retorna[i] = a[a.length - k];
                    primeiraVez = false;
                } else {
                    if (index > a.length - 1) {
                        index = 0;
                    }
                    retorna[i] = a[index];
                    index++;
                }
            }
            retorna[retorna.length - 1] = ultimaPosicao;
        } else {
            retorna = a;
        }
        for (int it = 0; it < queries.length; it++) {
            queries[it] = retorna[queries[it]];
        }
        return queries;
    }
}
