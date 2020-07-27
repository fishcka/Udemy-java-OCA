package lesson_17;

public class StringBuilderCompare {
    static boolean comparingStringBuilders(StringBuilder strb1, StringBuilder strb2) {
        String str1 = new String(strb1);
        String str2 = new String(strb2);
        boolean comparing = str1.equals(str2);
        System.out.println(comparing);
        return comparing;
    }


    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Catch the bear before you sell his skin");
        StringBuilder sb2 = new StringBuilder("A good Jack makes a good Jill");
        StringBuilder sb3 = new StringBuilder("Catch the bear before you sell his skin");

        comparingStringBuilders(sb1, sb2);
        comparingStringBuilders(sb2, sb3);
        comparingStringBuilders(sb3, sb1);
    }
}

/*
output:
        false
        false
        true  */
