import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ex4 {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the path to a .txt file.");
            return;
        }

        File file = new File(args[0]);

        // Verifica si el archivo existe y es un .txt
        if (!file.exists() || !file.isFile() || !file.getName().endsWith(".txt")) {
            System.out.println("The provided path is not a valid .txt file.");
            return;
        }

        // Leer el contenido del archivo línea por línea
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            System.out.println("Content of " + file.getName() + ":");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
