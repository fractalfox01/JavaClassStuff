public class UglyDuck extends Car {

    private boolean amphibious = true;
    private int maxSpeed = 55;

    public UglyDuck() {
        super("Open-top", "None", "Dozen +", "Six", 0, 55, "Multi-investor production", "GMC Model 270 straight-six", "Army Green");

        System.out.println("----------New UglyDuck Created----------\n");
        System.out.println("Model Type: " + getModel());
        System.out.println("Wheels: " + getWheels());
        System.out.println("Engine Type: " + getEngine());
        System.out.println("Amphibious: " + isAmphibious());
    }

    public boolean isAmphibious() {
        return amphibious;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
