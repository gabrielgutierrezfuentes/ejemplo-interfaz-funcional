package org.example;

public class EjemploClase {

    private int atributo;

    public EjemploClase() {
        atributo = 0;
    }


    // Comandos.
    //
    // El hecho de tener la misma cabecera que MétodoComando.llamar,
    // implica que 'implementan' esa interfaz.
    public String incrementar(String[] args) {
        if(args.length != 1) {
            return "ERROR: se espera un argumento, no " + args.length;
        }

        int valor;
        try {
            valor = Integer.parseInt(args[0]);
        } catch(NumberFormatException e) {
            return "ERROR: no es un número";
        }

        atributo += valor;
        return "Se ha incrementado en " + valor;
    }

    public String mostrar(String[] args) {
        if(args.length != 0) {
            return "ERROR: no se esperan argumentos";
        }

        return "El valor actual es " + atributo;
    }
}
