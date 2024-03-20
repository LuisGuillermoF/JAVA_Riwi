package Gestion;

import Empleados.Empleado;
import Personas.Persona;

import javax.swing.*;
import java.util.ArrayList;

public class GestionDeEmpleado extends Empleado{

    ArrayList<Persona> listaEmpleados;

    public void gestionEmpleado(ArrayList<Empleado> listaEmpleados){
        this.listaEmpleados = new ArrayList<>();
    }

}
