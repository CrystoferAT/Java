import java.util.Scanner;
import java.util.ArrayList;

class Exemplo01{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String>nomes = new ArrayList<>();

        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Joao");

        System.out.println(nomes);
        System.out.println(nomes.get(0));
        nomes.set(1,"Pedro");
        System.out.println(nomes);
        nomes.remove("Ana");
        System.out.println(nomes);
        nomes.remove(0);
        System.out.println(nomes);
        System.out.println(nomes.size());

        for(int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }
        for(String nome : nomes){
            System.out.println(nome);
        }

        scanner.close();
    }
}