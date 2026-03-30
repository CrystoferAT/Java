import java.util.Scanner;

public class Exercicio04 {
    public static void triangulo(int num){
        for(int i = 0; i < num; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero inteiro para a base do triangulo:");
        int num = scanner.nextInt();

        triangulo(num);

        scanner.close();
    }
}
