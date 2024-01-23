package Wypożyczalnia;

import java.sql.SQLOutput;

//Utworzenie klasy Samochod która dziedziczy po klasie Pojazd.
public class Samochod extends Pojazd {

    //Dane składowe klasy Samochod.
    private int iloscMiejsc;
     private String typSilnika;
     private double przebieg;

   //Konstruktor klasy Samochod.
    public Samochod (int idPojazdu,String model,String marka, double cenaWypożyczenia, boolean dostępny, int iloscMiejsc, String typSilnika, double przebieg){
        super(idPojazdu,model, marka,cenaWypożyczenia,dostępny);//super odnosi się do konstruktora z klasy bzowej.
        this.iloscMiejsc=iloscMiejsc;
        this.typSilnika=typSilnika;
        this.przebieg=przebieg;
    }
    //Przesłonięcie metod z klasy bazowej Pojazd. Gettery.
    @Override
     public String getModel(){
        return super.getModel();
     }
     @Override public String getMarka(){
        return super.getMarka();
     }

     @Override
     public double getCenaWypozyczenia(){
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

     //Gettery klasy Samochod.
    public int getIloscMiejsc(){
        return iloscMiejsc;
    }
    public String getTypSilnika(){
        return typSilnika;
    }
    public double getPrzebieg(){
        return przebieg;
    }

    //Przesłonięcie metod dispPojazdInfo() oraz wyliczKwoteDoZaplaty();
     @Override
     public void dispPojazdInfo() {

         System.out.println("Samochód_ID: " + getIdPojazdu());
         System.out.println("Model: " + getModel() + ", Marka: " + getMarka());
         System.out.println("Cena Wypożyczenia: " + getCenaWypozyczenia());
         System.out.println("Ilość Miejsc: " + getIloscMiejsc() + ", Typ Silnika: " + getTypSilnika() + ", Przebieg:  " + getPrzebieg());
         System.out.println("Czy dostępny: " + isDostępny() );
         System.out.println("\n");
     }
     @Override
     public double wyliczKwoteDoZaplaty(int iloscDni){
        return  iloscDni * getCenaWypozyczenia();
     }


 }
