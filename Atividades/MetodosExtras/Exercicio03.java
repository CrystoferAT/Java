import java.util.*;

public class Exercicio03 {

    public static float media(float nota1, float nota2, float nota3, char tipo){
        if(tipo == 'A'){
            return (nota1 + nota2 + nota3)/3;
        }else{
            return (nota1 * 5 + nota2 * 3 + nota2 * 2)/ 10;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
            System.out.printf("Digite a 1ª nota do aluno : ");
            float nota1 = scanner.nextFloat();
            
            System.out.printf("Digite a 2ª nota do aluno : ");
            float nota2 = scanner.nextFloat();
            
            System.out.printf("Digite a 3ª nota do aluno : ");
            float nota3 = scanner.nextFloat();
            
            System.out.printf("Informe o tipo de media desejada [A: Aritmetica ou P: Ponderada]: ");
            char tipo = scanner.next().charAt(0);

            System.out.printf("A media do aluno é %.2f", media(nota1,nota2,nota3,tipo));
            scanner.close();
    }
    
}
