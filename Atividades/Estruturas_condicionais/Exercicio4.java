import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite um numero inteiro: ");
        int num = scanner.nextInt();


        if(num % 2 == 0){
            System.out.printf("\nNumero %d é divisivel por 2" , num);
        }
        if(num % 7 == 0 ){
            System.out.printf("\nO numero %d é divisivel por 7" , num);
        }
        if(num % 2 != 0 && num % 7 != 0){
            System.out.printf("\nO numero %d nao e divisivel por 2 nem 7.", num);
        }
        scanner.close();
    }
}
