package chainOfResponsability;

/**
 * Chain of Responsability: a interface tem um método (exemplo setProximo(Orcamento) que obriga que seja
 * passado um novo objeto. Ao chamar o método calcula, é feita uma chamada para o próximo Orcamento caso
 * caia na condição
 */
public class Main {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(500.0);
        orcamento.adicionaItem(new Item("item0", 101));
        orcamento.adicionaItem(new Item("item1", 100));
        orcamento.adicionaItem(new Item("item2", 100));
        orcamento.adicionaItem(new Item("item4", 100));

        System.out.println("Valor do desconto = " + new CalculadorDeDesconto().calcular(orcamento));
    }
}
