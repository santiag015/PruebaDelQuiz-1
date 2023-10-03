public class Libro {
    //Atributos
        String titulo;
        String autor;
        int numeroPagina;
    //Atributos

    /*
    Metodo Constructor para inicializar los atributos
    @param titulo el titulo del libro
    @param autor el autor del libro
    @param numeroPaguina el numero de paginas del libro
    *
    Complejidad temporal : 0(1)Tiempo constante
     */

    public Libro(String titulo, String autor, int numeroPaguina) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPagina = numeroPaguina;
    }//Cierra Libro


    public String getTitulo() {
        return titulo;
    }//Cierra get

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }//Cierra set

    public String getAutor() {
        return autor;
    }//Cierra get

    public void setAutor(String autor) {
        this.autor = autor;
    }//Cierra set

    public int getNumeroPaguina() {
        return numeroPagina;
    }//Cierra get

    public void setNumeroPaguina(int numeroPaguina) {
        this.numeroPagina = numeroPaguina;
    }//Cierra set


}//Cierra Libro