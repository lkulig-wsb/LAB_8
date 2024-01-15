package Wypożyczalnia;

public class EBike extends Pojazd {

    private double zasięg;
    private double prędkoscMaksymalna;
    private int iloscPrzerzutek;
    private String typ;

    public EBike (int idPojazdu, String model,String marka, double cenaWypożyczenia, boolean dostępny, double zasięg, double prędkoscMaksymalna,
                  int iloscPrzerzutek, String typ){
        super(idPojazdu,model, marka,cenaWypożyczenia,dostępny);
        this.zasięg=zasięg;
        this.prędkoscMaksymalna=prędkoscMaksymalna;
        this.iloscPrzerzutek=iloscPrzerzutek;
        this.typ=typ;

    }

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

    @Override
    public void dispPojazdInfo() {
        System.out.println("Ebike_ID: " + getIdPojazdu() + " >> " +  getModel() + " " + getMarka() + " " + getCenaWypozyczenia()
                + " " + getZasięg() + " " + getPrędkoscMaksymalna() + " " + getIloscPrzerzutek() +
                " " + getTyp());
        System.out.println("\nCzy dostępny: " + isDostępny() );
    }

}
