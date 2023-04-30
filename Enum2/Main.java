import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//abertura teclado
        Scanner teclado = new Scanner(System.in);
//metodos
        Endereco endereco = new Endereco("Av Paulista", "10", "Predio azul", "12.345.567", "Sao Paulo", UnidadeFederativa.SAO_PAULO);
        Pessoa pessoa = new Pessoa(123456789, "Igor", LocalDate.of(2003, Month.FEBRUARY, 12), "12 3456-7890", "aleatorio@gmail.com", endereco);

        System.out.println("REGISTRO DO USUARIO:");
        System.out.println("Id: " +pessoa.getId());
        System.out.println("\nNome: " +pessoa.getNome());
        System.out.println("Data de nascimento: " +pessoa.getDataNascimento());
        System.out.println("Idade: " +pessoa.getIdade());
        System.out.println("Telefone: " +pessoa.getTelefone());
        System.out.println("Email: " +pessoa.getEmail());
        System.out.println("Endereco: " +endereco.getLogradouro());
        System.out.println("Numero: " +endereco.getNumero());
        System.out.println("Complemento: " +endereco.getComplemento());
        System.out.println("CEP: " +endereco.getCep());
        System.out.println("Cidade: " +endereco.getCidade());
        System.out.println("UF: " +UnidadeFederativa.SAO_PAULO.getSigla());
    }
}



