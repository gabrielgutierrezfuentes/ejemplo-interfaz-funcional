package org.example;

import java.util.Scanner;

public class LectorComando {

    private final Scanner scanner;

    public LectorComando() {
        scanner = new Scanner(System.in);
    }

    public Comando leerComando(EjemploClase objeto1, EjemploClase objeto2) {
        String entrada = scanner.nextLine();

        String nombreComando = getNombreComando(entrada);
        String[] argumentos = getListaArgumentos(entrada);

        MetodoComando metodo = switch(nombreComando) {
            case "incrementar-1" -> objeto1::incrementar;
            case "incrementar-2" -> objeto2::incrementar;
            case "mostrar-1" -> objeto1::mostrar;
            case "mostrar-2" -> objeto2::mostrar;

            case "salir" -> ComandosEstaticos::salir;

            case "" -> ComandosEstaticos::comandoVacio;
            default -> ComandosEstaticos::comandoDesconocido;
        };

        return new Comando(metodo, argumentos);
    }

    public String getNombreComando(String entrada) {

        String[] comandoConArgumentos = entrada.split(":");
        return comandoConArgumentos[0];
    }

    public String[] getListaArgumentos(String entrada) {

        String[] comandoConArgumentos = entrada.split(":");
        if(comandoConArgumentos.length != 2) {
            return new String[0];
        }

        return comandoConArgumentos[1].split(";");
    }
}
