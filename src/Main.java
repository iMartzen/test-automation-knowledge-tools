import java.util.Scanner;  // Import the Scanner class

public class Main {                                             //Dit is een klasse -
    public static void main(String args[]) {                    //Dit is het startpunt van mijn programma
        String helloWorld = "Hello World";
        String helloWorld2 = "Hoi Wrald:";
        System.out.println(helloWorld);

        System.out.println("Hello!");

        Scanner scanner = new Scanner(System.in);               // Creërt een scanner object
        System.out.println("Please enter username:");           // Enter een username

        String userName = scanner.nextLine();                   // Leest de user input
        System.out.println("Username is: " + userName);         // Output user input

        //lengte van een String
        System.out.println(helloWorld.length());
        String test2 = String.format("Dit %s een %s van %s", "is", "voorbeeld", "iets leuks");
        System.out.println(test2);

        String waarde = "aap;noot;mies";
        String[] parts = waarde.split(";");
        for (int i=0;i<parts.length;i++)
        {
            System.out.println(parts[i]);
        }
    }

}