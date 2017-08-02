
import java.util.ArrayList;

public class MyVehicle {

    private String name;
    private String wheels;
    private String Direction;
    private int speed;
    private int gear;



    public
    MyVehicle() {
        System.out.println("Null Vehicle Created");
    }

    public MyVehicle(String name, String wheels, String direction, int speed, int gear) {
        this.name = name;
        this.wheels = wheels;
        Direction = direction;
        this.speed = speed;
        this.gear = gear;

        welcome();
    }

    public void welcome(){
        System.out.println("Vehicle Name: " + this.name);
        String tempDirection = this.getDirection();
        if (tempDirection == ""){
            this.setDirection("North");
        }
        System.out.println(("Direction is " + this.getDirection()));
        System.out.println("Current Speed is " + this.getSpeed() + "mph");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public String getDirection() {
        return Direction;
    }

    public void setDirection(String direction) {
        Direction = direction;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
}
