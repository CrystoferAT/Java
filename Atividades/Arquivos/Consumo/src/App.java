import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> lista = new ArrayList<>();
        File arquivo = new File("carros.txt");
        FileWriter writer = new FileWriter("relatorio.txt");
        Scanner leitor = new Scanner(arquivo);
        Scanner scanner = new Scanner(System.in);

        if(arquivo.exists()){
            while (leitor.hasNextLine()) {
                lista.add(leitor.nextLine());
            }
            leitor.close();

            Collections.sort(lista);

            System.out.print("Informe o preco do Combustivel: ");
            double preco = scanner.nextDouble();

            scanner.close();

            File ArquivoR = new File("relatorio.txt");

            for(String linha : lista){
                String[] partes = linha.split(";");
                String marca = partes[0];
                String nome = partes[1];
                double consumoMedio = Double.parseDouble(partes[2]);
                double consumo = 1000/consumoMedio;
                double valorconsumo = consumo*preco;

                String novaLinha = String.format(
                    "%s;%s;%.2f;%.2f;\n",
                    marca,nome,consumo,valorconsumo
                );
                writer.write(novaLinha);
            }
            writer.close();
            System.out.println("Relatório Criado!");

        }else {
            System.out.println("O arquivo 'carros.txt' não foi encontrado.");
        }
    }
}
