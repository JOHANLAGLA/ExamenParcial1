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
public class Gerentes extends Empleado {
    private final ArrayList<Empleado> empleadosACargo;

    // Constructor
    public Gerentes(String nombre, int idEmpleado, int edad, String email, String telefono) {
        super(nombre, "Gerente", idEmpleado, edad, email, telefono);
        empleadosACargo = new ArrayList<>();
    }

    // Métodos get y set para encapsulación
    public ArrayList<Empleado> getEmpleadosACargo() {
        return empleadosACargo;
    }

    public void agregarEmpleadoACargo(Empleado empleado) {
        empleadosACargo.add(empleado);
    }

    // Método para mostrar información del gerente
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Empleados a Cargo: " + empleadosACargo);
    }
}
