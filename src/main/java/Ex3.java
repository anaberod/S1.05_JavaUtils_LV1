import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Ex3 {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a directory.");
            return;
        }

        File root = new File(args[0]);

        if (!root.exists() || !root.isDirectory()) {
            System.out.println("The path is not a valid directory.");
            return;
        }

        // Creamos el archivo de salida
        try (FileWriter writer = new FileWriter("directory_output.txt")) {
            listDirectoryRecursively(root, 0, writer);
            System.out.println("Output written to directory_output.txt");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    private static void listDirectoryRecursively(File dir, int level, FileWriter writer) throws IOException {
        File[] files = dir.listFiles();
        if (files == null) return;

        Arrays.sort(files);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        for (File file : files) {
            String type;
            if (file.isDirectory()) {
                type = "(D)";
            } else {
                type = "(F)";
            }

            String date = sdf.format(new Date(file.lastModified()));
            String indent = "  ".repeat(level);
            String line = indent + type + " " + file.getName() + " - " + date;

            writer.write(line + System.lineSeparator());

            if (file.isDirectory()) {
                listDirectoryRecursively(file, level + 1, writer);
            }
        }
    }
}
