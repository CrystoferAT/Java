class Livro {
    private String titulo;
    private String autor;
    int anoDePublicacao;
    private int numeroDePaginas;

    Livro(String titulo, int anoPublicacao, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoPublicacao;
        this.numeroDePaginas = numeroPaginas;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getAnoDePublicacao(){
        return anoDePublicacao;
    }

    public int getNumeroDePaginas(){
        return numeroDePaginas;
    }

    @Override
    public String toString(){
        return "Titulo" + titulo + ", Autor: " + autor + "Ano de Publicacao" + anoDePublicacao + ", Numero de Paginas: " + numeroDePaginas;
    }
}
