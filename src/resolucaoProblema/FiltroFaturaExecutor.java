package resolucaoProblema;

import java.util.ArrayList;
import java.util.List;

public class FiltroFaturaExecutor {

    public static List<Fatura> filtarFaturas(List<Fatura> faturas) {
        //Método grande e acoplado para facilitar leitura para aprendizado

        List<Fatura> novaListaFatura = new ArrayList<>();

        AbstractFilter f1 = new MenorDoisMil();
        AbstractFilter f2 = new MaiorOitoMil();
        AbstractFilter f3 = new RegraSP();

        f1.setProximo(f2);
        f2.setProximo(f3);

        for (Fatura fatura : faturas) {
            if (!f1.removeFatura(fatura)) {
                novaListaFatura.add(fatura);
            }
        }

        return novaListaFatura;
    }

}
