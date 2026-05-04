import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        
        Livro l1 = new Livro("Cronicas de Gelo e Fogo", "George R.R Martin");
        Cliente c1 = new Cliente("Crystofer", 29);
        Emprestimo e1 = new Emprestimo(LocalDate.of(2026,12,12) , c1, l1);

        e1.detalhes();

    }
}
