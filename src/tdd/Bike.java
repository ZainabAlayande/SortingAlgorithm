package tdd;

public class Bike {

    private boolean turnOn;
    private boolean turnOff;
    private int speed;
    private int range;


    public void setTurnOn(boolean value) {
        turnOn = value;
        if (turnOn) {
            turnOff = false;
        }
    }

    public boolean getTurnOn() {

        return turnOn;
    }

    public void setTurnOff(boolean value) {
        turnOff = value;
        if (turnOff) {
            turnOff = true;
        }
    }

    public boolean getTurnOff() {

        return turnOff;
    }

    public void setAcceleration(int speed, int gear) {
        if (gear == 1) {
            this.speed = speed + 1;
        }
        if (gear == 2) {
            this.speed = speed + 2;
        }
        if (gear == 3) {
            this.speed = speed + 3;
        }
        if (gear == 4) {
            this.speed = speed + 4;
        }
    }

    public int getAcceleration() {
        return this.speed;
    }

    public void setDeceleration(int speed, int gear) {
        if (gear == 1) {
            this.speed = speed - 1;
        }
        if (gear == 2) {
            this.speed = speed - 2;
        }
        if (gear == 3) {
            this.speed = speed - 3;
        }
        if (gear == 4) {
            this.speed = speed - 4;
        }
    }

    public int getDeceleration() {
        return this.speed;
    }

    public void setGearSpeed(int speed) {
        if(speed > 0 && speed <= 20) {
            range = 1;
        }
        if(speed >= 21 && speed <= 30) {
            range = 2;
        }
        if(speed >= 31 && speed <= 40) {
            range = 3;
        }
        if(speed >= 41) {
            range = 4;
        }
    }



    public int getGearSpeed() {
        return range;
    }
}