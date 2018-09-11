import java.util.Scanner;


public class Andengradsligning {

    public static void main(String[] args)




    {
        Scanner scan = new Scanner (System.in);  //Initializes a new scanner object


        System.out.println("\nDette program modtager 3 input som ''doubles''" +
                            "\nDet plotter dernæst a, b og c ind i andengradsligningen for at finde løsningen!" +
                            "\nOBS! Kun reelle tal i resultater!" +
                            "\nDouble 'a' må ikke være = 0 !\n");

        System.out.println("\nInsæt venligst en værdi ulig 0 for doublen 'a'");
        double a = scan.nextDouble();

        System.out.println("\nInsæt venligst en værdi for doublen 'b'");
        double b = scan.nextDouble();

        System.out.println("\nInsæt venligst en værdi for doublen 'c'");
        double c = scan.nextDouble();

        double resultat_1 = (-1 * b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        double resultat_2 = (-1 * b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

        System.out.println("Her er det resultaterne af andengradsligningen for værdierne: " + a + ", " + b + " " +
                            "Og " + c + " og resultaterne er: \nResultat 1 = " + resultat_1 + "\nResultat 2 = " +
                            resultat_2);



    }



}
