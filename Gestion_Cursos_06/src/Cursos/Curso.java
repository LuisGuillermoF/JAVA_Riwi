package Cursos;

import Estudiantes.Estudiante;

import java.util.ArrayList;

public class Curso {

    private String codigo;

    private String nombre;

    private ArrayList<Estudiante> listaEstudiantes;


    public Curso(String codigo, String nombre){
        this.nombre = nombre;
        this.codigo = codigo;
        this.listaEstudiantes = new ArrayList<>();
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }


    @Override
    public String toString() {
        return "Curso " +
                "codigo= '" + codigo + '\'' +
                ", nombre= '" + nombre + '\'' +
                ", listaEstudiantes= " + listaEstudiantes ;
    }
}
