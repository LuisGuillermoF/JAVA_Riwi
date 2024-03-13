package Gestion;

import Empleados.Empleado;

import javax.swing.*;
import java.util.ArrayList;

public class GestionDeEmpleado extends Empleado{

    ArrayList<Empleado> listaEmpleados = new ArrayList<>();

    public static void añadirPersona(ArrayList<Empleado> listaEmpleados){

        String nombrePersona = JOptionPane.showInputDialog("DIgite el nombre de la persona");
        String edadPersona = JOptionPane.showInputDialog("DIgite la edad de la persona");

        int age = Integer.parseInt(edadPersona);

        listaEmpleados.add(nombrePersona,age);
    };

    public static void añadirPersona(ArrayList<Empleado> listaEmpleados){

        String nombrePersona = JOptionPane.showInputDialog("DIgite el nombre de la persona");
        String edadPersona = JOptionPane.showInputDialog("DIgite la edad de la persona");
        String salarioEmpleado = JOptionPane.showInputDialog("Digete el salario del empleado");

        double salary = Double.parseDouble(salarioEmpleado);

        int age = Integer.parseInt(edadPersona);

        listaEmpleados.add(nombrePersona,salary,age);

    }

}
