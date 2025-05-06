import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Ex2 {

    public static void main(String[] args) {
        // Verifica que se haya pasado un directorio por parámetro
        if (args.length == 0) {
            System.out.println("Please provide a directory.");
            return;
        }

        File root = new File(args[0]);

        if (!root.exists() || !root.isDirectory()) {
            System.out.println("The path is not a valid directory.");
            return;
        }

        // Llama a la función recursiva para listar el contenido
        listDirectoryRecursively(root, 0);


    }

    private static void listDirectoryRecursively(File dir, int level) {//dir directorio que se explora, level profundidad
        File[] files = dir.listFiles();//método listFiles propio de utils para obtener un array con todos archivos y directorios
        if (files == null) return;// Si no se pueden obtener (por error o permisos), termina

        // Ordena alfabéticamente por nombre
        Arrays.sort(files);

        // Formato para la fecha de última modificación
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        for (File file : files) {
            // Tipo: (D) = Directorio, (F) = Archivo
            String type = file.isDirectory() ? "(D)" : "(F)";//Si file.isDirectory() es verdadero → es una carpeta, muestra (D),Si no → es un archivo, muestra (F)//Guarda el resultado en la variable type.
            String date = sdf.format(new Date(file.lastModified()));//file.lastModified() devuelve la fecha en milisegundos (formato UNIX).//sdf.format(...) convierte esa fecha en una cadena legible como:
            String indent = "  ".repeat(level); // Sangría visual según nivel

            // Imprime la línea con toda la información
            System.out.println(indent + type + " " + file.getName() + " - " + date);

            // Si es directorio, entra en él recursivamente
            if (file.isDirectory()) {
                listDirectoryRecursively(file, level + 1);
            }
        }
    }


}
