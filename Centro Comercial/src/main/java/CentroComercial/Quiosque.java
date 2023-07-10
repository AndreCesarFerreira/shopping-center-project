package CentroComercial;

/**
 * Representa uma Loja Comum do tipo Quiosque através do número de identificação, do nome da loja, da área,
 * do valor de receitas do ano passado e da quantidade de funcionários.
 *
 * @authors André Ferreira e João Sanches
 */
public class Quiosque extends LojaComum{

    /**
     * O valor da renda fixa que a Loja Comum Quiosque paga ao Centro Comercial.
     */
    private static int rendaFixa = 250;

    /**
     * O tipo de Loja Comum.
     */
    private final String TIPO_LOJA = "Quiosque";

    /**
     * Construtor de uma Loja Comum Quiosque recebendo o número de identificação, o nome, a área,
     * o valor de receitas do ano passado e a quantidade de funcionários.
     *
     * @param numeroId o número de identificação
     * @param nome o nome da loja
     * @param area a área
     * @param receitas as receitas do ano passado
     * @param qtdFunc a quantidade de funcionários
     */
    public Quiosque(String numeroId, String nome, float area, float receitas, int qtdFunc) {
        super(numeroId, nome, area, receitas, qtdFunc);
    }

    /**
     * Construtor de uma Loja Comum Quiosque com todos os atributos omitidos.
     */
    public Quiosque() {
        super();
    }

    /**
     * Devolve o tipo de Loja.
     *
     * @return o tipo de Loja
     */
    public String getTipoLoja() {
        return TIPO_LOJA;
    }

    /**
     * Devolve o valor da renda fixa da Loja Comum Quiosque.
     *
     * @return a renda fixa da Loja Comum Quiosque
     */
    public static int getRendaFixa() {
        return rendaFixa;
    }

    /**
     * Modifica o valor da renda fixa da Loja Comum Quiosque.
     *
     * @param rendaFixa o novo valor da renda fixa da Loja Comum Quiosque
     */
    public static void setRendaFixa(int rendaFixa) {
        Quiosque.rendaFixa = rendaFixa;
    }

    /**
     * Devolve a descrição textual da Loja Comum Quiosque.
     *
     * @return características da Loja Comum Quiosque
     */
    @Override
    public String toString() {
        return String.format("%s do tipo %s.", super.toString(), TIPO_LOJA);
    }

    /**
     * Devolve o valor da renda mensal da Loja Comum Quiosque.
     *
     * @return renda mensal da Loja Comum Quiosque
     */
    @Override
    public float calcularRendaMensal() {
        return getRendaFixa();
    }

    /**
     * Devolve o valor dos custos de segurança da Loja Comum Quiosque.
     *
     * @return o custo de segurança da Loja Comum Quiosque
     */
    @Override
    public float calcularCustosSeguranca() {
        return 0;
    }

    /**
     * Devolve o valor dos custos mensais da Loja Comum Quiosque.
     *
     * @return os custos mensais da Loja Comum Quiosque
     */
    @Override
    public float calcularCustosMensais() {
        return calcularRendaMensal();
    }

    /**
     * Compara duas Lojas Comuns Quiosque e verifica se são iguais ou diferentes.
     *
     * @param outroObjeto outra Loja Comum Quiosque
     * @return true se as lojas forem iguais e false se forem diferentes
     */
    @Override
    public boolean equals(Object outroObjeto) {
        if (!super.equals(outroObjeto)) {
            return false;
        }
        return true;
    }
}
