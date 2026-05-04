import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p1  = new Pessoa(" Crystofer ",29);        
        Pessoa p2 = new Pessoa(" Joao ", 50);
        Pessoa p3 = new Pessoa(" Maria ", 65);
        
        Medico m1 = new Medico(" Clinico Geral ", " 123 ", p2);
        
        Paciente Pa1 = new Paciente("Diabetes", p3);
        
        Consulta c1 = new Consulta(LocalDate.of(2026,04,27), m1, Pa1);

        System.out.println(c1);
    }
}
