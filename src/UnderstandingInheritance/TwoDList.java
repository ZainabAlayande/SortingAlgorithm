package UnderstandingInheritance;

public class TwoDList {
    static String[] word = {"I am", "a", "servant", "of", "God"};
    static String[][] empty = {{}};
    public static void main(String[] args) {
        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < word.length; j++) {
                empty[j][i] = word[j];
            }
        }
    }

    public static void method() {
        System.out.print("[");
        for (int i = 0; i < word.length; i++) {
            if (i == 4) {
                System.out.print("[");
                System.out.print(word[i]);
                System.out.print("], ");
            }
            System.out.print("]");


        }

    }
}
