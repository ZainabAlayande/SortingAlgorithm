import java.util.function.BiFunction;

public class BiFunctionInterface {
    public static void main(String[] args) {
        System.out.println(biFunction.apply(30, 20));

    }

    static BiFunction<Integer, Integer, String> biFunction =
            (inputOne, inputTwo) -> inputOne + inputTwo + " " + " ";
}
