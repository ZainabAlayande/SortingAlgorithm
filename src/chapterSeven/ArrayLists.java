package chapterSeven;
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {

        //ArrayLists is a class in java and a representation of data structure in programming and it is a general class or type
        //a generic type is a type and ArrayLists does not have a fixed length

        ArrayList<String> list = new ArrayList<>();

        //How to add element to arraylist
        list.add("Burna Boy");
        list.add("Zimbabwe");
        list.add("Wike");
        list.add("Chibuzo");

        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.clone());
        System.out.println(list.size());

    }
}
