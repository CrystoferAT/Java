public class Exemplo01 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Pessoa p1 = new Pessoa();
        // p1.nome = "Ana";
        // p1.idade = 25;
        // p1.apresentar();
        
        // Pessoa p2= new Pessoa();
        // p2.nome = "Felipe";
        // p2.idade = 21;
        // p2.apresentar();

        // Caneta c1 = new Caneta();
        // c1.cor = "Azul";
        // c1.ponta = 0.5f;
        // c1.rabiscar();
        // c1.status();

        // Caneta c2 = new Caneta();
        // c2.cor = "Vermelha";
        // c2.ponta = 0.7f;
        // c2.destampar();
        // c2.rabiscar();
        // c2.status();

        // Livro l1 = new Livro();
        // l1.titulo = "O Homem Mais Rico Da Babilônia";
        // l1.autor = "George S. Clason";
        // l1.ano = 1926;
        // l1.exibirInfo();

        // Livro l2 = new Livro();
        // l2.titulo = "Pai Rico Pai Pobre";
        // l2.autor = "Robert T. Kyiosaki";
        // l2.ano = 1997;
        // l2.exibirInfo();

        // ContaBancaria c1 = new ContaBancaria();
        // c1.titular = "Crystofer";
        // c1.saldo = 1200.00;
        // c1.depositar(100.00);
        // c1.sacar(300);
        // c1.sacar(1000);
        // c1.sacar(10);
        // c1.mostrarSaldo();

        Carro c1 = new Carro();
        c1.marca = "Ford";
        c1.modelo = "Focus";
        c1.ligar();
        c1.acelerar();
        c1.acelerar();
        c1.status(); 
        c1.frear();
        c1.status();
        c1.desligar(); 

        Carro c2 = new Carro();
        c2.marca = "WolksWagen";
        c2.modelo = "Gol";
        c2.ligar();
        c2.acelerar();
        c2.acelerar();
        c2.status();
        c2.frear();
        c2.status();
        c2.desligar();



    }
}
