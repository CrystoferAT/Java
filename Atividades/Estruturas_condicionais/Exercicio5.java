import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quant;
        float custo, cop1 = 0.25f, cop2 = 0.2f;


        System.out.print("Digite a quantidade de copias: ");
        quant = scanner.nextInt();


        if(quant <= 100){
            custo = quant * cop1;
            System.out.printf("%d copias R$%.2f", quant, custo);
        } else if (quant > 100){
            custo = (quant - 100)*cop2 + 100 * cop1;
            System.out.printf("%d copias custo R$%.2f", quant, custo);
        }
       scanner.close();
    }
}
