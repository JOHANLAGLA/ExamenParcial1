/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenparcial;

/**
 *
 * @author HP
 */
class Editores extends Empleado {
    private boolean edicionElectronica;

    public Editores(String nombre, int idEmpleado, int edad, String email, String telefono, boolean edicionElectronica) {
        super(nombre, "Editor", idEmpleado, edad, email, telefono);
        this.edicionElectronica = edicionElectronica;
    }
   
    public boolean isEdicionElectronica() {
        return edicionElectronica;
    }

    public void setEdicionElectronica(boolean edicionElectronica) {
        this.edicionElectronica = edicionElectronica;
    }

  
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Edición Electrónica: " + edicionElectronica);
    }
}
