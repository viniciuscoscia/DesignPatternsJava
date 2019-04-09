package state;

public abstract class Imposto {
    protected Imposto outroImposto;

    public Imposto() {
    }

    public Imposto(Imposto outroImposto) {
        this.outroImposto = outroImposto;
    }

    abstract double calcula(Orcamento orcamento);

    protected double calculaOutroImposto(Orcamento orcamento) {
        if (outroImposto == null) return 0;
        return outroImposto.calcula(orcamento);
    }
}
