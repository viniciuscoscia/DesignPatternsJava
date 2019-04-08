package decorator;

public class ISS extends Imposto {
    public ISS(Imposto imposto){
        super(imposto);
    }

    public ISS(){}

    @Override
    public double calculaImposto(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }
}
