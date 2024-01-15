package Wypożyczalnia;

 abstract class Pojazd {
     private int idPojazdu;
     private String model;
     private String marka;
     private double cenaWypozyczenia;
     private boolean dostępny;

    public Pojazd(int idPojazdu, String model, String marka, double cenaWypozyczenia, boolean dostępny){
        this.idPojazdu = idPojazdu;
        this.model=model;
        this.marka=marka;
        this.cenaWypozyczenia=cenaWypozyczenia;
        this.dostępny=dostępny;
    }

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

     public abstract void dispPojazdInfo();


}
