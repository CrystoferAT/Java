import java.util.*;

class Exercicio07{
    public static float calc(int op, float num1, float num2){
        switch (op) {
            case 1: return num1 + num2;
            case 2: return num1 - num2;
            case 3: return num1 * num2;
            case 4: return (num2 != 0) ? num1 / num2 : 0;
            default:
                return 0;
        }
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====Calculadora=====");
        System.out.println("[1] Soma\n[2] Subtracao\n[3] Multiplicacao\n[4] Divisao\n[5] Sair");

        System.out.print("Digite uma opcao:");
        int op = scanner.nextInt();

        if(op >= 5 || op == 0){
            System.out.println("Saindo!");
        }else{
            System.out.print("Digite o primeiro valor:");
            float num1 = scanner.nextFloat();
            System.out.print("Digite o segundo valor:");
            float num2 = scanner.nextFloat();
            
            System.out.printf("%.2f%n",calc(op, num1 , num2));
        }
        scanner.close();
    }
}