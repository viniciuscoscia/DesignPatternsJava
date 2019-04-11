package resolucaoProblema;

public class MenorDoisMil extends AbstractFilter {

    @Override
    boolean condicaoEliminar(Fatura fatura) {
        return fatura.getValor() < 2000.00;
    }
}
