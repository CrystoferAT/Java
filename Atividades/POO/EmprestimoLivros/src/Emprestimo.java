import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Emprestimo {
    private LocalDate data;
    private Cliente cliente;
    private Livro livro;

    Emprestimo(LocalDate data, Cliente cliente, Livro livro){
        this.data = data;
        this.cliente = cliente;
        this.livro = livro;
    }

    public void detalhes(){
        System.out.println("Cliente: "+ cliente.getNome() + " Idade:" + cliente.getIdade());
        System.out.println("Livro: " + livro.getTitulo() + " por: " + livro.getAutor());
        System.out.println("Data: " + data);

    }
}


