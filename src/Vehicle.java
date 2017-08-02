public class Vehicle {

    private String windows;
    private String doors;
    private String seats;
    private String wheels;
    private int curSpeed;
    private int maxSpeed;
    private String gear;

    public Vehicle() {
        System.out.println("Null Vehicle created");
    }

    public Vehicle(String windows, String doors, String seats, String wheels, int curSpeed, int maxSpeed) {

        this.windows = windows;
        this.doors = doors;
        this.seats = seats;
        this.wheels = wheels;
        this.curSpeed = curSpeed;
        this.maxSpeed = maxSpeed;
    }

    public static void steering(String direction) {

        String r = "right";
        String l = "left";
        String f = "forward";
        String b = "reverse";
        if (0 == direction.compareToIgnoreCase(r)) {
            System.out.println("Turning Right");
        }
        if (0 == direction.compareToIgnoreCase(l)) {

            System.out.println("Turning Left");
        }
        if (0 == direction.compareToIgnoreCase(f)) {
            System.out.println("Straightening Wheels");
        }
    }

    public void gear(String gear) {
        if (gear == "down") {
            System.out.println("Down Shifting");
        }
        if (gear == "up") {
            System.out.println("Up Shifting");
        }
    }

    public void speed(int speed) {
        int mySpeed = this.getCurSpeed();
        if (speed == mySpeed) {
            System.out.println("You're Already Going " + speed);
        }
        if (speed > mySpeed && speed <= this.maxSpeed) {
            System.out.println("\nIncreasing Speed To " + speed);
            this.setCurSpeed(speed);
        }
        if (speed > this.maxSpeed) {
            System.out.println("\nMaximum Speed is " + this.getMaxSpeed());
            System.out.println("Increasing Speed To " + this.maxSpeed);
            this.setCurSpeed(this.getMaxSpeed());
        }
        if (speed < mySpeed && speed > 0) {
            System.out.println("\nDecreasing Speed to " + speed);
            this.setCurSpeed(speed);
        } else if (speed <= 0) {
            System.out.println("\nStopping Vehicle");
        }
    }

    public String getWindows() {
        return windows;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    public String getDoors() {
        return doors;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public int getCurSpeed() {
        return curSpeed;
    }

    private void setCurSpeed(int curSpeed) {
        if (curSpeed > this.maxSpeed) {
            this.curSpeed = this.getMaxSpeed();
        } else {
            this.curSpeed = curSpeed;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }
}
