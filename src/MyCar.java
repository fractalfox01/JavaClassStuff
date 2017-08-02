public class MyCar extends MyVehicle {

    private String model;
    private String doors;
    private String engine;
    private String shiftType;

    public MyCar(){

        System.out.println("Null Car Created");
    }
    public MyCar(String name, String wheels, String direction, int speed, int gear, String model, String doors, String engine) {
        super(name, wheels, direction, speed, gear);
        this.model = model;
        this.doors = doors;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDoors() {
        return doors;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getShiftType() {
        return shiftType;
    }

    public void setShiftType(String shiftType) {
        this.shiftType = shiftType;
    }
}