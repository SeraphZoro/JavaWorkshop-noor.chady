public class JavaProgram {
    public static void main(String[]args) {
        vehicule car = new vehicule("Volkswagen", "Scirocco", 2008);
        car.Describe();
        car.Accelerate();
        car.Brake();

        vehicule truck = new vehicule("Scania", "Frostfire", 2022);
        truck.Describe();
        truck.Accelerate();
        truck.Brake();
        //car.Brand();
        //car.Weight();
        //car.Wheels();
    }
}