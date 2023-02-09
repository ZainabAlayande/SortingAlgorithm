package ChapterEight;

import java.util.Arrays;
import java.util.Scanner;

public enum GeoPoliticalZones {
    SOUTH_SOUTH(new String[]{"Akwa-Ibom", "Anambra", "Ebonyi", "Enugu", "Imo"}),
    NORTH_EAST(new String[]{"Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"}),
    NORTH_CENTRAL(new String[]{"Benue", "FCT", "Kogi", "Kwara", "Nasarawa", "Niger", "PLateau"}),
    SOUTH_EAST(new String[]{"Abia", "Anambra", "Ebonyi", "Enugu", "Imo"}),
    SOUTH_WEST(new String[]{"Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo"}),
    NORTH_WEST(new String[]{"Kaduna", "Katsina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara"});
    private String[] states;

    GeoPoliticalZones(String[] states) {
        this.states = states;
    }

    public static GeoPoliticalZones getZone(String stateName) {
        for (GeoPoliticalZones zone : GeoPoliticalZones.values()) {
            for (String state : zone.states) {
                if (stateName.equalsIgnoreCase(state)) {
                    return zone;
                }
            }
        }
        throw new IllegalArgumentException("State does not exist");
    }

    public String[] getStates() {
        return states;
    }





}





