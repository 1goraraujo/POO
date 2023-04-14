public class Funcionario {
    private int CodigoFuncionario;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;

    private Conta banco;

    public Funcionario(int codigoFuncionario, String nome, String endereco, String telefone, String email, Conta banco) {
        CodigoFuncionario = codigoFuncionario;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.banco = banco;
    }

    public int getCodigoFuncionario() {
        return CodigoFuncionario;
    }

    public void setCodigoFuncionario(int codigoFuncionario) {
        CodigoFuncionario = codigoFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Conta getBanco() {
        return banco;
    }

    public void setBanco(Conta banco) {
        this.banco = banco;
    }
}
