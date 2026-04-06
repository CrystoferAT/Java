public class Carro {

    String marca;
    String modelo;
    int velocidade = 0;
    boolean ligado = false;
    
    public void ligar(){
        if(ligado == false){
            ligado = true;
            System.out.println("Carro Ligado!");
        }else{
            System.out.println("O carro ja esta ligado.");
        }
    }
    public void desligar(){
        if(ligado == true && velocidade <= 0){
            ligado = false;
            System.out.println("Carro Desligado!");
        }else if(velocidade > 0){
            System.out.println("Pare o carro para então desligar.");
        }else{
            System.out.println("O carro ja esta desligado.");
        }
    }
    public void acelerar(){
        if(ligado == true){
            velocidade += 10;
        }else{
            System.out.println("Não é possivel acelerar o carro.Carro Desligado");
        }
    }
    public void frear(){
        if(velocidade <= 0){
            System.out.println("O carro ja esta parado.");
        }else{
            velocidade -= 10;
        }
    }
    public void status(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ligado: " + ligado);
        System.out.println("Velocidade: " + velocidade);
    }

}
