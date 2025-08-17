package SessionOne;

public class Cars {
    // attibutes / data
    int speed;
    String color;
    String model;
    boolean ismanual;

    // methods / operation
    public Cars()
    {
        System.out.println("empty object created");
    }
    public Cars(String color,String model,int speed, boolean ismanual)
    {
        this.model = model;
        this.speed = speed;
        this.color = color;
        this.ismanual = ismanual;
    }
    public Cars(String color,String model)
    {
        this.model = model;
        this.color = color;
    }
    public void printInfo()
    {
        System.out.println("speed: " + speed + "," + " color: " +  color + "," + " model: " + model);
    }
}
