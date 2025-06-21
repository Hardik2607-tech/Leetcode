import java.util.*;

public class RelativeBanking {

    public static String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] result = new String[n];

        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, (a, b) -> score[b] - score[a]);

        for (int i = 0; i < n; i++) {
            if (i == 0) result[indices[i]] = "Gold Medal";
            else if (i == 1) result[indices[i]] = "Silver Medal";
            else if (i == 2) result[indices[i]] = "Bronze Medal";
            else result[indices[i]] = String.valueOf(i + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] score = {10, 3, 8, 9, 4};
        String[] ranks = findRelativeRanks(score);
        System.out.println(Arrays.toString(ranks));
    }
}
