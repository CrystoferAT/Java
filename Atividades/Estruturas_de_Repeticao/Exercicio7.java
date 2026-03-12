public class Exercicio7 {
    public static void main(String[] args){
        int i = 1;
        double j = 100, resultado = 0, soma = 0;

        for (i = 1; i <= 10; i++){
            resultado += (double) i / j;
            System.out.printf("%d/%.0f = %.2f . ", i, j, resultado);
            j--;
            soma += resultado;
        }
        
        System.out.printf("\nA somas dos resultados é : %.2f", soma);

    }
}
