import java.util.Scanner;
import java.util.ArrayList;


public class Exercicio03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Float> operacoes = new ArrayList<>();

        float valores, totcred = 0, totdeb = 0, cpmf = 0, saldoinicial = 0, saldo = 0;

        System.out.print("Digite o valor do seu saldo:");
        saldoinicial = scanner.nextFloat(); 
        
        do{
            System.out.print("Digite o valor da operacao com numeros positivos para creditos e negativos para debitos:");
            valores = scanner.nextFloat(); 
            
            if(valores != 0){
                operacoes.add(valores);
                if(valores < 0){
                totdeb += Math.abs(Math.abs(valores));
                }else{
                    totcred += valores;
                }
            }
        
        }while(valores != 0);

        cpmf +=  totdeb * 0.004;
        saldo = saldoinicial + totcred - totdeb - cpmf;

        System.out.println("____________________________________");

        for(int i = 0; i < operacoes.size(); i++){
            System.out.printf("\nR$%.2f", operacoes.get(i));
        }

        System.out.println("\n____________________________________");
        System.out.printf("\nTotal de creditos: R$%.2f", totcred);
        System.out.printf("\nTotal de debitos: R$%.2f", totdeb);
        System.out.printf("\nTotal de CPMF: R$%.2f", cpmf);
        System.out.printf("\nSaldo Final: R$%.2f" , saldo);

        scanner.close();
    } 
}
