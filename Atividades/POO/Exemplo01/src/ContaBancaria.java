public class ContaBancaria {
    String titular;
    double saldo = 0;


    public void depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
        }else{
            System.out.println("Digite um valor maior que R$0");
        }

    }
    public void sacar(double valor){
        if(saldo > 0 && valor <= saldo){
            saldo -= valor;
        }else{
            System.out.println("Saldo Insuficiente!");
        }
        
    }
    public void mostrarSaldo(){
        System.out.println(saldo);
    }

}
