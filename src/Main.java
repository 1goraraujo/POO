public class Main {
    public static void main(String[] args) {

    Funcionario funcionario = new Funcionario ("1244124", "Igor", "15.000", Genero.MASCULINO, Setor.FINANCEIRO, 20);

        System.out.println("Nome do funcionário(a): " +funcionario.getNome());
        System.out.println("ID do funcionário(a): " +funcionario.getId());
        System.out.println("Salário do funcionário(a): " +funcionario.getSalario());
        System.out.println("Idade do funcionário(a): " +funcionario.getIdade());
        System.out.println("Gênero do funcionário(a): " +funcionario.getGenero());
        System.out.println("Setor do funcionário(a): " +funcionario.getSetor());
    }
}