package dziedziczenie;

import obiektowość.Human;

public class man extends Human {
    private String płeć;
    private Integer waga;
    private Integer siła;

    public man(String name, String surname, Integer birthYear) {
        super (name, surname, birthYear);
        this.płeć = "mężczyzna";
    }
    public void setWaga (Integer waga) {
        this.waga = waga;
    }
    public void oceńSiłę() {
        if (this.waga<45)
            this.siła =1;
        else if (this.waga <=90)
            this.waga=2;
        else
            this.siła = 3;
    }

    @Override
    public void przedstawSie() {
        super.przedstawSie ();
        switch (this.siła) {
            case 1: System.out.println ("Siła nie jest moją mocną stroną."); break;
            case 2: System.out.println ("Jestem wystarczająco silny."); break;
            case 3: System.out.println ("Jestem bardzo silny."); break;
        }
    }

}