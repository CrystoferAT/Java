import java.time.LocalDate;

public class Consulta {
    private LocalDate data;
    private Medico medico;
    private Paciente paciente;

    Consulta(LocalDate data, Medico medico, Paciente paciente){
        this.data = data;
        this.medico = medico;
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "\n" + data + medico + paciente ;
    }

}
