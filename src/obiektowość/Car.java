package obiektowość;

import javax.swing.*;

public class Car {
    private String marka;
    private String model;
    private Integer rokProdukcji;
    private Integer wiek;
    private  Integer prędkość;

    public Car (String marka, String model, Integer rokProdukcji){
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.wiek = this.obliczWiek ();
    }

    private Integer obliczWiek (){
        Integer actualYear = 2019;
        return actualYear - this.rokProdukcji;
    }

    public void przedstaw () {
        System.out.println ("Jest to " + this.marka + " " + this.model);
    }
    public String getMarka () {
        return marka;
    }
    public String getModel () {
        return model;
    }
    public String getrokProdukcji () {
        return String.valueOf (rokProdukcji);
    }
    public String setWiek () {
       return String.valueOf (wiek);
    }
}

