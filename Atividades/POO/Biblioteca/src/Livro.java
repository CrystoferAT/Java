class Livro extends Item {
    private String autor;
    private int numeroDePaginas;

    public void setAutor(String autor ){
        this.autor = autor;
    }

    public void setNumeroDePaginas(int numeroDePaginas){
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getAutor(){
        return autor;
    }

    public int getNumeroDePaginas(){
        return numeroDePaginas;
    }
}
