package chapterSeven.PracticalExamples;

import chapterSeven.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    public static void main(String[] args) {

        String[] stringArray = new String[5];
        String[] array = {"Bode", "Ola", "Ayo", "Arike", "Amope", "Adebisi"};

        ArrayList<String> string = new ArrayList<>();
        ArrayList<String> items =
                new ArrayList<>(Arrays.asList("Food", "Good", "Need", "Lord", "Goof"));

        System.out.println(stringArray);
        System.out.println(array);
        System.out.println(string);
        System.out.println(items);
        System.out.println();


        System.out.println(stringArray[2]);
        System.out.println(array[2]);
        System.out.println();

        //System.out.println(string.get(0));
        System.out.println(items.get(4));
        System.out.println();

        System.out.println(stringArray.length);
        System.out.println(array.length);
        System.out.println();

        System.out.println(string.size());
        System.out.println(items.size());

        stringArray[0] = "Wale";
        stringArray[1] = "Ibukun";
        stringArray[2] = "Ayanwale";
        stringArray[3] = "Tiwalade";
        stringArray[4] = "Johnson";

        System.out.println(Arrays.deepToString(stringArray));
        System.out.println(Arrays.toString(array));

        System.out.println();

        string.add("Comma");
        string.add("Lawma");
        string.add("Boma");
        string.add("Omar");
        string.add("Loma");
        string.add("Umma");

        System.out.println(string);
        string.remove(2);
        System.out.println(string);
        string.set(2, "Zainab");
        System.out.println(string);




    }
}
