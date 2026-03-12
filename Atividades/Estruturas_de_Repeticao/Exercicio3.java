import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        int i, num;

        System.out.print("Digite um numero inteiro: ");
        num = scanner.nextInt();

        for ( i = 1; i <= num; ++i){
            System.out.println(i);
        }

        scanner.close();
    }
    
}
