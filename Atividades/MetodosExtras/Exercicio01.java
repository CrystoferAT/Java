import java.util.*;

public class Exercicio01 {
    public static void mensagem(String nome, float valor, float money){
        float troco = money - valor;
        System.out.printf("Voce comprou o produto %s no valor de R$%.2f entregou R$%.2f ao vendedor seu troco sera de R$%.2f.", nome , valor, money, troco );
    }
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.next();
        
        System.out.print("Digite o valor do produto: ");
        float preco = scanner.nextFloat(); 
        
        System.out.print("Digite o valor entregue ao vendedor: ");
        float money = scanner.nextFloat(); 

        mensagem(nome,preco,money);


        scanner.close();
    }
    
}
