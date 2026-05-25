import java.util.*;
import java.io.*;

public class Temperatura{
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ArrayList<String> lista = new ArrayList<>();
        File arquivo = new File("temperaturas.txt");
        Scanner leitor = new Scanner(arquivo);
        
        while(leitor.hasNextLine()){
            lista.add(leitor.nextLine());
        }
        
        leitor.close();

        double temperaturaAnual = 0;
        
        for(String linha : lista){
            String[] partes = linha.split(";");
            double temperatura = Double.parseDouble(partes[1]);
            temperaturaAnual += temperatura; 
        }

        double media = temperaturaAnual / lista.size();

        System.out.println("--------------------------------------------------------");
        System.out.println("Mes                   Temperatura              Diferenca");
        System.out.println("--------------------------------------------------------");

        for(String linha : lista){
            String[] partes = linha.split(";");

            String nome = partes[0];
            double temperatura = Double.parseDouble(partes[1]);

            System.out.printf("\n%-15s %12.1f°C  %20.1f°C", nome , temperatura, temperatura-media );
        }
        System.out.println("\n--------------------------------------------------------");
        System.out.printf(" Temperatura Media Anual: %.1f°C" , media);

    }
}
