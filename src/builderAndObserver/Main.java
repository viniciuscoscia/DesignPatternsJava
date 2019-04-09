package builderAndObserver;

import java.util.Calendar;

/**
 * O Builder é o padrão pra construir com encadeamento tipo logo abaixo
 * Observer é quando você passa comportamentos no para alguma classe através de outros objetos
 * que tenham uma interface igual implementada
 */

public class Main {
    public static void main(String[] args) {

        NotaFiscal notaFiscal = new NotaFiscalBuilder()
                .comCnpj("999.999.9999/0001-00")
                .com(new ItemDaNota("item1", 202.23))
                .com(new ItemDaNota("item2", 300.23))
                .com(new ItemDaNota("item3", 400.23))
                .adicionaAcao(new EnviadorDeEmail())
                .adicionaAcao(new EnviadorDeSms())
                .adicionaAcao(new Impressora())
                .paraEmpresa("Coscia LTDA.")
                .comObservacoes("Sem observacoes")
                .naData(Calendar.getInstance())
                .constroi();
        System.out.println(notaFiscal.getValorBruto());
    }
}
