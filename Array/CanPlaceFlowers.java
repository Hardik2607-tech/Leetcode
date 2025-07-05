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
        CanPlaceFlowers solution = new CanPlaceFlowers();

        int[] flowerbed1 = {1, 0, 0, 0, 1};
        int n1 = 1;
        System.out.println("Output 1: " + solution.canPlaceFlowers(flowerbed1, n1)); // true

        int[] flowerbed2 = {1, 0, 0, 0, 1};
        int n2 = 2;
        System.out.println("Output 2: " + solution.canPlaceFlowers(flowerbed2, n2)); // false

        int[] flowerbed3 = {0, 0, 1, 0, 0};
        int n3 = 2;
        System.out.println("Output 3: " + solution.canPlaceFlowers(flowerbed3, n3)); // true
    }
}
