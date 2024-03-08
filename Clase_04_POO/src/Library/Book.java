package Library;

public class Book {
    //Atributos
    private String title;
    private String autor;
    private String agePublic;
    private boolean prestado;

    //Metodos Obtener

    public String getTitle(){
        return this.title;
    }

    public String getAgePublic(){
        return this.agePublic;
    }

    public String getAutor(){
        return this.autor;
    }

    public boolean getPrestdo(){
        return this.prestado;
    }

    //Metodos para guardar valores

    public void setTitle(String title){
        this.title = setTitle();
    }

    public void setAutor(String autor){
        this.autor = setAutor();
    }

    public void setAgePublic(String agePublic){
        this.agePublic = setAgePublic();
    }

    public void setPrestado(boolean prestado){
        this.prestado = setPrestado();
    }
}
