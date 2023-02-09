import java.util.ArrayList;

public class goat{
    static ArrayList<String> theList = new ArrayList<>();


    public static void main(String[] args) {


        theList.add("T");
        theList.add("B");
        theList.add("G");
        theList.add("H");
        theList.add("K");

        for (int i = 0; i < 1; i++) {
            System.out.println(theList);
        }

        findContact("T");






    }

    public static void findContact(String name) {
        for (int i = 0; i < theList.size(); i++) {
            if (theList.contains(name)) {
                System.out.println(name);
                break;
            }
            else {
                System.out.println("Invalid");
            }

        }
    }
}
