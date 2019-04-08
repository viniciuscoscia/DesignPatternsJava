package decorator;

public abstract class TemplateImpostoCondicional extends Imposto {

    @Override
    public double calculaImposto(Orcamento orcamento) {
        if(usarMaximaTaxacao(orcamento)){
            return maximaTaxacao(orcamento);
        }
        return minimaTaxacao(orcamento);
    }

    public abstract double minimaTaxacao(Orcamento orcamento);
    public abstract double maximaTaxacao(Orcamento orcamento);
    public abstract boolean usarMaximaTaxacao(Orcamento orcamento);
}
