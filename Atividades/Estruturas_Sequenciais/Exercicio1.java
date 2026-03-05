import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       int quant_horas, quant_minutos, quant_segundos, total_segundos;
       
       System.out.print("Informe quantidade de horas: ");
       quant_horas = input.nextInt();
       
       System.out.print("Informe quantidade de minutos: ");
       quant_minutos = input.nextInt();
       
       System.out.print("Informe quantidade de segundos: ");
       quant_segundos = input.nextInt();
       
       total_segundos = quant_horas * 3600 + quant_minutos * 60 + quant_segundos;
       
       System.out.println("Total de segundos: " + total_segundos);
       
       input.close();
    }
}
