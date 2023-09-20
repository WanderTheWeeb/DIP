package sinIDP;

import sinIDP.ImpresoraLaser;
import sinIDP.TrabajoImpresion;

public class Main {
    public static void main(String[] args) {

        TrabajoImpresion trabajoImpresion = new ImpresoraLaser();
        trabajoImpresion.imprimir();

    }
}