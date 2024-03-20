package Empleados;

public class EmpleadoTemporal extends Empleado{
    private String temporal = "Temporal";

    public EmpleadoTemporal(String name, int age, int idEmpleado, double salary, String temporal) {
        super(name, age, idEmpleado, salary);
        this.temporal = temporal;
    }

    @Override
    public String toString() {
        return
                super.toString()+
                "temporal='" + temporal + '\'' +
                '}';
    }
}
