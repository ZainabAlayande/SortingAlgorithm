package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeTest {


    @Test
    public void BikeIsTurnedOnTest() {

        //I have a bike
        Bike bajaj = new Bike();

        //Set Bike to turn On
        bajaj.setTurnOn(true);

        //Get bajaj value
        bajaj.getTurnOn();

        //assert Equals or Checkmate
        assertEquals(true, bajaj.getTurnOn());

    }

    @Test
    public void BikeIsTurnedOffTest() {

        //I have a bike
        Bike bajaj = new Bike();

        //Set Bike to turn Off
        bajaj.setTurnOff(true);

        //Get bajaj value
        bajaj.getTurnOff();

        //assert Equals or Checkmate
        assertEquals(true, bajaj.getTurnOff());

    }

    @Test
    public void BikeOnGearOneTest() {

        //I have a bike
        Bike bajaj = new Bike();

        //Set Bike to turn On
        bajaj.setTurnOff(true);

        //Set acceleration with gear and speed
        bajaj.setAcceleration(15, 1);

        //Check
        bajaj.getAcceleration();

        //assert Equals or Checkmate
        assertEquals(16, bajaj.getAcceleration());
    }

    @Test
    public void BikeOnGearTwoTest() {

        //I have a bike
        Bike bajaj = new Bike();

        //Set Bike to turn On
        bajaj.setTurnOff(true);

        //Set acceleration with gear and speed
        bajaj.setAcceleration(24, 2);

        //Check
        bajaj.getAcceleration();

        //assert Equals or Checkmate
        assertEquals(26, bajaj.getAcceleration());
    }

    @Test
    public void BikeOnGearThreeTest() {

        //I have a bike
        Bike bajaj = new Bike();

        //Set Bike to turn On
        bajaj.setTurnOff(true);

        //Set acceleration with gear and speed
        bajaj.setAcceleration(35, 3);

        //Check
        bajaj.getAcceleration();

        //assert Equals or Checkmate
        assertEquals(38, bajaj.getAcceleration());
    }

    @Test
    public void BikeOnGearFourTest() {

        //I have a bike
        Bike bajaj = new Bike();

        //Set Bike to turn On
        bajaj.setTurnOff(true);

        //Set acceleration with gear and speed
        bajaj.setAcceleration(44, 4);

        //Check
        bajaj.getAcceleration();

        //assert Equals or Checkmate
        assertEquals(48, bajaj.getAcceleration());
    }



    @Test
    public void BikeDecelerationOnGearOneTest() {

        //I have a bike
        Bike bajaj = new Bike();

        //Set Bike to turn On
        bajaj.setTurnOff(true);

        //Set acceleration with gear and speed
        bajaj.setDeceleration(15, 1);

        //Check
        bajaj.getDeceleration();

        //assert Equals or Checkmate
        assertEquals(14, bajaj.getDeceleration());
    }

    @Test
    public void BikeDecelerationGearTwoTest() {

        //I have a bike
        Bike bajaj = new Bike();

        //Set Bike to turn On
        bajaj.setTurnOff(true);

        //Set acceleration with gear and speed
        bajaj.setAcceleration(24, 2);

        //Check
        bajaj.getAcceleration();

        //assert Equals or Checkmate
        assertEquals(26, bajaj.getAcceleration());
    }

    @Test
    public void BikeDecelerationGearThreeTest() {

        //I have a bike
        Bike bajaj = new Bike();

        //Set Bike to turn On
        bajaj.setTurnOff(true);

        //Set acceleration with gear and speed
        bajaj.setAcceleration(35, 3);

        //Check
        bajaj.getAcceleration();

        //assert Equals or Checkmate
        assertEquals(38, bajaj.getAcceleration());
    }

    @Test
   public void BikeDecelerationGearFourTest() {

        //I have a bike
        Bike bajaj = new Bike();

        //Set Bike to turn On
        bajaj.setTurnOff(true);

        //Set acceleration with gear and speed
        bajaj.setAcceleration(44, 4);

        //Check
        bajaj.getAcceleration();

        //assert Equals or Checkmate
        assertEquals(48, bajaj.getAcceleration());
    }
}