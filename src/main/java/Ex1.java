import java.io.File;
import java.util.Arrays;

public class Ex1 {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a directory.");
            return;
        }

        File directory = new File(args[0]);

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("The path is not a valid directory.");
            return;

        }
        String[] files = directory.list();

        Arrays.sort(files);

        for (String file : files) {
            System.out.println(file);
        }
    }
}




