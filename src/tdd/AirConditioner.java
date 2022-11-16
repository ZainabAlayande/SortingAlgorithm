package tdd;

public class AirConditioner {

    private int temperature;
    private boolean switchState;

    public void switchAirconditioner(boolean value) {
            boolean ON = true;
            boolean OFF = false;
         if (value == true) {
             switchState = ON;
         }

            if (value == false) {
                switchState = OFF;
                }
            }

    public boolean switchState() {
        return switchState;
    }



        public void setTemperature(int degree) {
            temperature = temperature + degree;
            if (temperature > 30) {
                temperature = 30;}

            if (temperature < 16) {
                temperature = 16;
            }
        }

        public int getTemperature() {
            return temperature;
        }

}

