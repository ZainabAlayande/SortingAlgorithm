package ArrayLists;

public class ArrayList implements List {
    private int count = 0;
    private int[] array;

    @Override
    public boolean isEmpty() {
        if (count == 0) return true;
        else return false;
    }

    @Override
    public void add(int number) {
        array = new int[5];
        array[count] = number;
        count++;

            if (count == array.length) {
                int[] newArray = new int[array.length * 2];
                for (int i = 0; i < array.length; i++) {
                    newArray[i] = array[i];
                }
                array = newArray;
            }
        }




    public void remove(int number) {
        if (array[0] == 0) throw new NullPointerException("Array is null...");
        for (int i = number; i < count - 1; i++) {
            array[i] = array[i + 1];
        }
        count--;
    }

        /**if (array[0] == 0) {
            throw new NullPointerException("Array is null...");
        } else if (remove(number)) {
            array[number] = 0;
        }
        return true;*/



    @Override
    public int size() {
        return count;
    }

    @Override
    public void add(int number, int index) {
        array[index] = number;

    }

    @Override
    public int get(int index) {
        return array[index];
    }

    private void validate() {

    }
}
