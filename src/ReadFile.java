import java.io.*;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws IOException {

        String data = persoonLezen();
        System.out.println(data);
        BufferedReader reader = new BufferedReader(new FileReader("src/sources/personen.csv"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/sources/output.txt"));
        String regel = reader.readLine();
        while (regel != null) {
            writer.write(regel);
            writer.newLine();
            regel = reader.readLine();
        }
        reader.close();
        writer.close();
    }


    private static String persoonLezen() {

        File personenLezen = new File("src/sources/personen.csv");

        String data = "";

        try {
            Scanner myReader = new Scanner(personenLezen);
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
            }
            myReader.close();

        } catch (FileNotFoundException e) {
            String error = "An error occurred";
            return error;

        }
        return data;
    }
}
