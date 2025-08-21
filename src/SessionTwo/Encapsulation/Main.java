package SessionTwo.Encapsulation;

public class Main {
    public static void main(String[] args) {
        CarsFactory carsFactory = new CarsFactory();
        carsFactory.setSpeed(100);
        System.out.println(carsFactory.getSpeed());
    }
}
