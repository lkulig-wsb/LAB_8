package Wypożyczalnia;

 //Utworzenie abstrakcyjnej klasy Pojazd.
abstract class Pojazd {
    //Pola klasy Pojazd.
    private int idPojazdu;
     private String model;
     private String marka;
     private double cenaWypozyczenia;
     private boolean dostępny;

    //Utworznie konstruktora klasy Pojazd.
     public Pojazd(int idPojazdu, String model, String marka, double cenaWypozyczenia, boolean dostępny){
        this.idPojazdu = idPojazdu;
        this.model=model;
        this.marka=marka;
        this.cenaWypozyczenia=cenaWypozyczenia;
        this.dostępny=dostępny;
    }

    //Gettery.
    public int getIdPojazdu(){
        return idPojazdu;
    }
    public String getModel(){
        return model;

    }
    public String getMarka(){
        return  marka;
    }

    public double getCenaWypozyczenia(){
        return cenaWypozyczenia;
    }

     public boolean isDostępny() {
         return dostępny;
     }

     //Utworzenie metody abstrakcyjnej której zadaniem będzie wyświetlenie danych pojazdu.
     //Poszczególen klasy pochodne będą dostarczały własną implementację tej metody.
     public abstract void dispPojazdInfo();

    //Metoda abstrakcyjna do wyliczania kwoty do zapłaty.
    public abstract double wyliczKwoteDoZaplaty(int iloscDni);


}
