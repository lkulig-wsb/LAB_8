package Wypożyczalnia;

 public class Samochod extends Pojazd {

     private int iloscMiejsc;
     private String typSilnika;
     private double przebieg;

    public Samochod (int idPojazdu,String model,String marka, double cenaWypożyczenia, boolean dostępny, int iloscMiejsc, String typSilnika, double przebieg){
        super(idPojazdu,model, marka,cenaWypożyczenia,dostępny);
        this.iloscMiejsc=iloscMiejsc;
        this.typSilnika=typSilnika;
        this.przebieg=przebieg;
    }
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

    public int getIloscMiejsc(){
        return iloscMiejsc;
    }
    public String getTypSilnika(){
        return typSilnika;
    }
    public double getPrzebieg(){
        return przebieg;
    }

     @Override
     public void dispPojazdInfo() {

         System.out.println("Samochód_ID: " + getIdPojazdu() + " >> " + getModel() + " " + getMarka() + " " + getCenaWypozyczenia()
         + " " + getIloscMiejsc() + " " + getTypSilnika() + " " + getPrzebieg());
         System.out.println("Czy dostępny: " + isDostępny() );
         System.out.println("------------------------------");
     }


 }
