public class Exercicio6 {
    public static void main(String[] args){
        int i, n1 = 1, n2 = 1;
    
        for(i =1; i <= 10; i++){
            System.out.print(n1 + (i < 10 ? "," : "."));
            int proximo = n1 + n2;
            n1 = n2;
            n2 = proximo;
        }
    }
    
}
