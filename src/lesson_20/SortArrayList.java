package lesson_20;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class SortArrayList {
    public static List<String> sortingArrayList(String... stringForSorting) {
        List<String> sortedArrList = new ArrayList<>();
        for (String s : stringForSorting) {
            if (!sortedArrList.contains(s)) {
                sortedArrList.add(s);
            }
        }
        Collections.sort(sortedArrList);
        System.out.println(sortedArrList);
        return sortedArrList;
    }

    public static void main(String[] args) {
        String s1 = "baggage";
        String s2 = "porter";
        String s3 = "cart";
        String s4 = "tag";
        String s5 = "counter";
        String s6 = "airport";
        String s7 = "baggage";
        String s8 = "hotel";
        String s9 = "gate";
        String s10 = "flight";
        String s11 = "cart";

        sortingArrayList(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11);

        SortArrayList oneMore = new SortArrayList();
        oneMore.sortingArrayList("дама", "сдавала", "багаж", "диван", "чемодан", "саквояж", "дама",
                "картина", "корзина", "картонка", "собаченка", "саквояж", "собаченка");

    }

}


/*output:
        [airport, baggage, cart, counter, flight, gate, hotel, porter, tag]
        [багаж, дама, диван, картина, картонка, корзина, саквояж, сдавала, собаченка, чемодан]  */

