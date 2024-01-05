/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenparcial;
import java.util.ArrayList;



/**
 *
 * @author HP
 */
public class Programadores extends Empleado {
     private final ArrayList<String> habilidades;


    public Programadores(String nombre, int idEmpleado, int edad, String email, String telefono) {
        super(nombre, "Programador", idEmpleado, edad, email, telefono);
        habilidades = new ArrayList<>();
    }

    public ArrayList<String> getHabilidades() {
        return habilidades;
    }

    public void agregarHabilidad(String habilidad) {
        habilidades.add(habilidad);
    }

 
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Habilidades: " + habilidades);
    }
}
