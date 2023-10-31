package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private int totalTryCnt;
    private int curTryCnt;
    private int maxWinCnt;
    private List<Car> cars;

    public RacingGame(List<String> carNames, int totalTryCnt){
        createCars(carNames);
        this.totalTryCnt = totalTryCnt;
    }

    public void createCars(List<String> carNames){
        cars = new ArrayList<>();
        for (String name : carNames){
            cars.add(new Car(name));
        }
    }

}
