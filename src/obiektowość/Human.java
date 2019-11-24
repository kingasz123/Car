package obiektowość;

import org.jetbrains.annotations.Contract;

public class Human {
    //Atrybuty klasy
    private String name;
    private String surname;
    private Integer birthYear;
    private  Integer age;

    //Konstruktor
     public Human(String name, String surname, Integer birthYear){
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.age = this.obliczWiek ();
    }


    //metody klasy
    private Integer obliczWiek (){
        Integer actualYear = 2019;
        return  actualYear - this.birthYear;
    }

    public void przedstawSie (){
        System.out.println ("Hej, nazywam się " + this.name + "  " + this.surname + ".");
        System.out.println ("Mam " + this.age + " lat/a.");
    }
    public String getName () {
        return name;
    }

    public String getSurname () {
        return surname;
    }

    //setter
    public void setBirthYear(int i) {
        this.birthYear = birthYear;
    }

}
