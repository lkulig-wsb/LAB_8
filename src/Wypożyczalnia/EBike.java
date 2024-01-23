package Wypożyczalnia;

public class EBike extends Pojazd {

    //Utworzenie klasy EBike która dziedziczy po klasie Pojazd.

    //Pola klasy EBike
    private double zasięg;
    private double prędkoscMaksymalna;
    private int iloscPrzerzutek;
    private String typ;

    //Utworznie konstruktora klasy Ebike.
    public EBike (int idPojazdu, String model,String marka, double cenaWypożyczenia, boolean dostępny, double zasięg, double prędkoscMaksymalna,
                  int iloscPrzerzutek, String typ){
        super(idPojazdu,model, marka,cenaWypożyczenia,dostępny);
        this.zasięg=zasięg;
        this.prędkoscMaksymalna=prędkoscMaksymalna;
        this.iloscPrzerzutek=iloscPrzerzutek;
        this.typ=typ;

    }

    //Przesłonięcie metod z klasy abstrakcyjnej Pojazd. Gettery.

    @Override
    public String getModel(){
        return super.getModel();
    }
    @Override public String getMarka(){
        return super.getMarka();
    }

    @Override public double getCenaWypozyczenia(){
        return super.getCenaWypozyczenia();
    }
    @Override
    public int getIdPojazdu(){
        return super.getIdPojazdu();
    }
    @Override
    public boolean isDostępny(){
        return super.isDostępny();
    }
    public double getZasięg(){
        return zasięg;
    }
    public double getPrędkoscMaksymalna(){
        return prędkoscMaksymalna;
    }

    public int getIloscPrzerzutek(){
        return iloscPrzerzutek;
    }
    public String getTyp(){
        return typ;
    }

    //Przesłonięcie medody dispPojazdInfo(). Metoda wyświetlająca dane Pojazdu. Przesłonięcie dostarcza własną implementację dla
    // objektu klasy Ebike.
    @Override
    public void dispPojazdInfo() {
        System.out.println("Ebike_ID: " + getIdPojazdu() + " >> Model: " +  getModel() + ", Marka: " + getMarka() + ", Cena Wypożyczenia: " + getCenaWypozyczenia()
                + ", Zasięg: " + getZasięg() + ", Prędkość MAX: " + getPrędkoscMaksymalna() + ", Ilość przerzutek: " + getIloscPrzerzutek() +
                ", Typ: " + getTyp());
        System.out.println("\nCzy dostępny: " + isDostępny() );
    }
    //Przesłonięcie metody do wyliczania kwoty do zapłaty. Metoda w Klasie EBike uwzględnia dodatkowa kwotę kaucji 300PLN
    @Override
    public double wyliczKwoteDoZaplaty(int iloscDni){
        return (iloscDni * getCenaWypozyczenia() + 300);
    }

}
