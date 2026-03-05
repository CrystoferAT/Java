import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int valor;

        System.out.print("Digite um numero inteiro entre 0 e 9: ");
        valor = scanner.nextInt();

        if(valor == 0){
            System.out.print("Zero");
        }
        else if(valor == 1){
            System.out.print("Um");
        }
        else if(valor == 2){
            System.out.print("Dois");
        }
        else if(valor == 3){
            System.out.print("Tres");
        }
        else if(valor == 4){
            System.out.print("Quatro");
        }
        else if(valor == 5 ){
            System.out.print("Cinco");
        }
        else if(valor == 6){
            System.out.print("Seis");
        }
        else if(valor == 7){
            System.out.print("Sete");
        }
        else if(valor == 8){
            System.out.print("Oito");
        }
        else if(valor == 9){
            System.out.print("Nove");
        } else {
            System.out.print("Voce nao digitou um numero valido!");
        }
        
        scanner.close();
    }
}
