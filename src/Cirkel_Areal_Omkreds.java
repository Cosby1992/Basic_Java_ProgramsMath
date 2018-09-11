import java.util.Scanner;


public class Cirkel_Areal_Omkreds {


        public static void main (String[] args)
        {
            Scanner scan = new Scanner(System.in);

            System.out.println("\nDette program modtager en cirkels radius som en 'double'\n" +
                                "Derefter beregner programmet areal samt omkreds af en cirkel med denne radius!");

            System.out.println("\nIndsæt radius:");

            double radius = scan.nextDouble();

            double Areal = Math.PI * radius * radius;

            double Omkreds = Math.PI * radius * 2;


            System.out.println("\nEn cirkel med radius = "  + radius + "\n\nHar et Areal = " + Areal + "\nOg en Omkreds = "
                                + Omkreds);





        }











}
