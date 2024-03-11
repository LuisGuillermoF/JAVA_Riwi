package Inventario;

import Producto.Product;
import Producto.ProductoEspesifico;

import java.util.ArrayList;

public class Inventory {

    private ArrayList<ProductoEspesifico> listaProductos ;

    public Inventario(){
        this.listaProductos = new ArrayList<>();
    }

    public void addProduct(ProductoEspesifico producto){
            this.listaProductos.add(producto);
    }

    public boolean removeProduct(int id){
        return listaProductos.removeIf(producto -> producto.getId()==id);
    }

    public ProductoEspesifico searchForName(String nombreBuscar){
        for (ProductoEspesifico objProducto: this.listaProductos){
            if (objProducto.getNombre().equalsIgnoreCase(nombreBuscar)){
                return objProducto;
            }
        }
        return null;
    }

    public void listarProductos(){
        for (ProductoEspesifico producto : this.listaProductos){
            System.out.println("ID: "+ producto.getId()
                    +" Nombre: "+ producto.getNombre()+ " Precio: "+ producto.getPrecio());
        }
    }
}
