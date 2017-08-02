public class StingRay extends MyCar{

    //Year: "2017", Name: "Chevy", Wheels: "Four", Direction: "North", Speed: 0, Gear: 0, Model: "Stingray", Doors: "Two", Engine: "6.3 L V8"
    private String year;

    public StingRay() {
        System.out.println("Null StingRay Created");
        this.year = year;
        this.setYear("2017");
        this.setName("Chevy");
        this.setWheels("Four");
        this.setDirection("North");
        this.setSpeed(0);
        this.setGear(0);
        this.setModel("StingRay");
        this.setDoors("Two");
        this.setEngine("6.3 L V8");

    }

    public StingRay(String year, String name, String wheels, String direction, int speed, int gear, String model, String doors, String engine) {
        super(name, wheels, direction, speed, gear, model, doors, engine);
        this.year = year;
        this.setYear("2017");
        this.setName("Chevy");
        this.setWheels("Four");
        this.setDirection("North");
        this.setSpeed(0);
        this.setGear(0);
        this.setModel("StingRay");
        this.setDoors("Two");
        this.setEngine("6.3 L V8");
        System.out.println("\n----------New StingRay Created----------\n");

    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

}