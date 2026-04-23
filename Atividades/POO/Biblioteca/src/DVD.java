class DVD extends Item {
    private String categoria;
    private double duracaoEmMinutos;

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    public void setDuracaoEmMinutos(double duracaoEmMinutos){
        this.duracaoEmMinutos = duraEmMinutos;
    }

    public String getCategoria(){
        return categoria;
    }

    public double getDuracaoEmMinutos(){
        return duracaoEmMinutos;
    }

}
