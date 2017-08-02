public class Animal {

    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal() {
        this("Unknown", 0, 0, 0, 0);
        System.out.println("Null Animal Created");
    }

    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public String eat() {
        return ("Dog eats food!");
    }

    public void move() {

    }

    public String getName() {
        return name;
    }

    public int getBody() {
        return body;
    }

    public int getBrain() {
        return brain;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
