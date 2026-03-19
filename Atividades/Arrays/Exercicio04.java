import java.util.*;
public class Exercicio04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> alunos = new ArrayList<>();
        int opcao = 0;
        String nome ; 

            do{
                System.out.println("------MENU------");
                System.out.println("[1] Adicionar aluno.");
                System.out.println("[2] Listar alunos. ");
                System.out.println("[3] Buscar aluno.");
                System.out.println("[4] Remover aluno. ");
                System.out.println("[5] Sair. ");
                System.out.print("\nDigite a opcao: ");
                opcao = scanner.nextInt();
                scanner.nextLine();
                switch (opcao) {
                    case 1: 
                        System.out.println("------Adicionar alunos------");
                        System.out.println("Digite [sair] para sair");
                            do{
                                System.out.print("Digite o nome do aluno:");
                                nome = scanner.nextLine().trim();
                                if(!nome.equalsIgnoreCase("sair")){
                                    alunos.add(nome);
                                    System.out.println("Aluno adicionado com sucesso.");
                                } 
                            }while (!nome.equalsIgnoreCase("sair")  ); 
                            
                            break;
                    case 2:
                        for(String aluno : alunos){
                            System.out.println(aluno);
                        }
                        break;
                    case 3:
                        System.out.print("Digite o nome do aluno para buscar:");
                        String nomeBusca = scanner.nextLine().trim();
                            
                            if(alunos.contains(nomeBusca)){
                                System.out.printf("Aluno %s esta na lista\n", nomeBusca);
                            }else{
                                System.out.printf("Aluno %s nao esta na lista\n", nomeBusca);
                            }
                            
                            break;
                    case 4:
                        System.out.print("Digite o nome do aluno para ser removido:");
                        String nomeDel = scanner.nextLine().trim();
                            
                            if(alunos.contains(nomeDel)){
                                alunos.remove(nomeDel);
                                System.out.printf("Aluno %s removido com sucesso.\n", nomeDel);
                            }else{
                                System.out.printf("Aluno %s nao esta na lista.\n", nomeDel);
                            }
                            
                            break;    
                    default:
                        System.out.println("Opcao invalida");
                        break;
                    }
            }while(opcao != 5);
        scanner.close();
    }
    
}
