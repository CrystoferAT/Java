class Item{
    private String titulo;
    private int anoDePublicacao;

    Item(String titulo, int anoDePublicacao) {
        this.titulo = titulo;
        this.anoDePublicacao = anoDePublicacao;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo; 
    }

    public void setAnoDePublicacao(int anoDePublicacao){
        this.anoDePublicacao = anoDePublicacao;
    } 

    public String getTitulo(){
        return titulo;
    }

    public int getAnoDePublicacao(){
        return anoDePublicacao;
    }

    @Override
    public String toString(){
        return  "Titulo: " +titulo + ", Ano: " + anoDePublicacao;
    }
    
}