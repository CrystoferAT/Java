import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio3 {
    public static void main ( String[] args){
        Scanner input = new Scanner(System.in);

        double lata = 0.35;
        double garrafa = 0.6;
        double garrafa2 = 2;

        int quant_lata;
        int quant_garrafa;
        int quant_garrafa2;

        boolean condition = true;

        while ((condition)) {
            try {
            System.out.printf("Digite a quantidade de latas que deseja comprar: ");
        quant_lata = input.nextInt();
        System.out.printf("Digite a quantidade de garrafas de 600 ml que deseja comprar: ");
        quant_garrafa = input.nextInt();
        System.out.printf("Digite a quantidade de garrafas de 2 Litros que deseja comprar: ");
        quant_garrafa2 = input.nextInt();

        System.out.printf("Total em litros: %.2f", quant_lata * lata + quant_garrafa * garrafa + quant_garrafa2 * garrafa2);

        break;

        } catch(InputMismatchException e){
            System.out.println("Digite apenas numeros inteiros");
            input.next();
        }
        }
        
        input.close();
    }
}
