public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;

        for (int i = 0; i < len; i++) {
            if (flowerbed[i] == 0) {
                boolean leftEmpty = (i == 0) || (flowerbed[i - 1] == 0);
                boolean rightEmpty = (i == len - 1) || (flowerbed[i + 1] == 0);

                if (leftEmpty && rightEmpty) {
                    flowerbed[i] = 1;  // Plant a flower
                    n--;
                    if (n == 0) return true;
                }
            }
        }

        return n <= 0;
    }

    public static void main(String[] args) {
        CanPlaceFlowers sol = new CanPlaceFlowers();

        System.out.println(sol.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1)); // true
        System.out.println(sol.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2)); // false
    }
}
