package Producto;

public class Product {

    private int id =0;
    private String nombre = "";

    private double precio =0;

    public Product(int id,String nombre,double precio){
        this.id = id;
        this.precio = precio;
        this.nombre = nombre;
    }

    public Product(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Product" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio;
    }
}
