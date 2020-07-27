public class Insertion {
    public void insertion(int[] a){
        int len = a.length;
        for (int i = 1; i < len; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
    }
}
