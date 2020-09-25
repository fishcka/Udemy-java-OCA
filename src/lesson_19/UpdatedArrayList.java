package lesson_19;

import java.util.ArrayList;
import java.util.Arrays;

public class UpdatedArrayList {
    static public String[] arrayUpdating(String[]... input) {
        ArrayList<String> list = new ArrayList<>();
        for (String[] arg : input) {
            for (String s : arg) {
                list.add(s);
            }
        }
        String[] output = list.toArray(new String[0]);
        return output;
    }

    public static void main(String[] args) {
        args = new String[]{"1", "5", "9", "e2", "c3"};
        String[] arg1 = {"a1", "b2", "c3"};
        String[] arg2 = {"d1", "e2", "f3", "g4", "h5"};
        String[] compare = arrayUpdating(arg1, arg2);

        for (int i = 0; i < compare.length; i++) {
            for (int j = 0; j < args.length; j++) {
                if (compare[i] != null) {
                    if (compare[i].equals(args[j])) {
                        compare[i] = null;
                    }
                }
            }
        }
        System.out.println("compared and changed array = " + Arrays.toString(compare));
    }
}

/*
output:
        compared and changed array = [a1, b2, null, d1, null, f3, g4, h5]  */
