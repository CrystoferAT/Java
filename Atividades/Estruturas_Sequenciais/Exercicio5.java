import java.util.Scanner;
import java.util.InputMismatchException;

public class Exercicio5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int valor = 0;
        boolean condition = true ;

        while (condition) {
            try{
                System.out.println("   ------------------ Caixa Eletroico ------------------");
        System.out.println("Este caixa trabalha com cedulas de R$100, R$50, R$20, R$10, R$5 .");
        System.out.println("O valor deve ser multiplo de 5 .");
        System.out.print("Digite o valor do saque:");
        valor = scanner.nextInt();
                
            if(valor > 0 && valor % 5 == 0){
                break;
                } else {
                    System.out.println("Digite um valor multiplo de 5");
                }
            } catch(InputMismatchException e){
                System.out.println("Digite apenas numeros");
                scanner.next();
            }
        }

        int original = valor;

        int notas100 = valor / 100;
        valor = valor % 100;
        int notas50 = valor / 50;
        valor = valor % 50;
        int notas20 = valor / 20;
        valor = valor % 20;
        int notas10 = valor / 10;
        valor = valor % 10;
        int notas5 = valor / 5;

        System.out.println("\nResultado:");
        System.out.printf("Valor %d,00 , %d notas de 100, %d notas de 50, %d notas de 20, %d notas de 10, %d notas de 5\n", 
        original, notas100, notas50, notas20, notas10, notas5);

        scanner.close();
    }
}
