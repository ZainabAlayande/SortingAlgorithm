package PackagaeStack;

public class Stack {

    //private boolean empty = true;

    private int count = 0;

    private int[] elements;

    public Stack(int stackSize) {

        elements = new int[stackSize];
    }

    public boolean isEmpty() {
        if (count ==0)
            return true;

        else return false;
    }

    public void push(int element){

//        empty = false;
        if (isFull()) throw new StackOverflowError();
        elements[count] = element;
        count++;
    }

    public int pop() {

//        empty = true;
        count--;
        return elements[count];
    }

    public boolean isFull() {
        if (elements.length == count)
            return true;
        else return  false;
    }

    public int peek(){

        return elements[count -1];
    }
}
