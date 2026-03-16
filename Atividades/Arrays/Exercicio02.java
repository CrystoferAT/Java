import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();
        int valor;

        for(int i = 0; i < 5; i++){
            System.out.print("Digite um numero inteiro: ");
            valor = scanner.nextInt();
            numeros.add(valor);

            if( valor % 2 == 0){
            pares.add(valor);
        }else{
                impares.add(valor);
            }
        }
        System.out.println(numeros);
        System.out.println(pares);
        System.out.println(impares);

        scanner.close();
    }
    
}
