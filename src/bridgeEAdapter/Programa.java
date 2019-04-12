package bridgeEAdapter;

import java.util.Calendar;

/**
 * Bridge é uma interface entre o seu sistema e outro
 * Adapter é um adaptador de alguma API antiga para uma nova, ou seja, você ainda usa a antiga mas coloca uma
 * "máscara" bonitinha nela para facilitar o uso
 */

public class Programa {

    public static void main(String[] args) throws Exception {
        // regra de negocio
        Mapa mapa = new GoogleMaps();
        mapa.devolveMapa("rua vergueiro");
        // ...
        RelogioDoSistema relogio = new RelogioDoSistema();
        Calendar hoje = relogio.hoje();
    }
}
