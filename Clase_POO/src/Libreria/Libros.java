package Libreria;

public class Libros {
        private String title ;

        public String autor ;

        public String agePublic;

        public void Libro(){
            this.title = title;
            this.autor = autor;
            this.agePublic = agePublic;
        }
        public String getTitle(){
            return title;
        }

        public void setTitle(String title){
            this.title = title;
        }

        public String getAutor(){
            return  autor;
        }

        public  void setAutor(String autor){
            this.autor = autor;
        }

        public String getAgePublic(){
            return agePublic;
        }

        public void setAgePublic(String agePublic){
            this.agePublic = agePublic;
        }
}
