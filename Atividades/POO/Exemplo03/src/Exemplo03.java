import java.util.*;

public class Exemplo03 {
    public static void main(String[] args) throws Exception {
        ArrayList<Pessoa> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        lista.add(new Pessoa("Marcelo", 57));
        lista.add(new Pessoa("Ana", 19));
        lista.add(new Pessoa("Felipe", 25));

        String nomeBusca = "Ana";
        boolean encontrado = false;

        /* for(int i = 0; i < 3; i++){
            System.out.print("\nInforme o nome: ");
            String nome = scanner.nextLine();

            System.out.print("\nInforme a idade: ");
            int idade = scanner.nextInt();

            scanner.nextLine();

            lista.add(new Pessoa(nome,idade));

            lista.sort(Comparator.comparing(Pessoa::getNome));

            System.out.println();

        } */

        System.out.println("-----Listagem--------");

        /* for(int i = 0; i < lista.size(); i++){
            System.out.println("Nome: " + lista.get(i).getNome());
            System.out.println("Idade: " + lista.get(i).getIdade());
        } */

        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getNome().equalsIgnoreCase(nomeBusca)){
                lista.get(i).setIdade(21);
                encontrado = true;

                System.out.println("Nome:" + lista.get(i).getNome());
                System.out.println("Idade:" + lista.get(i).getIdade());
            }
        }
        if(!encontrado){
            System.out.println("Nome não encontrado.");
        }
        
        scanner.close();
    }
}
