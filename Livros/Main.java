public class Main {
    public static void main(String[] args) {
        Livro book = new Livro("Moisés: O Mais Feio", "Savio", "1324-2412-214", 343, 325);

        System.out.println("O nome do livro: " + book.getTitulo());
        System.out.println("Autor: "  + book.getAutor());
        System.out.println("ISBN: " + book.getIsbn());
        System.out.println("Numero de pagina: " + book.getNumeroPaginas());
        System.out.println("Valor da compra: " + book.getValorCompra());
    }
}