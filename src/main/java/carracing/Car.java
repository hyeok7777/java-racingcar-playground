package carracing;

import java.util.Random;

public class Car {
    private String carName;
    private Integer currentPosition;
    private Integer currentSpeed;
    private String currentPositionString;

    public Car(String carName) {
        this.currentPositionString = "-";
        this.carName = carName;
        this.currentPosition = 1;
        this.currentSpeed = 0;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public Integer getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Integer currentSpeed) {
        this.currentPosition += getCurrentSpeed();
    }

    public String getCurrentPositionString() {
        for (int i = 0; i < currentPosition; i++) {
            currentPositionString += "-";
        }
        return currentPositionString;
    }

    private Integer getCurrentSpeed() {
        Random random = new Random();
        currentSpeed = random.nextInt(1);
        return currentSpeed;
    }

    public void setCurrentSpeed(Integer currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
}
