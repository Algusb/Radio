package ru.netology;

public class Radio {
    private int currentStationNumber;
    private int currentVolume;
    private int stationAmount;

    public Radio() {
        stationAmount = 10;
    }

    public Radio(int stationAmount) {
        this.stationAmount = stationAmount;
    }

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber > stationAmount - 1) {
            return;
        }
        if (newCurrentStationNumber < 0) {
            return;
        }
        currentStationNumber = newCurrentStationNumber;
    }

    public void increaseStationNumber() {
        if (currentStationNumber == stationAmount - 1) {
            currentStationNumber = 0;
        } else {
            currentStationNumber++;
        }
    }

    public void decreaseStationNumber() {
        if (currentStationNumber == 0) {
            currentStationNumber = currentStationNumber = stationAmount - 1;
        } else {
            currentStationNumber = currentStationNumber - 1;
        }
    }


    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            newCurrentVolume = 100;
        }
        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }
        currentVolume = newCurrentVolume;
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }
}