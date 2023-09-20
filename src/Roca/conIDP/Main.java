package Roca.conIDP;
public class Main {
    public static void main(String[] args) {
        ImpresoraLaser impresoraLaser = new ImpresoraLaser();
        ImpresoraInyeccionTinta impresoraInyeccionTinta = new ImpresoraInyeccionTinta();
        impresoraLaser.imprimir();
        impresoraInyeccionTinta.imprimir();
        ImpresoraSantes impresoraSantes = new ImpresoraSantes();
        impresoraSantes.imprimir();
    }
}
