import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Car[] cars = {
            new Car(2011, 210, "Toyota Camry", "white", true, true),
            new Car(1989, 324, "Ferrari F40", "red", false, false),
            new Car(2017, 227, "Skoda Octavia", "white", false, false),
            new Car(2017, 230, "Audi A6", "black", true, true),
            new Car(2019, 225, "BMW X5", "black", true, false),
            new Car(2017, 210, "Audi A5", "dark blue", true, false),
            new Car(2011, 216, "Volkswagen Golf", "black", false, true)
        };

        System.out.println("Array before sorting:");
        for (Car car : cars) {
            System.out.println(car);
        }

        Arrays.sort(cars);

        System.out.println();
        System.out.println("Array after sorting:");
        for (Car car : cars) {
            System.out.println(car);
        }

        Car wantedCar = new Car(2017, 210, "Audi A5", "dark blue", true, false);
        System.out.println();
        System.out.println("Wanted car:");
        System.out.println(wantedCar);

        System.out.println();
        System.out.println("Searching in array...");

        int carIndex = -1;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].equals(wantedCar)) {
                carIndex = i;
            }
        }

        System.out.println("Found car at [" + carIndex + "] position");
    }
}
