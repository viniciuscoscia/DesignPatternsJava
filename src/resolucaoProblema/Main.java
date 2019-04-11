package resolucaoProblema;

import java.util.ArrayList;
import java.util.List;

/**
 * Imagine que estamos implementando uma sequência de filtros. Esses filtros precisam eliminar diversas faturas
 * de uma lista, de acordo com algumas regras de negócio: faturas menores que 2000 devem ser eliminadas,
 * faturas maiores do que 8000 devem ser eliminadas, faturas entre 3000 e 4500 que foram emitidas no
 * estado de São Paulo devem ser eliminadas, e assim por diante.
 * <p>
 * Uma implementação procedural produziria uma sequência de ifs enorme para verificar todas essas condições.
 */

public class Main {
    public static void main(String[] args) {
        List<Fatura> faturas = new ArrayList<>();

        faturas.add(new Fatura(1000, "MG")); //Deve ser eliminada
        faturas.add(new Fatura(2000, "RJ"));
        faturas.add(new Fatura(3000, "AM"));
        faturas.add(new Fatura(4000, "SP")); //Deve ser eliminada
        faturas.add(new Fatura(5000, "MG"));
        faturas.add(new Fatura(7000, "RJ"));
        faturas.add(new Fatura(8000, "AM"));
        faturas.add(new Fatura(9000, "RS")); //Deve ser eliminada
        faturas.add(new Fatura(10000, "PR")); //Deve ser eliminada

        faturas = FiltroFaturaExecutor.filtarFaturas(faturas);

        for (Fatura fatura : faturas) {
            System.out.println("Valor: " + fatura.getValor() + " - Origem: " + fatura.getEstadoOrigem());
        }
    }
}
