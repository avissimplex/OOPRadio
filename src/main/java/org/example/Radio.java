package org.example;

public class Radio {
    private int quantityStation = 10;
    private int currentStation;
    private int currentVolume;

    private int minVolume = 0;

    private int maxVolume = 100;

    public Radio(int quantityStation) {
        this.quantityStation = quantityStation;
    }

    public Radio() {
        this.quantityStation = 10;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getquantityStation() {
        return quantityStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > quantityStation - 1)
            currentStation = 0;
        else if (newCurrentStation < 0)
            currentStation = quantityStation - 1;
        else {
            currentStation = newCurrentStation;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setNextStation() {
        int target = currentStation + 1;
        setCurrentStation(target);
    }

    public void setPrevStation() {
        int target = currentStation - 1;
        setCurrentStation(target);
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}