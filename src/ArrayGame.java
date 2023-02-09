import java.util.Arrays;

public class ArrayGame {

    public static void main(String[] args) {
        String[][] array = new String[3][3];

        array[0][0] = "Car";
        array[0][1] = "2000";
        array[1][0] = "Truck";
        array[1][1] = "500";
        array[2][0] = "Bike";
        array[2][1] = "6500";

        System.out.println(Arrays.deepToString(array));
    }
}
