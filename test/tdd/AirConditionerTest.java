package tdd;

import org.junit.jupiter.api.Test;

import tdd.AirConditioner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionerTest {

    @Test
    public void AirConditionerOnTest() {

        AirConditioner hisense = new AirConditioner();

        hisense.switchAirconditioner(true);

        hisense.switchState();

        assertEquals(true, hisense.switchState());

    }

    @Test
    public void AirConditionerOffTest() {

        AirConditioner hisense = new AirConditioner();

        hisense.switchAirconditioner(false);

        hisense.switchState();

        assertEquals(false, hisense.switchState());

    }

    @Test
    public void IncreaseTemperature() {

        AirConditioner hisense = new AirConditioner();

        hisense.setTemperature(16);

        hisense.getTemperature();

        assertEquals(16, hisense.getTemperature());

    }

    @Test
    public void DecreaseTemperature() {

        AirConditioner hisense = new AirConditioner();

        hisense.setTemperature(16);

        hisense.getTemperature();

        assertEquals(16, hisense.getTemperature());

    }

    @Test
    public void IncreaseTemperatureBeyond30() {

        AirConditioner hisense = new AirConditioner();

        hisense.setTemperature(30);

        hisense.getTemperature();

        assertEquals(30, hisense.getTemperature());

    }

    @Test
    public void DecreaseTemperatureBeyond16() {

        AirConditioner hisense = new AirConditioner();

        hisense.setTemperature(16);

        hisense.getTemperature();

        assertEquals(16, hisense.getTemperature());

    }



}