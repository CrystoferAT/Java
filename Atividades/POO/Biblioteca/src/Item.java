class Item{
    private String titulo;
    private int anoDePublicacao;

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
        return toString() + titulo + anoDePublicacao;
    }
    
}