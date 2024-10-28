public class Main {
    public static void main(String[] args) {
        String texto = "Hola mundo";

        // Dividir la cadena en palabras
        String[] palabras = texto.split(" ");

        // Crear un StringBuilder para construir la cadena invertida
        StringBuilder builder = new StringBuilder();

        // Agregar las palabras al StringBuilder en orden inverso
        for (int i = palabras.length - 1; i >= 0; i--) {
            builder.append(palabras[i]).append(" ");
        }

        // Imprimir la cadena invertida
        System.out.println(builder.toString().trim());
    }
}
