package conIDP;
public class TrabajoImpresion {
    private Imprimible impresora;
    public TrabajoImpresion(Imprimible impresora){
        this.impresora = impresora;
    }

    public Imprimible getImpresora() {
        return impresora;
    }

    public void setImpresora(Imprimible impresora) {
        this.impresora = impresora;
    }
}
