package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GearRangeTest {

        @Test
        public void setGearOneRange() {

            //Given that I have a bike
            Bike bajaj = new Bike();

            //Given that I turn On my bike
            bajaj.setTurnOn(true);

            //When I set my gear speed to 18
            bajaj.setGearSpeed(18);

            //Check that my gear speed is 18
            bajaj.getGearSpeed();

            //assert Equals
            assertEquals(1, bajaj.getGearSpeed());

        }

    @Test
    public void setGearTwoRange() {

        //Given that I have a bike
        Bike bajaj = new Bike();

        //Given that I turn On my bike
        bajaj.setTurnOn(true);

        //When I set my gear speed to 21
        bajaj.setGearSpeed(21);

        //Check that my gear speed is 21
        bajaj.getGearSpeed();

        //assert Equals
        assertEquals(2, bajaj.getGearSpeed());

    }

    @Test
    public void setGearThreeRange() {

        //Given that I have a bike
        Bike bajaj = new Bike();

        //Given that I turn On my bike
        bajaj.setTurnOn(true);

        //When I set my gear speed to 31
        bajaj.setGearSpeed(31);

        //Check that my gear speed is 31
        bajaj.getGearSpeed();

        //assert Equals
        assertEquals(3, bajaj.getGearSpeed());

    }

    @Test
    public void setGearFourRange() {

        //Given that I have a bike
        Bike bajaj = new Bike();

        //Given that I turn On my bike
        bajaj.setTurnOn(true);

        //When I set my gear speed to 41
        bajaj.setGearSpeed(41);

        //Check that my gear speed is 41
        bajaj.getGearSpeed();

        //assert Equals
        assertEquals(4, bajaj.getGearSpeed());

    }
    }


