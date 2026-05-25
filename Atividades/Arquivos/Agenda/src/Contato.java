class Contato{
    private String nome, telefone, email;

    Contato(String nome, String telefone, String email ){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome(){
        return nome;
    }
    public String getTelefone(){
        return telefone;
    }
    public String getEmail(){
        return email;
    }

}
