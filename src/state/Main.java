package state;

/**
 * State já diz no nome: É indicado para evitar tratativas com um monte de if para estados de um objeto
 * Ver exemplo em TesteDeDescontoExtra sendo aplicado estados sobre um Orçamento
 */

public class Main {

    public static void main(String[] args) {
        Imposto imposto = new ICMS(new ICPP());

        Orcamento orcamento = new Orcamento(500.0);
        double v = imposto.calculaOutroImposto(orcamento);

        System.out.println(v);
    }
}
