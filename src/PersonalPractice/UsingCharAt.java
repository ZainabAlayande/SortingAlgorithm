package PersonalPractice;

public class UsingCharAt {
    public static void main(String[] args) {

        String name = "4567890823456789";

        char chr = name.charAt(14);

        for (int row = 0; row < name.length(); row++) {
            System.out.print(name.charAt(row) + " ");
        }



        System.out.println();
        System.out.println(chr);
    }
}
