import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero : ");
        float num = scanner.nextInt();
        float menor = num;
        float maior = num;
        
        while(num != 0){
            if(num < menor){
                menor = num;
            }
            if (num > maior){
                maior = num;
            }
            System.out.print("Digite um numero inteiro: ");
             num = scanner.nextInt();
        }
        float amplitude = maior - menor;
        System.out.println("Amplitude: " + amplitude);
    }
    
}
