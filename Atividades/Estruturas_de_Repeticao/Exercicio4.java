import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int num, soma = 0;

        do{
            System.out.print("Digite um numero inteiro: ");
            num = scanner.nextInt();

            soma += num;
        } while (num != 0 );
            System.out.print(soma);

        scanner.close();
    }
}
