public enum Genero {
    MASCULINO('M', "Masculino"),
    FEMININO('F', "Feminino");

    private char sigla;
    private String texto;

    Genero(char sigla, String texto) {
        this.sigla = sigla;
        this.texto = texto;
    }

    public char getSigla() {
        return sigla;
    }

    public void setSigla(char sigla) {
        this.sigla = sigla;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
