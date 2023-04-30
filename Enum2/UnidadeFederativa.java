public enum UnidadeFederativa {
    BAHIA("BA", "Bahia"),
    SAO_PAULO("SP", "SAO PAULO"),
    RIO_DE_JANEIRO("RJ", "Rio de janeiro");

    private String sigla;
    private String texto;

    UnidadeFederativa(String sigla, String texto) {
        this.sigla = sigla;
        this.texto = texto;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
