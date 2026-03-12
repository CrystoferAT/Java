import java.util.Scanner;

public class E7xercicio6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int valor;

        System.out.print("Digite um numero inteiro entre 0 e 9: ");
        valor = scanner.nextInt();

        switch (valor) {
            case 0:
            System.out.print("Zero");
        break;
        case 1:
            System.out.print("Um");
        break;
        case 2:
            System.out.print("Dois");
        break;
        case 3:
            System.out.print("Tres");
        break;
        case 4:
            System.out.print("Quatro");
        break;
        case 5:
            System.out.print("Cinco");
        break;
        case 6:
            System.out.print("Seis");
        break;
        case 7:
            System.out.print("Sete");
        break;
        case 8:
            System.out.print("Oito");
        break;
        case 9:
            System.out.print("Nove");
        break;
            default:
                System.out.print("Voce nao digitou um numero valido!");
                break;
        }
        
        scanner.close();
    }
}
