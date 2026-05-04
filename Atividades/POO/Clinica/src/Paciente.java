public class Paciente {
    private String enfermidade;
    private Pessoa pessoa;

    Paciente(String enfermidade, Pessoa pessoa){
        this.enfermidade = enfermidade;
        this.pessoa = pessoa;
    }

    public String getEnfermidade(){
        return enfermidade;
    }

    @Override
    public String toString(){
        return "\nPaciente: " + pessoa + " Enfermidade: " + enfermidade;
    }
}
