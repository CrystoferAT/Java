import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] vetor = {1, 2, 3, 4, 5};
        int num, i;
        boolean encontrado = false;

        System.out.print("Digite um numero inteiro: ");
        num = scanner.nextInt();

        for( i = 0; i < 5; i++){
            if(vetor[i] == num){
                System.out.print("Elemento encontrado no indice: " + i);
                encontrado = true;
                break;
            }
        }
        if (encontrado == false){
            System.out.print("Elemento nao encontrado");
        }

    }
    
}
