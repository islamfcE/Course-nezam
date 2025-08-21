package SessionOne;

public class Cars {
    // attibutes / data
    static int counter=0; // not static
    int speed;
    String color;
    String model;
    boolean ismanual;

    // methods / operation
    public Cars()
    {
        System.out.println("empty object created");
        counter++;
    }
    public Cars(String color,String model,int speed, boolean ismanual)
    {
        this.model = model;
        this.speed = speed;
        this.color = color;
        this.ismanual = ismanual;
        counter++;
    }
    public Cars(String color,String model)
    {
        this.model = model;
        this.color = color;
        counter++;
    }
    public void printInfo()
    {
        System.out.println("speed: " + speed + "," + " color: " +  color + "," + " model: " + model);

    }
    public static void PrintNumberOfOpjects()
    {
        System.out.println("Number of objects: " + counter);
    }
}
