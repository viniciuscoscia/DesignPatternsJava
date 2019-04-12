package memento;

import java.util.Calendar;

/**
 * Serve para guardar o estado de um objeto e possibilita um "rollback"
 */

public class Programa {

    public static void main(String[] args) {

        Historico historico = new Historico();

        Contrato contrato = new Contrato(Calendar.getInstance(), "Mauricio",
                TipoContrato.NOVO);
        historico.adiciona(contrato.salvaEstado());

        contrato.avanca();
        historico.adiciona(contrato.salvaEstado());

        contrato.avanca();
        historico.adiciona(contrato.salvaEstado());

        contrato.avanca();
        historico.adiciona(contrato.salvaEstado());

        System.out.println(contrato.getTipo());
        contrato.restaura(historico.pega(1));
        System.out.println(contrato.getTipo());

    }
}