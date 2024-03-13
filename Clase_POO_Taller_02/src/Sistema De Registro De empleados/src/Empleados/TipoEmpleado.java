package Empleados;

public class TipoEmpleado extends Empleado{
    private String type;

    public TipoEmpleado(String name, int age, int idEmpleado, double salary, String type) {
        super(name, age, idEmpleado, salary);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return  super.getIdEmpleado()+super.getSalary()+super.getName()+super.getAge()+
                "TipoEmpleado{" +
                "type='" + type + '\'' +
                '}';
    }
}
