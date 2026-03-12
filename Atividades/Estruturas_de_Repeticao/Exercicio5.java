import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num, i;

        System.out.print("Digite um numero inteiro: ");
        num = scanner.nextInt();

        System.out.println("Tabuada do : "+ num  );

        for(i = 1; i <= 10; i++){
            int resultado = i * num;
            System.out.println(num + "x" + i + "=" + resultado);
        }

        scanner.close();
    }
    
}
