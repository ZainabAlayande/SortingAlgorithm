package chapterSeven;

import java.util.ArrayList;
import java.util.List;

public class SortInArraylist {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();

        array.add(3);
        array.add(17);
        array.add(5);
        array.add(9);
        array.add(1);

        array.sort(Integer::compareTo);

        System.out.println(array);


    }
}
