package ChapterEight;

import java.util.EnumSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of your state: ");
        String  stateEntered = scanner.nextLine();

        for (GeoPoliticalZones geo: EnumSet.range(GeoPoliticalZones.NORTH_CENTRAL, GeoPoliticalZones.NORTH_WEST)) {
            if (stateEntered.equals(geo)) {
                GeoPoliticalZones.NORTH_CENTRAL.getStates();
            }

        }
    }
}
