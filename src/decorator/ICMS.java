package decorator;

public class ICMS extends Imposto {

    public ICMS(Imposto imposto) {
        super(imposto);
    }

    public ICMS(){}

    @Override
    public double calculaImposto(Orcamento orcamento) {
        return orcamento.getValor() * 0.1;
    }
}
