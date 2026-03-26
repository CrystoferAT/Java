import java.util.*;

public class Exercicio03 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> notas = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            System.out.printf("Digite a %d° nota do aluno : ", i+1);
            int notaslidas= scanner.nextInt();
            notas.add(notaslidas);
        }
    }
    
}
