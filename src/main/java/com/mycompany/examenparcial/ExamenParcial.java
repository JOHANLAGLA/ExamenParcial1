/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examenparcial;

/**
 *Johan lagla
 * @author HP
 */
public class ExamenParcial {
    public static void main(String[] args) {
        // Crear un programador
        Programadores programador = new Programadores("Johan", 001, 25, "lex_2@email.com", "0987923523");
        programador.agregarHabilidad("C++");
        programador.agregarHabilidad("Java");

        IlustradoresGraficos ilustrador = new IlustradoresGraficos("Juan", 001, 20, "juan@email.com", "0985414786");
        ilustrador.agregarHabilidad("Diseño pagina web");
        ilustrador.agregarHabilidad("Programacion avanzada:");

        Gerentes gerente = new Gerentes("enrique Gerente", 003, 35, "en@email.com", "0991123344");
        gerente.agregarEmpleadoACargo(programador);
        gerente.agregarEmpleadoACargo(ilustrador);

        // Corrección: Crear un Editor con el constructor adecuado
        Editores editor = new Editores("Pablo Editor", 110, 29, "pablo@email.com", "032646584", true);

        System.out.println("Información del Programador:");
        programador.mostrarInformacion();

        System.out.println("\nInformación del Ilustrador Gráfico:");
        ilustrador.mostrarInformacion();

        System.out.println("\nInformación del Gerente:");
        gerente.mostrarInformacion();

        System.out.println("\nInformación del Editor:");
        // Corrección: Utilizar el método correcto para mostrar la información del editor
        editor.mostrarInformacion();
    }
}
