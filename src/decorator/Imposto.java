package decorator;

public abstract class Imposto {
    protected Imposto outroImposto;

    public Imposto(){
    }

    public Imposto(Imposto outroImposto) {
        this.outroImposto = outroImposto;
    }

    abstract double calculaImposto(Orcamento orcamento);
    protected double calculaOutroImposto(Orcamento orcamento) {
        return
    }
}
