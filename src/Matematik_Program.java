import java.util.Scanner;



//Program udviklet af Cosby! Et hurtigt hjælpemiddel til matematik!

public class Matematik_Program {

    public static void main (String[] args)
    {
        System.out.println("Velkommen ærede gæst, hvordan kan jeg hjælpe dig?\nIndsæt venligst en værdi ud " +
                "fra skemaet herunder:\n" + "Tast 1 - for at beregne areal og omkreds af en firkant\n" +
                "Tast 2 - for at beregne en andengradsligningen" +
                "\nTast 3 - for at beregne areal og omkreds af en cirkel" +
                "\nTast 4 - for at omregne temperaturenheder (Celsius/Fahrenheit");

        Scanner scan = new Scanner(System.in);



        String key = scan.nextLine();

        if (key.equals("1"))
        {
            Scanner scan1 = new Scanner(System.in);

            System.out.println("Indsæt længde og bredde af en firkant\n");

            System.out.println("Indsæt længden:");
            double Længde = scan1.nextDouble();

            System.out.println("Indsæt Bredde:");
            double Bredde = scan1.nextDouble();

            double resultal_A = Længde * Bredde;

            double resultat_O = (2 * Længde) + (2 * Bredde);

            System.out.println("Med længden " + Længde + " og bredden " + Bredde + " Er areal og omkreds som følger:\n");
            System.out.println("Areal = " + resultal_A + "\nOmkreds = " + resultat_O);
        }

        else if (key.equals("2"))
        {

        }
    }



}
