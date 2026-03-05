import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite um numero inteiro: ");
        int num = scanner.nextInt();


        if(num % 2 == 0){
            System.out.printf("\nNumero %d é divisivel por 2" , num);
        }
        if(num % 3 == 0 ){
            System.out.printf("\nO numero %d é divisivel por 3" , num);
        }
        if(num % 2 != 0 && num % 3 != 0){
            System.out.printf("\nO numero %d nao e divisivel por 2 nem 3.", num);
        }


        scanner.close();
    }
}
