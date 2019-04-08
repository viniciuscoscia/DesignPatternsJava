package templateMethod;

public class IKCV extends TemplateImpostoCondicional {
    @Override
    public double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }

    @Override
    public double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.1;
    }

    @Override
    public boolean usarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500 && temItemMaiorDoQueCem(orcamento);
    }

    private boolean temItemMaiorDoQueCem(Orcamento orcamento) {
        for (Item item : orcamento.getItens()) {
            if(item.getValor() > 100) {
                return true;
            }
        }
        return false;
    }
}
