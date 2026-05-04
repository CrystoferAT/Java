public class Medico {
    private String especialidade;
    private String crm;
    private Pessoa pessoa;

    Medico(String especialidade, String crm, Pessoa pessoa){
        this.especialidade = especialidade;
        this.crm = crm;
        this.pessoa = pessoa;
    }

    public String getEspecialidade(){
        return especialidade;
    }

    public String getCrm(){
        return crm;
    }

    public String toString(){
        return "\nMedico: " + pessoa + " " + especialidade + " Crm: " +  crm;
    }
}
