package Wypożyczalnia;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Aplikacja {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Obiekty Klasy Samochód
        Samochod s1 = new Samochod(1,"C-Max","Ford",350.50,true,6,"diesel",120.050);
        Samochod s2 = new Samochod(2,"Focus","Ford",280.70,false,5,"benzyna",100.050);
        Samochod s3 = new Samochod(3,"Astra","Opel",245.00,true,5,"benzyna",110.050);
        Samochod s4 = new Samochod(4,"Golf","Volkswagen",400.50,true,5,"diesel",50.050);
        Samochod s5 = new Samochod(5,"3 Series","BMW",550.50,true,4,"diesel",150.050);
        Samochod s6 = new Samochod(6,"Civic","Honda",350.50,false,5,"hybrid",85.00);
        //Obiekty Klasy EBike
        EBike eb1 = new EBike(7,"City Commuter 200","EcoBike",120.0,true,320,31.4,15,"city");
        EBike eb2 = new EBike(8,"Trailblazer Pro","MountainVolt",180.0,true,420,25.8,12,"mountain");
        EBike eb3 = new EBike(9,"Urban Sprinter X","EcoBike",100.0,true,120,27.5,9,"city");
        EBike eb4 = new EBike(10,"Off-Road Explorer","PowerCruise",220.0,false,280,21.5,13,"cross");
        EBike eb5 = new EBike(11,"City Navigation Plus","EcoMotion",90.0,true,80,26.7,10,"city");
        EBike eb6 = new EBike(12,"Mountain Prodigy","Extreme-Bikes",170.0,false,330,30.2,18,"mountain");


        //Menu

        int wybor;

        do{

            System.out.println("\n=== Menu ===");
            System.out.println("1. Wyświetl katalog samochodow.");
            System.out.println("2. Wyświetl katalog rowerów elektrycznych.");
            System.out.println("3. Wylicz cenę wypożyczenia.");
            System.out.println("4. Zapisz do pliku.");
            System.out.println("0. Wyjście.");
            System.out.println("\nWybierz opcję: ");

            wybor = scanner.nextInt();

            switch (wybor){

                case 1:
                    //Katalog Samochodów
                    Samochod[] katalogSamochodw = {s1,s2,s3,s4,s5,s6};
                    //Wyświetlenie katalogu Samochodów
                    System.out.println("=== Katalog Samochodów ===\n");
                    for(Samochod samochod : katalogSamochodw){
                        samochod.dispPojazdInfo();
                    }
                    break;
                case 2:
                    //Katalog Rowerów
                    EBike[] katalogEBike = {eb1,eb2,eb3,eb4,eb5,eb6};
                    //Wyświetlenie katalogu EBIKE
                    System.out.println("=== Katalog EBIKE ===\n");
                    for(EBike ebike : katalogEBike){
                        ebike.dispPojazdInfo();
                    }
                    break;
                case 3:
                    System.out.println("Tu będzie wyliczana cena wypożyczenia.");
                    System.out.println("W budowie...");

                    System.out.println("Podaj ilość dni wypożyczenia: ");
                    int iloscDni = scanner.nextInt();
                    double cenaWypożyczenia = s1.wyliczKwoteDoZaplaty(iloscDni);

                    System.out.println("Cena wypożyczenia samochodu " + s1.getMarka() + " " + s1.getModel() +
                            " na " + iloscDni + " dni to: " + cenaWypożyczenia);
                    break;
                case 4:
                    System.out.println("Ten blok będzie zapisywał dane wypożyczonego pojazdu do pliku");
                    System.out.println("W budowie");
                    break;
                case 0:
                    System.out.println("Wyjście z programu.");
                    break;
                default:
                    System.out.println("Niepoprawny wybór. Spróbuj ponownie.");
            }

        } while (wybor != 0);

        /* Blok TEST
            s1.dispPojazdInfo();
            System.out.println();

            EBike eb1 = new EBike(2,"Model1","Marka1",120.0,false,180.0,31.4,18,"cross");
            eb1.dispPojazdInfo(); */

        //System.out.println("Podaj nazwę pojazdu (s1-s6): ");
        //String nazwaPojazdu = scanner.next();
    }
}
