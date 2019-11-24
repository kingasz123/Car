public class Obiektowość {
    public static void main(String[] args) {
        Human człowiek1 = new Human ("Kinga", "Szajba", 1999);
        człowiek1.przedstawSię ();
        //Atrybut "name" oraz funkcja "oblicz wiek" nie są dostępne poza klasą Human, bo są private
        //człowiek1.name; (niewykonalne)
        //człowiek1.obliczWiek (); (niewykonalne)

        Human człowiek2 = new Human ("Adam", "Nowak", 1992);
        człowiek2.przedstawSię ();

        Human człowiek3 = new Human ("Anna", "Kowalska", 1965);
        człowiek3.przedstawSię ();
        System.out.println (człowiek3.getName () + " " + człowiek3.getSurname ());

        ZadanieCar samochód1 = new ZadanieCar ("Opel", "Astra", 2015);
        samochód1.przyśpiesz (60);
        samochód1.opiszAuto ();

        ZadanieCar samochód2 = new ZadanieCar ("Mercedes", "A-Class", 2017);
        samochód2.przyśpiesz (50);
        samochód2.opiszAuto ();
    }
}


