public class testSort {
    public static void main(String[] args) {
        shellSort test = new shellSort();
        int[] a = new int[] {10,4,7,2,3};
        test.shellSort(a);
        System.out.println(a);
    }
}
