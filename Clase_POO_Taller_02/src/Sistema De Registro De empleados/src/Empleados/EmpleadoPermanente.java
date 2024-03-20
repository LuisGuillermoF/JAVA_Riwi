package Empleados;

public class EmpleadoPermanente extends Empleado{

    private String permanente = "Permanente";

    public EmpleadoPermanente(String name, int age, int idEmpleado, double salary, String permanente) {
        super(name, age, idEmpleado, salary);
        this.permanente = permanente;
    }

    @Override
    public String toString() {
        return super.toString()+
                "permanente='" + permanente + '\'' +
                '}';
    }
}
