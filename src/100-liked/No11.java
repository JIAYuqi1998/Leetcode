public class No11 {
    public int maxArea(int[] height) {
        int size = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                size = Math.max(size, (j - i) * Math.min(height[i],height[j]));
            }
        }
        return size;
    }
}
