import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        float cap_tanque = 0;
        float quant_comb = 0;
        float quilom = 0;

        System.out.print("Digite a capacidade do seu tanque: ");
        cap_tanque = scanner.nextFloat(); 
        System.out.print("Digite a quantidade em litros abastecido: ");
        quant_comb = scanner.nextFloat();
        System.out.print("Digite a quilometragem percorrida desde o ultimo abastecimento: ");
        quilom = scanner.nextFloat();

        float consumo = quilom / quant_comb ;
        float auton = (cap_tanque-quant_comb)* consumo;

        System.out.printf("Consumo medio: %.2f Km/L \n" , consumo);
        System.out.printf("Autonomia: %.2f Km" , auton);

        scanner.close();
    }
}
