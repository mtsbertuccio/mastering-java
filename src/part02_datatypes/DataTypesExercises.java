package part02_datatypes;

public class DataTypesExercises {

    public static void main(String[] args) {

        // Ejercicio 1:
        // - Declara una variable entera para tu edad y otra para tu ciudad.
        // - Imprímelas en una sola línea.

        /*
        int myAge = 24;
        String myCity = "Ciudad de Buenos Aires";

        System.out.println("Soy de " + myCity + " y tengo " + myAge + " años.");
        */

        // Ejercicio 2:
        // - Declara una variable para el precio de un producto.
        // - Declara otra variable para indicar si está disponible el producto.
        // - Imprime ambos estados.

        /*
        float productPrice = 9.99f;
        boolean hasStock = true;

        System.out.println("Producto: " + productPrice + "\nDisponible?: " + hasStock);
        */

        // Ejercicio 3:
        // - Declara una variable para el puntaje.
        // - Cambíale el valor al puntaje.
        // - Imprimí los cambios en el puntaje.

        /*
        int points = 100;
        System.out.println("Before: " + points);

        points -= 25;
        System.out.println("After: " + points);
        */

        // Ejercicio 4:
        // - Crea un pequeño perfil declarando nombre, año actual año nacimiento, y si le gusta Java.

        /*
        String name = "Matias";
        int currentYear = 2026;
        int birthYear = 2002;

        System.out.println("--- USER DATA ---" + "\nNombre: " + name + "\nAño Actual: " + currentYear + "\nAño Nacimiento: " + birthYear);
        */

        // Ejercicio 5:
        // - Declara una constante para el IVA.
        // - Declara una variable con el precio de un producto.
        // - Imprime el resultado total del precio del producto.

        /*
        final float IVA = 0.21f;
        final float PRODUCT_PRICE = 9.99f;
        final float FINAL_PRODUCT_PRICE = Math.round((PRODUCT_PRICE * IVA) + PRODUCT_PRICE);

        System.out.println("Precio: " + PRODUCT_PRICE + "\nPrecio con IVA: " + FINAL_PRODUCT_PRICE);
        */
    }
}
