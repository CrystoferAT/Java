import java.util.ArrayList;
import java.util.Collections;

public class Exemplo02 {
    public static void main(String[] args){
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(20);
        numeros.add(100);
        numeros.add(7);
        
        System.out.println(numeros);
        Collections.sort(numeros);

        System.out.println(numeros);
    }
    
}
