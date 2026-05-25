import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe seu cpf: ");
        String cpf = scanner.nextLine();

        
        if(cpf.length() != 11){
            System.out.println("Cpf invalido: Deve conter 11 digitos.");
            return;
        }
        
        boolean iguais = true;
        
        for(int i = 1; i < 11; i++){
            if(cpf.charAt(0) != cpf.charAt(i)){
                iguais = false;
                break;
            }
        }
        if(!iguais){

            int primeiro = 0;
            int segundo = 0;
            int soma1 = 0;
            int soma2 = 0;

            for(int i = 0; i < 9; i++ ){
                soma1 += (cpf.charAt(i) - '0') * (10-i);
            }
            System.out.println(soma1);
            
            for(int i = 0; i < 10; i++ ){
                soma2 += (cpf.charAt(i) - '0')* (11-i);
            }
            System.out.println(soma2);

            int resto1 = soma1 % 11;
            int resto2 = soma2 % 11;

            primeiro =(resto1 > 9 ) ? 0 : 11 - resto1;
            segundo =(resto2 > 9 ) ? 0 : 11 - resto2;

            if(primeiro == (cpf.charAt(9) - '0') && segundo == (cpf.charAt(10) - '0')){
                System.out.println("Cpf Valido");
            }else{
                System.out.println("Cpf Invalido");
            }   
        }

    }
}
