public class ZadanieCar {
    private String marka;
    private  String model;
    private  Integer rokProdukcji;
    private  Integer age;
    private  Integer prędkość;

    ZadanieCar (String marka, String model, Integer rokProdukcji) {
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.age = this.obliczWiek ();
        this.prędkość = 0;
    }

    private Integer obliczWiek (){
        Integer actualYear = 2019;
        return actualYear - rokProdukcji;
    }
    public void przyśpiesz (Integer zmiana){
        this.prędkość += zmiana;
        System.out.println ("Twoja aktualna prękość to: " + this.prędkość);
    }
    public void opiszAuto(){
        System.out.println ("Oto " + this.marka + " " + this.model);
        if (this.age<3){
            System.out.println ("Nowe auto, prawie nie używane");
        }
        else if (this.age<=20) {
            System.out.println ("Trochę już jeździ, ale jeszcze działa");
        }
        else {
            System.out.println ("Nadaje się na złom");
        }
    }
}
