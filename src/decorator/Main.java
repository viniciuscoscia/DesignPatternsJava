package decorator;

/**
 * É criada uma classe abstrata que abstrai a lógica de cálculo de imposto para que a mesma não se repita
 * Verificar TemplateImpostoCondicional e classes que extendem da mesma
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
