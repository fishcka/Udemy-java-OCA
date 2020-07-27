package lesson_18;

import java.util.Arrays;

public class ShowArray {

    public static void arrayShowing(String[][] array) {
        System.out.print(Arrays.deepToString(array).replace("[", "{").replace("]", "}"));
        System.out.println();
    }

    public static void main(String[] args) {
        String[] xp1 = {"a1", "b2", "c3"};
        String[] xp2 = {"d1", "e2", "f3", "g4", "h5", "i6", "j7", "k8", "l9", "m10", "n11"};
        String[] xp3 = {"o1", "p2", "q3", "r4", "s5", "t6", "u7", "v8", "w9", "x10", "y11", "z12"};
        String[][] xperia = {xp1, xp2, xp3};
        arrayShowing(xperia);
    }
}

/*
output:
        {{a1, b2, c3}, {d1, e2, f3, g4, h5, i6, j7, k8, l9, m10, n11}, {o1, p2, q3, r4, s5, t6, u7, v8, w9, x10, y11, z12}} */
