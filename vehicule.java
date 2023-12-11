public class vehicule {
    String Brand;
    String Model;
    int Year;
    int Weight;
    int Wheels;

    public vehicule (String brand, String model, int year) {
        Brand = brand;
        Model = model;
        Year = year;
    }
    public void Accelerate() {
        System.out.println("I'm putting the pedal to the metal");
    }
    public void Brake() {
        System.out.println("Woah! Slow down boy!");
    }
    public void Describe() {
        System.out.println("i'm a " +Brand+ " " +Model+ "made in " +Year);
    }
}
