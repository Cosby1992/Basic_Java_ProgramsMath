import java.util.Scanner;


public class Temperatur_omregner {

    public static void main (String[] args)
        {
            System.out.println("Dette program modtager en temperatur som celcius eller fahrenheit" +
                                "\nDerefter skal der skrives et input der beskriver om vi beregner " +
                                "fra celcius til fahrenheit eller modsat!");

            Scanner scan = new Scanner(System.in);

            System.out.println("Indsæt \"C\" hvis du vil convertere fra celcius til fahrenheit" +
                                "\nIndsæt \"F\" hvis du vil convertere fra fahrenheit til celcius");

            String TempValg = scan.nextLine();

            System.out.println("Indsæt en temperatur");
            double temperatur = scan.nextDouble();

            if (TempValg.equals("F"))
            {
                double resultat = (temperatur-32)/(1.8);

                System.out.println("Når man convertere " + temperatur + "F til Celcius bliver det\n" +
                                    "Celsius = " + resultat + "C");
            }

            else if (TempValg.equals("C"))
            {
                double resultat = (temperatur * 1.8 + 32);

                System.out.println("Når man convertere " + temperatur + "C til Farenheit bliver det\n" +
                        "Fahrenheit = " + resultat + "F");
            }

            else
            {
                System.out.println("Indtastningen blev ikke genkendt, vær sikker på at " +
                                    "du skriver \"F\" eller \"C\" næste gang");
            }






        }








}
