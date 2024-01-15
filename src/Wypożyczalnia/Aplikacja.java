package Wypożyczalnia;

public class Aplikacja {
    public static void main(String[] args){

       Samochod s1 = new Samochod(1,"C-Max","Ford",350.50,true,6,"diesel",120.050);
        Samochod s2 = new Samochod(1,"C-Max","Ford",350.50,true,6,"diesel",120.050);
        Samochod s3 = new Samochod(1,"C-Max","Ford",350.50,true,6,"diesel",120.050);
        Samochod s4 = new Samochod(1,"C-Max","Ford",350.50,true,6,"diesel",120.050);
        Samochod s5 = new Samochod(1,"C-Max","Ford",350.50,true,6,"diesel",120.050);
        Samochod s6 = new Samochod(1,"C-Max","Ford",350.50,true,6,"diesel",120.050);

       //s1.dispPojazdInfo();
        //System.out.println();

       //EBike eb1 = new EBike(2,"Model1","Marka1",120.0,false,180.0,31.4,18,"cross");
       //eb1.dispPojazdInfo();

        System.out.println("=== Katalog Samochodów ===\n");
        Samochod[] katalogSamochodw = {s1,s2,s3,s4,s5,s6};

        for(Samochod samochod : katalogSamochodw){
            samochod.dispPojazdInfo();
        }






    }
}
