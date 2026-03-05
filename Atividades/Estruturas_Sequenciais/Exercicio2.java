import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        boolean condition = true;
        
        while (condition) {
            try{
         System.out.print("Digite um numero inteiro: ");
        num = scanner.nextInt();
        int mais = num + 1 ;
        int menos = num - 1 ;

        System.out.println("Antecessor: " + menos);
        System.out.println("Numero digitado: " + num);
        System.out.println("Sucessor: " + mais);

        break;

       } catch(InputMismatchException e){
                System.out.println("Erro Digite um numero inteiro.");
                scanner.next();
       }
            
        }
        
        scanner.close();
    }
}
