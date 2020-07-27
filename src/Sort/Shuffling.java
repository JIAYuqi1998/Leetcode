import java.util.Random;

public class Shuffling {
    public void shuffle(int[] a) {
        Random rd = new Random();
        for (int i = 0; i < a.length; i++) {
            int index = i + rd.nextInt(a.length - i);
            int temp = a[i];
            a[i] = a[index];
            a[index] = temp;
        }
    }
}
