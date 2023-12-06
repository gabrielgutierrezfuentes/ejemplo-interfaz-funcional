package org.example;


public class Main {
    public static void main(String[] args) {

        // Estos son tus objetos, ya sean controladores, servicios, etc.
        // Se encargan de ejecutar los comandos del usuario.
        EjemploClase objeto1 = new EjemploClase();
        EjemploClase objeto2 = new EjemploClase();

        // Encargado de gestionar el Scanner.
        LectorComando lectorComando = new LectorComando();

        System.out.println("""
                Comandos:
                    incrementar-1:<valor>
                    incrementar-2:<valor>
                    mostrar-1
                    mostrar-2
                    
                    salir
                """);

        while(true) {
            // Si tu clase CLI ya tiene los objetos, no haría falta pasárselos.
            Comando comando = lectorComando.leerComando(objeto1, objeto2);
            String resultado = comando.llamar();

            // El resultado sería lo que devuelven las vistas.
            System.out.println(resultado);
        }
    }
}