package resolucaoProblema;

public abstract class AbstractFilter {

    private AbstractFilter nextFilter;

    boolean removeFatura(Fatura fatura) {
        if (condicaoEliminar(fatura)) {
            return true;
        }

        if (nextFilter != null) {
            return nextFilter.removeFatura(fatura);
        }

        return false;
    }

    protected void setProximo(AbstractFilter filter) {
        this.nextFilter = filter;
    }

    abstract boolean condicaoEliminar(Fatura fatura);

}
