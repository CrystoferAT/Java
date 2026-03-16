import java.util.ArrayList;
import java.util.Collections;

class Exercicio01{
    public static void main(String[] args){
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Bruno");
        nomes.add("Ana");
        nomes.add("Fernando");
        nomes.add("Diego");
        System.out.println(nomes);
        
        nomes.add("Helena");
        System.out.println(nomes);
        
        nomes.add(0, "Gustavo");
        System.out.println(nomes);
        
        if(nomes.contains("Fernando")){
            System.out.println("Contem o nome Fernando na lista.");
        }
        nomes.remove("Ana");
        System.out.println(nomes);
        
        Collections.sort(nomes);
        System.out.println(nomes);
        
        nomes.clear();
        System.out.println(nomes);

    }
}