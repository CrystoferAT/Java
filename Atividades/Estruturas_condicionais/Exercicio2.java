import java.util.Scanner;

public class Exercicio2{
    public static void main(String[] args ){
        Scanner scanner = new Scanner (System.in);
        int fnum, snum, tnum;

        System.out.print("Digite um numero inteiro: ");
        fnum = scanner.nextInt();
        System.out.print("Digite outro numero inteiro: ");
        snum = scanner.nextInt();
        System.out.print("Digite mais um numero inteiro: ");
        tnum = scanner.nextInt();

        int mnum = 0;

        if (fnum <= snum && fnum <= tnum ){
            mnum = fnum;
        } else if (snum <= fnum && snum <= tnum ){
            mnum = snum;
        } else {
            mnum = tnum;
        }
        System.out.print("Menor numero digitado: " + mnum);
        scanner.close();
    }
}
