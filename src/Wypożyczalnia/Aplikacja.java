package Wypożyczalnia;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Aplikacja {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Utworzenie obiektów Klasy Samochód.
        Samochod s1 = new Samochod(1,"C-Max","Ford",350.50,true,6,"diesel",120050.03);
        Samochod s2 = new Samochod(2,"Focus","Ford",280.70,false,5,"benzyna",100050.0);
        Samochod s3 = new Samochod(3,"Astra","Opel",245.00,true,5,"benzyna",110050.0);
        Samochod s4 = new Samochod(4,"Golf","Volkswagen",400.50,true,5,"diesel",50050.0);
        Samochod s5 = new Samochod(5,"3 Series","BMW",550.50,true,4,"diesel",150050.0);
        Samochod s6 = new Samochod(6,"Civic","Honda",350.50,false,5,"hybrid",85000.0);
        //Utworzenie obiektów Klasy EBike.
        EBike eb1 = new EBike(7,"City Commuter 200","EcoBike",120.0,true,320,31.4,15,"city");
        EBike eb2 = new EBike(8,"Trailblazer Pro","MountainVolt",180.0,true,420,25.8,12,"mountain");
        EBike eb3 = new EBike(9,"Urban Sprinter X","EcoBike",100.0,true,120,27.5,9,"city");
        EBike eb4 = new EBike(10,"Off-Road Explorer","PowerCruise",220.0,false,280,21.5,13,"cross");
        EBike eb5 = new EBike(11,"City Navigation Plus","EcoMotion",90.0,true,80,26.7,10,"city");
        EBike eb6 = new EBike(12,"Mountain Prodigy","Extreme-Bikes",170.0,false,330,30.2,18,"mountain");

        //Katalog Samochodów
        Samochod[] katalogSamochodw = {s1,s2,s3,s4,s5,s6};

        //Katalog Rowerów
        EBike[] katalogEBike = {eb1,eb2,eb3,eb4,eb5,eb6};


        //Utworznie Menu aplikacji przy pomocy pętli do while i switcha.

        int wybor;

        do{

            System.out.println("\n=== Menu ===");
            System.out.println("1. Wyświetl katalog samochodow.");
            System.out.println("2. Wyświetl katalog rowerów elektrycznych.");
            System.out.println("3. Wylicz cenę wypożyczenia.");
            System.out.println("4. Wstaw pozycję do kartoteki wypożyczenia.");
            System.out.println("0. Wyjście.");
            System.out.println("\nWybierz opcję: ");

            wybor = scanner.nextInt();

            switch (wybor){

                case 1:

                    //Wyświetlenie katalogu Samochodów za pomocą petli for each.
                    System.out.println("=== Katalog Samochodów ===\n");
                    for(Samochod samochod : katalogSamochodw){
                        samochod.dispPojazdInfo();
                    }
                    break;
                case 2:

                    //Wyświetlenie katalogu EBIKE za pomocą pętli for each.
                    System.out.println("=== Katalog EBIKE ===\n");
                    for(EBike ebike : katalogEBike){
                        ebike.dispPojazdInfo();
                    }
                    break;
                case 3:
                    System.out.println("Wyliczanie kwoty za wypożyczenie pojazdu.");
                    System.out.println("-------------------------------------------");
                    System.out.println("Określ rodzaj pojazdu (1 - Samochód, 2 - EBike): ");
                    int typPojazdu = scanner.nextInt();
                    System.out.println("Podaj ID pojazdu: ");
                    int idPojazdu = scanner.nextInt();
                    System.out.println("Podaj ilość dni wypożyczenia: ");
                    int iloscDni = scanner.nextInt();

                    double cenaWypozyczenia = 0;

                        switch (typPojazdu){
                            case 1:
                                for(Samochod s : katalogSamochodw){
                                    if(s.getIdPojazdu() == idPojazdu){
                                        cenaWypozyczenia = s.wyliczKwoteDoZaplaty(iloscDni);
                                        break;
                                    }
                                }
                                break;

                            case 2:
                                System.out.println("Kwota wypożyczenia uwzględnia 300 PLN kaucji.");
                                for(EBike e : katalogEBike){
                                    if(e.getIdPojazdu()==idPojazdu){
                                        cenaWypozyczenia = e.wyliczKwoteDoZaplaty(iloscDni);
                                        break;
                                    }
                                }
                                break;
                            default:
                                System.out.println("Niepoprawny typ pojazdu.");
                                break;
                        }
                        if (cenaWypozyczenia > 0) {
                            System.out.println("Cena wypożyczenia pojazdu to: " + cenaWypozyczenia);
                        }


                    break;





                case 4:
                    String filePath = "C:/Users/l.kulig/Desktop/plikiJava/potwierdzenieSamochod.txt";
                    PrintStream originalOut = System.out;
                    System.out.println("Kartoteka pojazazdów wypożyczonych");
                    System.out.println("-----------------------------------");
                    System.out.println("Wprowadź tekst w formacie");
                    System.out.println("PojazdID: ");
                    System.out.println("Marka: ");
                    System.out.println("Model: ");
                    System.out.println("Nazwa Klienta: ");
                    System.out.println("Data wypożyczenia: Od: RRRR-MM-DD Do: RRRR-MM-DD\"");
                    System.out.println("Kwota wypożyczenia: ");
                    System.out.println("Wyjście - wpisz Q a następnie Enter");
                    try{
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(filePath),true); // append true, dane będą dopisywane.
                        PrintStream customOut = new PrintStream(fileOutputStream);
                        System.setOut(customOut);


                        String daneDoWpisania;

                        //Warunek - dane będą wprowadzane do momentu wpisania znaku Q i kliknięcia Enter.
                        while(!(daneDoWpisania = scanner.nextLine()).equalsIgnoreCase("Q")){
                            System.out.println(daneDoWpisania);
                        }


                        System.setOut(System.out);
                        customOut.close();

                    }catch(Exception e){
                        e.printStackTrace();
                    }finally {
                        System.setOut(originalOut);

                        System.out.println("\n Dane zostasły zapisane do pliku.");
                    }
                    break;
                case 0:
                    System.out.println("Wyjście z programu.");
                    break;
                default:
                    System.out.println("Niepoprawny wybór. Spróbuj ponownie.");
            }

        } while (wybor != 0);


    }
}
