package CentroComercial;

import java.util.Comparator;

/**
 * Esta classe especifica o critério de ordenação de lojas alfabeticamente pelo seu tipo e
 * a seguir de forma decrescente pela sua área, através da interface Comparator.
 *
 * @authors César Ferreira e João Sanches
 */
public class OrdenarPorTipo implements Comparator<Lojas> {

    /**
     * Compara duas lojas pelo seu tipo (nome da classe) e, quando o tipo é igual, compara as lojas pela sua área.
     *
     * @param t1 primeira loja
     * @param t2 segunda loja
     *
     * na comparação por tipo:
     * * @return
     * * -1 se a primeira letra do nome da primeira loja for alfabeticamente inferior ao da segunda
     * * 1 se a primeira letra do nome da primeira loja for alfabeticamente superior ao da segunda
     * * 0 se o nome começar pela mesma letra
     *
     * na comparação por área (quando a comparação por tipo devolve 0):
     * * @return
     * * -1 se a área da loja t2 for menor que a da loja t1
     * * 0 se a área da loja t2 for igual à área da loja t1
     * * 1 se a área da loja t2 for maior que a da loja t1
     *
     */
    @Override
    public int compare(Lojas t1, Lojas t2) {
        String tipo1 = t1.getClass().getName();
        String tipo2 = t2.getClass().getName();
        int resultado = tipo1.compareTo(tipo2);

        if (resultado == 0) {
            resultado = t2.getArea() < t1.getArea() ? -1 : t2.getArea() == t1.getArea() ? 0 : 1;
        }

        return resultado;
    }
}