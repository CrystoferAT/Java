class Exercicio01{
    public static void main(String[] args){
        //int [][] matriz = new int[2][3];
        int [][] matriz = {{1,2,3},{4,5,6}};
        int i, j, soma = 0;

        for(i = 0; i < 2; i++){
            for(j = 0; j < 3; j++){
                soma += matriz[i][j];
            }
        }
        System.out.print(soma);
    
    }
}