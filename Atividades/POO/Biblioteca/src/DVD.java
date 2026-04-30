class DVD extends Item {
    private String categoria;
    private double duracaoEmMinutos;

    DVD(String titulo, int anoPublicacao, String categoria, double  duracaoEmMinutos) {
        super(titulo, anoPublicacao);
        this.categoria = categoria;
        this.duracaoEmMinutos = duracaoEmMinutos ;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    public void setDuracaoEmMinutos(double duracaoEmMinutos){
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getCategoria(){
        return categoria;
    }

    public double getDuracaoEmMinutos(){
        return duracaoEmMinutos;
    }

    @Override
    public String toString(){
        return super.toString() + ", Categoria: "+ categoria +", Duracao: " + duracaoEmMinutos;
    }

}
