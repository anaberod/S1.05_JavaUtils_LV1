package Ex5;

import java.io.*;

public class Ex5 {

    public static void main(String[] args) {

        Animal animal = new Animal("Luna", "dog", 5);

        // SERIALIZACIÓN DEL OBJETO
        try (
                // Creamos un flujo de salida hacia un archivo llamado "animal.ser"
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("animal.ser"))) {
            // Escribimos el objeto animal en el archivo
            out.writeObject(animal);
            System.out.println("Animal object serialized successfully to animal.ser");
        } catch (
                IOException e) {
            // Si ocurre un error al serializar, lo mostramos por consola
            System.out.println("Error during serialization: " + e.getMessage());
        }

        // DESERIALIZACIÓN DEL OBJETO
        try (
                // Creamos un flujo de entrada desde el archivo "animal.ser"
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("animal.ser"))) {
            // Leemos el objeto y lo convertimos de nuevo a tipo Animal
            Animal restoredAnimal = (Animal) in.readObject();
            // Mostramos el contenido del objeto deserializado
            System.out.println("Deserialized Animal object: " + restoredAnimal);
        } catch (IOException |
                 ClassNotFoundException e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
    }
}

