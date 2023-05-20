package org.tvscreen.ga.utils.mutators;

import java.util.Random;

public class PermutationMutationUtils {
    public static void twoPositionsChangeRandom(int[] permutation, Random random) {
        int n, i, j;
        n = permutation.length;
        i = random.nextInt(n);
        j = random.nextInt(n);
        while (j == i) {
            j = random.nextInt(n);
        }
        int aux = permutation[i];
        permutation[i] = permutation[j];
        permutation[j] = aux;
    }
}
