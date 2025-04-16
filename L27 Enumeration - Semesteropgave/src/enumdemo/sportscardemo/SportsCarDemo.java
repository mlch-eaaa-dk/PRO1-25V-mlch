package enumdemo.sportscardemo;

public class SportsCarDemo {
    public static void main(String[] args) {
        SportsCar car1 = new SportsCar(CarType.FERRARI, CarColor.RED, 2_000_000);
        System.out.println(car1);

        // with if-else
        if (car1.getMake().equals(CarType.PORSCHE)) {
            System.out.println("Bilen er lavet i Tyskland");
        } else if (car1.getMake() == CarType.FERRARI) {
            System.out.println("Bilen er lavet i Italien");
        } else { // car1.getMake() == CarType.JAGUAR
            System.out.println("Bilen er lavet i England");
        }

        // with switch
        SportsCar car2 = new SportsCar(CarType.PORSCHE, CarColor.BLACK, 1_000_000);
        System.out.println(car2);
        switch (car2.getMake()) {
            case CarType.PORSCHE -> System.out.println("Bilen er lavet i Tyskland");
            case CarType.FERRARI -> System.out.println("Bilen er lavet i Italien");
            case CarType.JAGUAR -> System.out.println("Bilen er lavet i England");
        }
    }
}
