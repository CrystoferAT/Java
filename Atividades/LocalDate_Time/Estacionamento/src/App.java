import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter; 

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        LocalDate hoje = LocalDate.now();
        LocalTime agora = LocalTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
        
        System.out.println(hoje.format(formato) +" "+ agora.format(formatoHora));

        System.out.println("Informe a Marca do veiculo:");
        String marca = scanner.nextLine();
        
        System.out.println("Informe o modelo do veiculo:");
        String modelo = scanner.nextLine();
        
        System.out.println("Informe a placa do veiculo (aaa-nnnn):");
        String placa = scanner.nextLine();
        
        System.out.println("Informe a hora de entrada do veiculo (HH:mm):");
        String entrada = scanner.nextLine();
        
        LocalTime hora = LocalTime.parse(entrada, formatoHora);

        Duration diferenca = Duration.between(hora, agora);

        long horas = diferenca.toHours();
        long minutos = diferenca.toMinutes() % 60;

        double total = 5.0;

        long minutosRestantes = minutos - 60;

        if(minutosRestantes <= 60){
            total += 0.0;
        }else {
            while(minutosRestantes != 0){
                total += 2.0;
                minutosRestantes -= 15;
            }
        }

        System.out.println("-------------------");
        System.out.println("-------Recibo------");
        System.out.println("-------------------");
        System.out.println("Placa:" + marca);
        System.out.println("Placa:" + modelo);
        System.out.println("Placa:" + placa);
        System.out.println("Entrada" + hora);
        System.out.println("Saida" + agora.format(formatoHora));
        System.out.println("Tempo:" + horas +"h" + minutos + "min");
        System.out.println("Total: R$"+ total);

        scanner.close();
    }
}
