import java.util.*;
import java.io.*;

public class Agenda {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Contato> lista = new ArrayList<>();
        File arquivo = new File("contato.txt");

        if(arquivo.exists()){

            Scanner leitor = new Scanner(arquivo);

            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] partes = linha.split(";");
                String nome = partes[0];
                String telefone = partes[1];
                String email = partes[2];

                lista.add(new Contato(nome,telefone,email));
            }

            leitor.close();
        }

        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\n=====Agenda======\n");
            System.out.println("[1]-Adicionar");
            System.out.println("[2]-Listar");
            System.out.println("[3]-Sair");
            System.out.print("\nEscolha uma opcao:");

            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Nome: ");
                String nome = scanner.nextLine();

                System.out.print("Telefone: ");
                String telefone = scanner.nextLine();

                System.out.print("E-mail: ");
                String email = scanner.nextLine();

                lista.add(new Contato(nome, telefone, email));

                System.out.println("\nContato adicionado.");
            }

            if(opcao == 2){

                if(lista.isEmpty()){
                    System.out.println("Agenda vazia!");
                }else{
                    lista.sort(Comparator.comparing(Contato::getNome));

                    int num = 1;

                    System.out.printf("\n%-5s | %-20s | %-12s | %-15s\n", "Nº ", "Nome" , "Telefone" , "E-mail");

                    for(Contato c : lista){
                        System.out.printf("%-5d | %-20s | %-12s | %-15s\n",num, c.getNome(), c.getTelefone(), c.getEmail());
                        num++;
                    }
                }
            }
        }

        FileWriter writer = new FileWriter("contato.txt");

        for(Contato c : lista){
            writer.write(c.getNome() + ";" + c.getTelefone() + ";" + c.getEmail() + "\n");
        }
        writer.close();
        scanner.close();

    }
}
