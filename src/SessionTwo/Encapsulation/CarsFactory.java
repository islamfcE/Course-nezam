package SessionTwo.Encapsulation;

public class CarsFactory {
    // attibutes / data
    private int speed;
    private String color;
    private String model;
    private boolean ismanual;

    // setter

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setIsmanual(boolean ismanual) {
        this.ismanual = ismanual;
    }

    public void setSpeed(int speed)
     {
         this.speed = speed;
     }

    // getter

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public boolean isIsmanual() {
        return ismanual;
    }

    public int getSpeed()
    {
        return speed;
    }
}


