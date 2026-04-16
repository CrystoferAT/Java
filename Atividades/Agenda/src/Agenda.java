import java.util.*; 

public class Agenda {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contato> lista = new ArrayList<>();
        int opcao;

        while (true) {
            menuPrincipal();
            opcao = scanner.nextInt();
            scanner.nextLine();

            if(opcao == 5){
                break;
            }
            switch (opcao) {
                case 1:
                case 2:
                    while (true) {
                        menuEditar();
                        opcao = scanner.nextInt();
                        scanner.nextLine();
                        
                        if(opcao == 3){
                            break;
                        }
                        
                        switch (opcao) {

                            case 1:
                            case 2:
                            case 3:
                            break;
                                    
                            default:
                                System.out.println("Opcao invalida!");
                        }
                    }
                case 3:
                case 4:
                    listarContatos(lista);
            
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
        String nome = scanner.next();

        System.out.println("Informe o E-mail: ");
        String email = scanner.next();

        System.out.println("Informe o Telefone: ");
        String telefone = scanner.next();
        
        lista.add(new Contato(nome, email, telefone));

        System.out.println("Contato Adicionado! ");
    }

    public static void editarEmail(Scanner scanner, ArrayList<Contato> lista){
        if(lista.isEmpty()){
            System.out.println("Agenda Vazia!");
            return;
        }
        
    }
    public static void editarTelefone(Scanner scanner, ArrayList<Contato> lista){
        if(lista.isEmpty()){
            System.out.println("Agenda Vazia!");
            return;
        }

    }

    public static void listarContatos(ArrayList<Contato> lista){
        if(lista.isEmpty()){
            System.out.println("Sua lista esta vazia!");
            return;
        }

        for (Contato contato : lista) {
            System.out.println(contato);
        }
    }
}