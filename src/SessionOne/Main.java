package SessionOne;

public class Main {
    public static void main(String[] args) {
        Cars car1 = new Cars();
        Cars car2 = new Cars();
        System.out.println(car1);
        car1.color = "black";
        car1.model = "BMW";
        car1.speed = 100;
        car1.ismanual = false;
        car1.printInfo();

        System.out.println(car2);
        car2.color = "white";
        car2.model = "128";
        car2.speed = 40;
        car2.ismanual = true;
        car2.printInfo();


    }
}
