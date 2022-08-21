package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStationNumberNextToUpBorder() {
        Radio station = new Radio();

        station.setCurrentStationNumber(8);

        int expected = 8;
        int actual = station.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumberUpBorder() {
        Radio station = new Radio();

        station.setCurrentStationNumber(9);

        int expected = 9;
        int actual = station.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationNumberAbove9() {
        Radio station = new Radio();

        station.setCurrentStationNumber(10);

        int expected = 0;
        int actual = station.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationNumberLess0() {
        Radio station = new Radio();

        station.setCurrentStationNumber(-1);

        int expected = 0;
        int actual = station.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumberDownBorder() {
        Radio station = new Radio();

        station.setCurrentStationNumber(0);

        int expected = 0;
        int actual = station.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumberNextToDownBorder() {
        Radio station = new Radio();

        station.setCurrentStationNumber(1);

        int expected = 1;
        int actual = station.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStationNumber() {
        Radio next = new Radio();
        next.setCurrentStationNumber(5);

        next.increaseStationNumber();

        int expected = 6;
        int actual = next.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseStationNumberAbove10() {
        Radio next = new Radio();
        next.setCurrentStationNumber(10);

        next.increaseStationNumber();

        int expected = 1;
        int actual = next.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStationNumberTo0() {
        Radio next = new Radio();
        next.setCurrentStationNumber(9);

        next.increaseStationNumber();

        int expected = 0;
        int actual = next.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStationNumber() {
        Radio prev = new Radio();
        prev.setCurrentStationNumber(5);

        prev.decreaseStationNumber();

        int expected = 4;
        int actual = prev.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseStationNumberLess0() {
        Radio prev = new Radio();
        prev.setCurrentStationNumber(0);

        prev.decreaseStationNumber();

        int expected = 9;
        int actual = prev.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseVolume() {
        Radio volumeUp = new Radio();
        volumeUp.setCurrentVolume(5);

        volumeUp.increaseVolume();

        int expected = 6;
        int actual = volumeUp.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotIncreaseVolumeAbove100() {
        Radio volumeUp = new Radio();
        volumeUp.setCurrentVolume(100);

        volumeUp.increaseVolume();

        int expected = 100;
        int actual = volumeUp.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseVolume() {
        Radio volumeDown = new Radio();
        volumeDown.setCurrentVolume(5);

        volumeDown.decreaseVolume();

        int expected = 4;
        int actual = volumeDown.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolumeLess0() {
        Radio volumeDown = new Radio();
        volumeDown.setCurrentVolume(0);

        volumeDown.decreaseVolume();

        int expected = 0;
        int actual = volumeDown.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeLess0() {
        Radio volume = new Radio();

        volume.setCurrentVolume(-1);


        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAbove100() {
        Radio volume = new Radio();

        volume.setCurrentVolume(101);


        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


}
