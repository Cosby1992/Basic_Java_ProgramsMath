import java.util.Scanner;


public class Firkant_Areal_Omkreds {

    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Indsæt længde og bredde af en firkant\n");

        System.out.println("Indsæt længden:");
        double Længde = scan.nextDouble();

        System.out.println("Indsæt Bredde:");
        double Bredde = scan.nextDouble();

        double resultal_A = Længde * Bredde;

        double resultat_O = (2 * Længde) + (2 * Bredde);

        System.out.println("Med længden " + Længde + " og bredden " + Bredde + " Er areal og omkreds som følger:\n");
        System.out.println("Areal = " + resultal_A + "\nOmkreds = " + resultat_O);


    }








}
