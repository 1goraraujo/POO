public class Main {
    public static void main(String[] args) {

     Pessoa pessoa = new Pessoa ("MOA", Genero.FEMININO);

        System.out.println("Nome: " +pessoa.getNome());
        System.out.println("Genero: " +pessoa.getGenero());
    }
}