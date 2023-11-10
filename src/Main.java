public class Main {
    public static Car createObject(String className) {
        switch (className) {
            case "Car1":
                return new Mercedes(2019, "Mercedes-Benz W213", 3.2, "E-class");

            case "Car2":
                return new BMW(2003, "BMW M5", 5.3, 250);

            case "Car3":
                return new Audi(2016, "Audi A3", 2.0, "Front-wheel drive");

            default:
                throw new IllegalArgumentException("Error:");
        }
    }

    public static void main(String[] args) {
        Car car1 = createObject("Car1");
        Car car2 = createObject("Car2");
        Car car3 = createObject("Car3");

        Printable[] car = {car1, car2, car3};
        for (int i = 0; i < car.length; i++) {
            car[i].print();
        }
    }
}