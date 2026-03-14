import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int i, j, soma = 0;

        for(i = 0; i < 5; i++){
            for(j = 0; j < 5; j++){
                System.out.printf("Digite um numero para o elemento [%d°][%d°]" ,i + 1 , j + 1);
                matriz[i][j] = scanner.nextInt();
            }
        }
        for(i = 0; i < 5; i++){
            
            soma += matriz[2][i];
        }
        System.out.print(soma);

        scanner.close();
    }
    
}
