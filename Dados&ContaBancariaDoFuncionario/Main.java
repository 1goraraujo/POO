public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta("Santander", "906-6", "12345-0", "Poupança", 10.453f, 80.000f);
        Funcionario funcionario = new Funcionario(123456, "Moises", "Bate-Coraçao", "71 98373738", "Moiseschupatoda@hotmail.com", conta);


        System.out.println("---FUNCIONARIOS");
        System.out.println("Nome: " +funcionario.getNome());
        System.out.println("E-mail: " +funcionario.getEmail());
        System.out.println("Endereço: " +funcionario.getEndereco());
        System.out.println("Telefone: " +funcionario.getTelefone());
        System.out.println("Codigo: " +funcionario.getCodigoFuncionario());

        System.out.println("---MAIS INFORMAÇ�ES DO FUNCIONARIO");
        System.out.println("Banco: " +funcionario.getBanco().getBanco());
        System.out.println("Agencia: " +funcionario.getBanco().getAgencia());
        System.out.println("Numero da conta: " +funcionario.getBanco().getNumeroConta());
        System.out.println("Tipo da conta: " +funcionario.getBanco().getTipoConta());
        System.out.println("Saldo: " +funcionario.getBanco().getSaldoAtual());
        System.out.println("Limite disponivel: " +funcionario.getBanco().getLimiteDisponivel());
    }
}