package resolucaoProblema;

public class MaiorOitoMil extends AbstractFilter {
    @Override
    boolean condicaoEliminar(Fatura fatura) {
        return fatura.getValor() > 8000.00;
    }
}
