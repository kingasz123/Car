public class docar {
    public static void main(String[] args) {
        Car samochód1 = new Car ("Opel", "Astra", 2015);
        samochód1.przedstaw ();

        Car samochód2 = new Car ("Mercedes", "A-Class", 2017);
        System.out.println (samochód2.getMarka () + " " + samochód2.getModel ());
    }
}
