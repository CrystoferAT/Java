import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       boolean condition = true;

       int snum = 0, fnum = 0;

       while (condition) {
            try{
                 System.out.print("Digite um numero inteiro: ");
        fnum = scanner.nextInt();
        System.out.print("Digite outro numero inteiro: ");
        snum = scanner.nextInt();

        if (fnum < snum){
            System.out.println("Sequencia: "+ fnum +" "+ snum);
            condition = false;
        } else{
            System.out.println("Sequencia: "+ snum +" "+ fnum);
        }
            } catch(InputMismatchException e){
                System.out.print("Digite apenas numeros inteiros! \n");
                scanner.next();
            }
       }
        scanner.close();
    }
}