public class Exemplo02 {
    public static void main(String[] args) throws Exception {
       // System.out.println("Hello, World!");
      // Pessoa p1 = new Pessoa("Ana", 19, 1.72f);
      // System.out.println(p1.getNome());

       Produto pd1 = new Produto("Celular",1500, 10);
       pd1.setPreco(0);
       System.out.printf("Novo preço: R$ %.2f%n" , pd1.getPreco());

    }
}
