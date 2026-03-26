import java.util.*;
class Exercicio02{

    public static void desconto (String nome, float preco) {
        Float desconto = 0.10f;
        Float total =preco -preco*desconto;

        System.out.printf("Voce acaba de comprar o produto(%s) no valor de %.2f e acaba de ganhar um desconto de 10%%. assim voce vai pagar apenas R$%.2f", nome, preco,total);
        
    }
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        String  nome;
        Float preco; 


     System.out.print("Digite o nome do produto:");
     nome = scanner.next();
     System.out.print("Digite o preco do produto:");
     preco = scanner.nextFloat();

     desconto(nome, preco);
     scanner.close();
    }
}