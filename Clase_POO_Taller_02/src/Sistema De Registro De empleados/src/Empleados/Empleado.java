package Empleados;

import Personas.Persona;

public class Empleado extends Persona {
    private int idEmpleado;
    private double salary;

    public Empleado(String name, int age, int idEmpleado, double salary) {
        super(name, age);
        this.idEmpleado = idEmpleado;
        this.salary = salary;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Empleado" +
                "idEmpleado=" + idEmpleado +
                ", salary=" + salary;
    }
}
