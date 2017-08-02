import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class Car extends Vehicle {

    private String model;
    private String engine;
    private String colour;

    public Car() {
        System.out.println("Null Car Created");
    }

    public Car(String windows, String doors, String seats, String wheels, int curSpeed, int maxSpeed, String model, String engine, String colour) {
        super(windows, doors, seats, wheels, curSpeed, maxSpeed);
        this.model = model;
        this.engine = engine;
        this.colour = colour;
    }

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commadore")) {
            this.model = model;
            System.out.println("triggered on " + model);
        } else {
            System.out.println("Car Model Not In DataBase (" + model + ")");
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }

    public static void changeCarModel() {

    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
