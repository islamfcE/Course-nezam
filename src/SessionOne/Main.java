package SessionOne;

public class Main {
    public static void main(String[] args) {
        Cars car1 = new Cars("black","BMW",100,false);

        System.out.println(car1);
        car1.printInfo();

        Cars car2 = new Cars("white","128",50,true);

        System.out.println(car2);
        car2.printInfo();

        Cars car3 = new Cars();
        car3.printInfo();

        Cars car4 = new Cars("brown","honda");
        car4.printInfo();

        Cars.PrintNumberOfOpjects();


    }
}
