import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int [][] matriz = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},
        {16,17,18,19,20},{21,22,23,24,25}};
        int i, j, soma = 0, menor = 1, maior = 0;

        for (i = 0; i < 5; i++){
            for(j = 0; j < 5; j++){
                soma += matriz[i][j];

                if(matriz[i][j] <= menor ){
                    menor = matriz[i][j];
                }
                if(matriz[i][j] >= maior ){
                    maior = matriz[i][j];
                }
            }
        }
        float media = soma/25;

        System.out.println("Maior valor da matriz: " + maior);
        System.out.println("Menor valor da matriz: " + menor);
        System.out.println("Soma dos valores da matriz: " + soma);
        System.out.println("Media dos valores da matriz: " + media);


    }
    
}
