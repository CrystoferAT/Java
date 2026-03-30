import java.util.Scanner;

public class Exercicio05 {

    public static double calcularHorasExtras(int hora, double valorHora){
        return hora * valorHora;
    }
    public static double calcularBonus(double salarioBase){
        if (salarioBase < 300){
            return salarioBase *= 0.1;
        } else{
            return salarioBase *= 0.05;
        }
    }
    public static double calcularDesconto(double salarioBruto){
        return salarioBruto * 0.08;
    }
    public static double calcularSalarioFinal(double salarioBase, double horasExtras, double bonus, double desconto){
        return salarioBase + bonus - desconto;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do Funcionario:");
        String nome = scanner.next();
        
        System.out.println("Informe o salario base:");
        double salarioBase = scanner.nextFloat();
        
        System.out.println("Informe a quantidade de horas extras:");
        int horas= scanner.nextInt();
        
        System.out.println("Informe o valor das horas extras:");
        double valorHora = scanner.nextFloat();

        double horasExtras = calcularHorasExtras(horas,valorHora);
        double bonus = calcularBonus(salarioBase);
        double salarioBruto = salarioBase + horasExtras + bonus;
        double desconto = calcularDesconto(salarioBruto);
        double salarioFinal = calcularSalarioFinal(salarioBase,horasExtras,bonus,desconto);
        
        System.out.printf("Funcionario: %s\n" ,nome);
        System.out.printf("Salario Base: %.2f\n", salarioBase);
        System.out.printf("Horas Extras: %.2f\n", horasExtras);
        System.out.printf("Bonus: %.2f\n", bonus);
        System.out.printf("Desconto: %.2f\n", desconto);
        System.out.printf("Salario Final: %.2f\n", salarioFinal);
        
        scanner.close();
    }
}
