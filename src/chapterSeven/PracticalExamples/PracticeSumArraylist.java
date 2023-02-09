package chapterSeven.PracticalExamples;

import java.util.ArrayList;

public class PracticeSumArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();

        array.add(9);
        array.add(5);
        array.add(2);
        array.add(18);
        array.add(8);
        array.add(16);
        array.add(1);
        array.add(14);
        array.add(10);
        array.add(9);

        System.out.println(array);

        for (int index = 0; index < array.size(); index++) {
            int firstNum = 0;
            int secondNum = 0;
            if (array.get(index) > 9) {
                firstNum = array.get(index)/10;
                secondNum = array.get(index)%10;
                array.add(index , firstNum + secondNum);
            }

            //System.out.println(firstNum);
            //System.out.println(secondNum);
        }

        System.out.println(array);

    }
}
