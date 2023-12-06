package org.example;

public class ComandosEstaticos {

    // Listas de comandos que no pertenecen a ningún objeto.
    public static String comandoVacio(String[] args) {
        return "ERROR: nombre de comando vacío";
    }

    public static String comandoDesconocido(String[] args) {
        return "ERROR: comando desconocido";
    }

    public static String salir(String[] args) {
        System.exit(1);
        return "";
    }
}
