import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int[] vetor = new int[5];
        int i, soma = 0;

        for(i = 0; i < 5; i++){
            System.out.printf("Informe o valor do elemento %d°: ", i +1);
            vetor[i] = scanner.nextInt();
        }
        for(i = 0; i < 5; i++){
            soma +=vetor[i];
        }
        
        float media = soma / 5.0f;

        System.out.println("A media e: "+ media);
        System.out.println("Os valores iguais ou superiores a media :");

        for(i = 0; i < 5; i++){
            if(vetor[i] >= media){
                System.out.print(vetor[i] + " ");
            }
        }

        scanner.close();
    }
    
}
