public class Caneta {
    String cor;
    float ponta;
    boolean tampada = true;

    public void status(){
        System.out.println("Cor: " + this.cor );
        System.out.println("Ponta: " + this.ponta );
        System.out.println("Tampada: " + this.tampada );
        System.out.println();
    }
    public void tampar(){
        this.tampada = true; 
    }
    public void destampar(){
        this.tampada = false; 
    }
    public void rabiscar(){
        if(tampada){
            System.out.println("Estou tampada nao posso rabiscar");
        }else{
            System.out.println("Estou rabiscando");
        }
    }

}
