public class Conta {
    private String banco;
    private String agencia;
    private String NumeroConta;
    private String tipoConta;
    private float SaldoAtual;
    private float limiteDisponivel;

    public Conta(String banco, String agencia, String numeroConta, String tipoConta, float saldoAtual, float limiteDisponivel) {
        this.banco = banco;
        this.agencia = agencia;
        NumeroConta = numeroConta;
        this.tipoConta = tipoConta;
        SaldoAtual = saldoAtual;
        this.limiteDisponivel = limiteDisponivel;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return NumeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        NumeroConta = numeroConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public float getSaldoAtual() {
        return SaldoAtual;
    }

    public void setSaldoAtual(float saldoAtual) {
        SaldoAtual = saldoAtual;
    }

    public float getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public void setLimiteDisponivel(float limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }
}
