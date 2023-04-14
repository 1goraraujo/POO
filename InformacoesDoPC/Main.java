public class Main {
    public static void main(String[] args) {

    Processador processador = new Processador("Intel", "i9", "271328");
    PlacaMae placa = new PlacaMae("RTX", "C45S", "2324");
    Memoria memoria = new Memoria("Kingston", "8239", "480GB");
    DispositivoDeArmazenamento armazenamento = new DispositivoDeArmazenamento("KingSton", "Hs73672", "1TB");
    PC pc = new PC(processador, placa, memoria, armazenamento);

        System.out.println("---Informações do computador---");
        System.out.println("Marca da placa mãe: " +pc.getPlaca().getMarca());
        System.out.println("Modelo da placa mãe: " +pc.getPlaca().getModelo());
        System.out.println("Soquete da placa mãe: " +pc.getPlaca().getSoquete());
        System.out.println("Marca da memoria: " +pc.getMemoria().getMarca());
        System.out.println("Modelo da memoria: " +pc.getMemoria().getModelo());
        System.out.println("Capacidade de armazenamento: " +pc.getMemoria().getCapacidadeArmazenamento());
        System.out.println("Marca do SSD: " +pc.getDispositivoDeArmazenamento().getMarca());
        System.out.println("Modelo do SSD: " +pc.getDispositivoDeArmazenamento().getModelo());
        System.out.println("Capacidade do SSD: " +pc.getDispositivoDeArmazenamento().getCapacidadeArmazenamento());
        System.out.println("Marca do processador: " +pc.getProcessador().getMarca());
        System.out.println("Modelo do processador: " +pc.getProcessador().getModelo());
        System.out.println("Frequencia do processador: " +pc.getProcessador().getFrequencia());


    }
}