package CentroComercial;

/**
 * Representa uma Loja Âncora do tipo Propria através do número de identificação, do nome da loja, da área,
 * do valor de receitas do ano passado e dos custos de segurança.
 *
 * @authors André Ferreira e João Sanches
 */
public class Propria extends LojasAncora{
    /**
     * O tipo de Loja Âncora.
     */
    private final String TIPO_LOJA = "Propria";

    /**
     * Construtor de uma Loja Ancora Propria recebendo o número de identificação, o nome, a área ocupada,
     * o valor das receitas referente ao ano passado e o custo que a loja paga pela segurança do espaço.
     *
     * @param numeroId o número de identificação da loja
     * @param nome o nome da loja
     * @param area a área que ocupada no centro comercial
     * @param receitas o valor das receitas no ano passado
     * @param custosSeguranca o custo que a loja paga pela segurança
     */
    public Propria(String numeroId, String nome, float area, float receitas, float custosSeguranca) {
        super(numeroId, nome, area, receitas, custosSeguranca);
    }

    /**
     * Construtor de uma Loja Ancora Propria com o valor do custo pela segurança omitido.
     *
     * @param numeroId o número de identificação da loja
     * @param nome o nome da loja
     * @param area a área que ocupada no centro comercial
     * @param receitas o valor das receitas no ano passado
     */
    public Propria(String numeroId, String nome, float area, float receitas) {
        super(numeroId, nome, area, receitas);
    }

    /**
     * Construtor de uma Loja Ancora Propria com todos os atributos omitidos.
     */
    public Propria() {
        super();
    }

    /**
     * Devolve o tipo de Loja Âncora.
     *
     * @return o tipo da Loja Âncora
     */
    public String getTipoLoja() {
        return TIPO_LOJA;
    }

    /**
     * Devolve a descrição textual da Loja Ancora Própria.
     *
     * @return características da Loja Ancora Própria
     */
    public String toString() {
        return String.format("%s do tipo %s.", super.toString(), TIPO_LOJA);
    }

    /**
     * Devolve o valor da renda mensal da Loja Âncora Própria.
     *
     * @return o valor da renda mensal da Loja Âncora Própria
     */
    @Override
    public float calcularRendaMensal() {
        return 0;
    }

    /**
     * Devolve o custo com a segurança da Loja Âncora Própria.
     *
     * @return o custo com a segurança da Loja Âncora Própria
     */
    @Override
    public float calcularCustosSeguranca() {
        return getCustosSeguranca();
    }

    /**
     * Devolve os custos mensais da Loja Âncora Própria
     *
     * @return os custos mensais da Loja Âncora Própria
     */
    @Override
    public float calcularCustosMensais(){
        return calcularCustosSeguranca();
    }

    /**
     * Compara duas Lojas Ancora Proprias e verifica se são iguais ou diferentes.
     *
     * @param outroObjeto outra Loja Ancora Proprias
     * @return true se forem iguais e false se forem diferentes
     */
    @Override
    public boolean equals(Object outroObjeto) {
        if (!super.equals(outroObjeto)) {
            return false;
        }
        return true;
    }
}
