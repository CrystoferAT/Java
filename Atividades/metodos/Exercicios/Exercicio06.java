import java.util.*;
public class Exercicio06 {
    public static int tabuada(int num){
        System.out.printf("Tabuada do %d\n", num);
        
        for( int i = 1; i < 11; i++){
            System.out.printf("%d x %d = %d%n", num, i, (num * i));
        }
        
        return num;
    }  
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro para tabuada:");
        int num = scanner.nextInt();

        tabuada(num);

        scanner.close();
        
    }
}
