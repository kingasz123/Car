public class Human {
    //Atrybuty klasy
    private String name;
    private String surname;
    private Integer birthYear;
    private  Integer age;

    //Konstruktor
    Human(String name, String surname, Integer birthYear){
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

    public void przedstawSię (){
        System.out.println ("Hej, nazywam się " + this.name + "  " + this.surname + ".");
        System.out.println ("Mam " + this.age + " lat.");
    }
    public String getName () {
        return name;
    }

    public String getSurname () {
        return surname;
    }

    //setter
    public void setBirthYear () {
        this.birthYear = birthYear;
    }

}
