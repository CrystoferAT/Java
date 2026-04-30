public class Biblioteca {
    public static void main(String[] args) throws Exception {
        
        Livro livro = new Livro("O cavaleiro preso na armadura", 1993, "Robert Fisher", 128);
        DVD dvd = new DVD("Matrix", 1999, "Ficcao Cientifica", 136);
        
        System.out.println(livro);
        System.out.println(dvd);
    }
}
