package PackagaeStack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    Stack nedStack;

    @BeforeEach

    public void setUp(){
        nedStack = new Stack(5);
    }

    @Test

    public void newStackIsEmptyTest(){

        Stack nedStack = new Stack(5);

        assertTrue(nedStack.isEmpty());
    }

    @Test

    public void pushXStackIsNotEmptyTest(){

        nedStack.push(3);
        assertFalse(nedStack.isEmpty());
    }
    @Test

    public void popXStackIsNotEmptyTest(){

        nedStack.push(34);

        nedStack.pop();
        assertTrue(nedStack.isEmpty());
    }

    @Test

    public void push2AndPop1FromStackIsNotEmptyTest(){

        nedStack.push(3);
        nedStack.push(4);
        nedStack.pop();
        assertFalse(nedStack.isEmpty());
    }

    @Test

    public void push1AndPopThatParticular1FromStackIsNotEmptyTest(){

        nedStack.push(3);
        int result = nedStack.pop();
//        nedStack.push(4);
//        nedStack.pop();
        assertEquals(3, result);
    }

    @Test

    public void push2AndPop2inReverseFromStackTest(){

        nedStack.push(54);
        nedStack.push(32);
        int resultTwo = nedStack.pop();
        int resultOne = nedStack.pop();

        assertEquals(32,resultTwo);
        assertEquals(54,resultOne);
    }
    @Test

    public void fillUpStackpushShouldThrowStackOverFlowExceptionTest(){

        nedStack.push(54);
        nedStack.push(32);
        nedStack.push(54);
        nedStack.push(32);
        nedStack.push(54);

        assertTrue(nedStack.isFull());
        assertThrows(StackOverflowError.class, () -> nedStack.push(54));
    }

    @Test

    public void pushThenPeekTest(){

        nedStack.push(30);

        assertEquals(30, nedStack.peek());
    }


}