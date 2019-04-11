package resolucaoProblema;

public class RegraSP extends AbstractFilter {
    @Override
    boolean condicaoEliminar(Fatura fatura) {
        return fatura.getValor() > 3000.00 && fatura.getValor() < 4500.00 && fatura.getEstadoOrigem().equals("SP");
    }
}
