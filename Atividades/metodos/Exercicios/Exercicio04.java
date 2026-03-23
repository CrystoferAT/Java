public class Exercicio04 {
    public static float multiplicacao(float a, float b){
        return a * b;
    }
    public static float multiplicacao(float a, float b, float c){
        return a * b * c;
    }
    public static void main(String[] args) {
        System.out.printf("%.2f%n", multiplicacao(2,2));
        System.out.printf("%.2f%n", multiplicacao(2,2,2));
    }
}
