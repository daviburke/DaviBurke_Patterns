package builder;

public class Computador {
    private String processador;
    private String memoriaRam;
    private String armazenamento;
    private String placaDeVideo;
    private String sistemaOperacional;

    public Computador(String processador, String memoriaRam, String armazenamento,
                      String placaDeVideo, String sistemaOperacional) {
        this.processador = processador;
        this.memoriaRam = memoriaRam;
        this.armazenamento = armazenamento;
        this.placaDeVideo = placaDeVideo;
        this.sistemaOperacional = sistemaOperacional;
    }

    public void exibir() {
        System.out.println("Processador: " + processador);
        System.out.println("RAM: " + memoriaRam);
        System.out.println("Armazenamento: " + armazenamento);
        System.out.println("Placa de vídeo: " + (placaDeVideo != null ? placaDeVideo : "N/A"));
        System.out.println("Sistema operacional: " + (sistemaOperacional != null ? sistemaOperacional : "N/A"));
    }
}
