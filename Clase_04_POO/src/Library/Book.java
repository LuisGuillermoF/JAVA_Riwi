package Library;

public class Book {
    //Atributos
    private String title;
    private String autor;
    private String agePublic;
    private boolean prestado;
    private int id = 0;

    public void cambiarEstado(){
        this.prestado = !this.prestado;
    }

    public Book(String title, String autor, String agePublic, boolean prestado) {

        this.title = title;
        this.autor = autor;
        this.agePublic = agePublic;
        this.prestado = prestado;
    }
    public Book(){
        this.id  = id+1;
    }

    //Metodos
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAgePublic() {
        return agePublic;
    }

    public void setAgePublic(String agePublic) {
        this.agePublic = agePublic;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public int getId() {
        return id;
    }

    public void setId(int increment) {
        this.id = increment;
    }

    @Override
    public String toString(){
        return "Book"+
                " Id= "+ id+"\'"+
                "Title= "+title+"\'"+
                " Autor= "+autor+"\'"+
                " Age Public= "+agePublic+"\'"+
                " prestado= "+ prestado;

    }
}
