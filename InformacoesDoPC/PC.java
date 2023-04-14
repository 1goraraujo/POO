public class PC {
    private Processador processador;
    private PlacaMae placa;
    private Memoria memoria;
    private DispositivoDeArmazenamento dispositivoDeArmazenamento;

    public PC(Processador processador, PlacaMae placa, Memoria memoria, DispositivoDeArmazenamento dispositivoDeArmazenamento) {
        this.processador = processador;
        this.placa = placa;
        this.memoria = memoria;
        this.dispositivoDeArmazenamento = dispositivoDeArmazenamento;
    }

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    public PlacaMae getPlaca() {
        return placa;
    }

    public void setPlaca(PlacaMae placa) {
        this.placa = placa;
    }

    public Memoria getMemoria() {
        return memoria;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }

    public DispositivoDeArmazenamento getDispositivoDeArmazenamento() {
        return dispositivoDeArmazenamento;
    }

    public void setDispositivoDeArmazenamento(DispositivoDeArmazenamento dispositivoDeArmazenamento) {
        this.dispositivoDeArmazenamento = dispositivoDeArmazenamento;
    }
}
