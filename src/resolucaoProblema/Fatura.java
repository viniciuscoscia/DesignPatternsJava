package resolucaoProblema;

public class Fatura {
    private double valor;
    private String estadoOrigem;

    public Fatura(double valor, String estadoOrigem) {
        this.valor = valor;
        this.estadoOrigem = estadoOrigem;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getEstadoOrigem() {
        return estadoOrigem;
    }

    public void setEstadoOrigem(String estadoOrigem) {
        this.estadoOrigem = estadoOrigem;
    }
}
