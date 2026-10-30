package part06_structures;

public class StructuresExercises {

    public static void main(String[] args) {

        // Ejercicio 1:
        // - Declara una variable entera con un valor numérico.
        // - Utiliza el operador ternario (`? :`) para verificar si el número es positivo o negativo/cero, e imprime el resultado.

        /*
        int number = 20;
        String result = (number > 0) ? "Positivo" : (number < 0) ? "Negativo" : "Cero";
        System.out.println(result);
        */

        // Ejercicio 2:
        // - Declara dos variables String: `username` y `password`.
        // - Utiliza estructuras condicionales anidadas (if dentro de if) para validar primero el usuario y luego la contraseña.
        // - Imprime el acceso concedido o denegado según corresponda.

        /*
        String username = "matiasbertuccio";
        String password = "password";

        if (username == "matiasbertuccio") {
            if (password == "password") {
                System.out.println("[SYSTEM] — CREDENCIALES CORRECTAS");
            } else {
                System.out.println("[SYSTEM] — CONTRASEÑA INCORRECTA");
            }
        } else {
            System.out.println("[SYSTEM] — USUARIO INCORRECTO");
        }
        */

        // Ejercicio 3:
        // - Declara una variable String que represente el color de un semáforo ("ROJO", "AMARILLO", "VERDE").
        // - Utiliza un switch para imprimir la acción a tomar ("Detenerse", "Precaución", "Avanzar").

        /*
        String trafficLightColor = "ROJO";

        switch (trafficLightColor) {
            case "ROJO":
                System.out.println("Detenerse");
                break;
            case "AMARILLO":
                System.out.println("Precaución");
                break;
            case "VERDE":
                System.out.println("Avanzar");
                break;
            default:
                System.out.println("El color de luz no es una opción válida.");
                break;
        }
        */

        // Ejercicio 4:
        // - Declara una variable entera para la edad de una persona y un booleano `isStudent`.
        // - Evalúa con condiciones compuestas si califica para una tarifa especial (menores de 12 años o estudiantes).
        // - Imprime el resultado.

        /*
        int age = 24;
        boolean isStudent = false;

        if ((age < 12) || (isStudent)) {
            System.out.println("Califica.");
        } else {
            System.out.println("No califica.");
        }
        */

        // Ejercicio 5:
        // - Simula un menú de opciones declarando una variable numérica (1: Perfil, 2: Configuración, 3: Salir).
        // - Utiliza un switch para manejar cada opción y un caso `default` para entradas no válidas.

        /*
        int selectedOption = 1;

        switch (selectedOption) {
            case 1:
                System.out.println("SELECCIONÓ — Perfil.");
                break;
            case 2:
                System.out.println("SELECCIONÓ — Configuración.");
                break;
            case 3:
                System.out.println("SELECCIONÓ — Salir.");
                break;
            default:
                System.out.println("[ERROR] — Opción inválida.");
                break;
        }
        */
    }
}
