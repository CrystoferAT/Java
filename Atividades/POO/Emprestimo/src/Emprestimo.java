public class Emprestimo {
    private Cliente cliente;
    private Livro livro;
    private String data;

    Emprestimo(Cliente cliente, Livro livro , String data){

        this.cliente = cliente;
        this.livro = livro;
        this.data = data;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}


