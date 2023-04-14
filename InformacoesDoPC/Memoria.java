public class Memoria {
    private String marca;
    private String modelo;
    private String CapacidadeArmazenamento;

    public Memoria(String marca, String modelo, String capacidadeArmazenamento) {
        this.marca = marca;
        this.modelo = modelo;
        CapacidadeArmazenamento = capacidadeArmazenamento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCapacidadeArmazenamento() {
        return CapacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(String capacidadeArmazenamento) {
        CapacidadeArmazenamento = capacidadeArmazenamento;
    }
}
