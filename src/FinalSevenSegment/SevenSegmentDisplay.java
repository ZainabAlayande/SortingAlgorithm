package FinalSevenSegment;

import java.util.Arrays;

public class SevenSegmentDisplay {

    static String[] light = new String[7];

    public static void main(String[] args) {
        setLight("11110011");
        displayLight();

        System.out.println();
        //System.out.println(Arrays.toString(light));
    }


    public static void displayLight() {
        System.out.printf("""
                        %s
                        %s        %s
                        %s        %s
                        %s
                        %s        %s
                        %s        %s
                        %s
                        """, light[0], light[5], light[1], light[5], light[1], light[6]
                , light[4], light[2], light[4], light[2], light[3]);


    }


    public static void setLight(String binary) {
        if (String.valueOf(binary.charAt(7)).equals("1")) {
            for (int i = 0; i < light.length; i++) {
                if (String.valueOf(binary.charAt(i)).equals("1")) {
                    light[i] = i % 3 == 0 ? " # # # #" : "#";
                } else {
                    light[i] = "";
                }

            }

        } else {
            Arrays.fill(light, "");
        }

    }
}