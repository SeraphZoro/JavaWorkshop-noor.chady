public class Truck extends vehicule {
    int Weight;
    int Wheels;

    public Truck (String brand, String model, int year, int weight, int wheels) {
        super(brand, model, year);
        Weight = weight;
        Wheels = wheels;
    }
    public void Weight() {
        System.out.println("I weight " +Weight+ "kg ");
    }
    public void Wheels() {
        System.out.println("and I have " +Wheels);
    }
    public void Describe() {
        System.out.println("i'm a " +Brand+ " " +Model+ "made in " +Year+ "i'm");
    }
}
