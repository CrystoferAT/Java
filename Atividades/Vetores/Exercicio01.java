import java.util.Scanner;

class Exercicio01{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];
        int i;

        for(i = 0; i< 5; i++){
            System.out.printf("Informe o elemento na posicao %d°: ", i +1);
            vetor[i] = scanner.nextInt();
        }
        for(i = 4; i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }
        // for(i = 0; i < vetor.length; i++){
        //     System.out.print(vetor[i] + " ");
        // }
        // for(int elemento : vetor){
        //     System.out.print(elemento + " ");

        // }
    }
}