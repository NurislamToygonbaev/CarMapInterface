import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(1, 123);
        CarMod carMod = new CarMod(2020, "camry", 20000, "black");

        Map<Car, CarMod> carMap = new HashMap<>();
        carMap.put(car, carMod);

        System.out.println(carMap.entrySet());

    }
}