import java.util.*; 

public class Agenda {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contato> lista = new ArrayList<>();
        int opcao;

        while (true) {
            menuPrincipal();
            System.out.print("\nInforme a opcao:");
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            if(opcao == 5){
                break;
            }
            switch (opcao) {
                case 1:
                    adicionarContato(scanner, lista);
                    break;
                case 2:
                    while (true) {
                        menuEditar();
                        System.out.print("\nInforme a opcao:");
                        opcao = scanner.nextInt();
                        scanner.nextLine();
                        
                        if(opcao == 3){
                            break;
                        }
                        
                        switch (opcao) {

                            case 1:
                                editarTelefone(scanner, lista);
                                break;
                            case 2:
                                editarEmail(scanner, lista);
                                break;
                            case 3:
                            break;

                            default:
                                System.out.println("Opcao invalida!");
                            
                        }
                    }
                    break;
                case 3:
                    excluirContato(scanner, lista);
                    break;
                case 4:
                    listarContatos(lista);
                    break;
            
                default:
                    System.out.println("Opcao invalida!");
            }
            
        }
        
        scanner.close();

    }

    public static void menuPrincipal(){
        System.out.println("-----Agenda-----");
        System.out.println("[1]- Adicionar Contato");
        System.out.println("[2]- Editar Contato");
        System.out.println("[3]- Excluir Contato");
        System.out.println("[4]- Listar Contatos");
        System.out.println("[5]- Sair");
    }
    
    public static void menuEditar(){
        System.out.println("-----Editar-----");
        System.out.println("[1]- Editar Telefone");
        System.out.println("[2]- Editar E-mail");
        System.out.println("[3]- Voltar");
        
    }

    public static void adicionarContato(Scanner scanner, ArrayList<Contato> lista){
        System.out.println("Informe o Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Informe o E-mail: ");
        String email = scanner.nextLine();

        System.out.println("Informe o Telefone: ");
        String telefone = scanner.nextLine();
        
        lista.add(new Contato(nome, email, telefone));

        System.out.println("Contato Adicionado! ");
    }

    public static void editarEmail(Scanner scanner, ArrayList<Contato> lista){
        if(lista.isEmpty()){
            System.out.println("Agenda Vazia!");
            return;
        }

        System.out.println("Nome para buscar:");
        String nomeBusca = scanner.nextLine();

        boolean encontrado = false;

        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getNome().equalsIgnoreCase(nomeBusca)){
                System.out.println("Novo E-mail:");
                String novoEmail = scanner.nextLine();

                lista.get(i).setEmail(novoEmail);
                System.out.println("E-mail atualizado.");

                encontrado = true;
                break;
            }
        }
        
        if(!encontrado){
            System.out.println("Contato nao encontrado!");
        }
    }

    public static void editarTelefone(Scanner scanner, ArrayList<Contato> lista){
        if(lista.isEmpty()){
            System.out.println("Agenda Vazia!");
            return;
        }

        System.out.println("Nome para buscar:");
        String nomeBusca = scanner.nextLine();

        boolean encontrado = false;

        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getNome().equalsIgnoreCase(nomeBusca)){
                System.out.println("Novo Telefone::");
                String novoTelefone = scanner.nextLine();

                lista.get(i).setTelefone(novoTelefone);
                System.out.println("Telefone atualizado.");

               encontrado = true;
                break;
            }
        }

        if(!encontrado){
            System.out.println("Contato nao encontrado!");
        }
        
    }

    public static void excluirContato(Scanner scanner, ArrayList<Contato> lista){
        if (lista.isEmpty()){
            System.out.println("Agenda vazia!");
            return;
        }

        System.out.println("Nome para buscar:");
        String nomeBusca = scanner.nextLine();

        boolean encontrado = false;

        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getNome().equalsIgnoreCase(nomeBusca)){
                lista.remove(i);
                System.out.println("Contato Removido!");

                encontrado = true;
                break;
            }
        }

         if(!encontrado){
            System.out.println("Contato nao encontrado!");
        }

    }


    public static void listarContatos(ArrayList<Contato> lista){
        if(lista.isEmpty()){
            System.out.println("Sua lista esta vazia!");
            return;
        }

        for (int i = 0; i < lista.size(); i++  ) {
            System.out.printf("\n%-20s  | %-15s | %s%n", lista.get(i).getNome(), lista.get(i).getEmail(),lista.get(i).getTelefone());
        }
    }
}