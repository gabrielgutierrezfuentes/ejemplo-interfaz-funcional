package org.example;

public class Comando {

    private final MetodoComando comando;
    private final String[] argumentos;

    public Comando(MetodoComando comando, String[] argumentos) {
        this.comando = comando;
        this.argumentos = argumentos;
    }

    public String llamar() {
        return comando.llamar(argumentos);
    }
}
