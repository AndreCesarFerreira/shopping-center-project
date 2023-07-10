package CentroComercial;

/**
 * Representa uma Loja Âncora do tipo Externa através do número de identificação, do nome da loja, da área,
 * do valor de receitas do ano passado, dos custos de segurança e da quantidade de funcionários.
 *
 * @authors André Ferreira e João Sanches
 */
public class Externa extends LojasAncora implements CustosMensais{

    /**
     * A quantidade de funcionários de uma Loja Âncora Externa.
     */
    private int qtdFunc;

    /**
     * O valor da renda fixa que a Loja Âncora Externa paga ao Centro Comercial.
     */
    private final int rendaFixa = 2000;

    /**
     * O tipo de Loja Âncora.
     */
    private final String TIPO_LOJA = "Externa";

    /**
     * A quantidade de funcionários por omissão de uma Loja Âncora Externa.
     */
    private static final int QTDFUNC_POR_OMISSAO = 3;

    /**
     * Construtor de uma Loja Ancora Externa recebendo o número de identificação, o nome da loja, a área,
     * o valor de receitas do ano passado, o valor dos custos de segurança e a quantidade de funcionários.
     *
     * @param numeroId o número de identificação
     * @param nome o nome da loja âncora externa
     * @param area a área
     * @param receitas o valor de receitas do ano passado
     * @param custosSeguranca os custos de segurança
     * @param qtdFunc a quantidade de funcionários
     */
    public Externa(String numeroId, String nome, float area, float receitas, float custosSeguranca, int qtdFunc) {
        super(numeroId, nome, area, receitas, custosSeguranca);
        this.qtdFunc = qtdFunc;
    }


    /**
     * Construtor de uma Loja Ancora Externa recebendo o número de identificação,
     * o nome da loja, a área, o valor de receitas do ano passado, o valor dos
     * custos de segurança e atribuindo a quantidade de funcionários por omissão.
     *
     * @param numeroId o número de identificação
     * @param nome o nome da loja âncora externa
     * @param area a área
     * @param receitas o valor de receitas do ano passado
     * @param custosSeguranca os custos de segurança
     */
    public Externa(String numeroId, String nome, float area, float receitas, float custosSeguranca) {
        super(numeroId, nome, area, receitas, custosSeguranca);
        qtdFunc = QTDFUNC_POR_OMISSAO;
    }

    /**
     * Construtor de uma Loja Ancora Externa com todos os atributos omitidos.
     */
    public Externa() {
        super();
        qtdFunc = QTDFUNC_POR_OMISSAO;
    }

    /**
     * Devolve o tipo de Loja Âncora.
     *
     * @return o tipo de Loja Âncora
     */
    public String getTipoLoja() {
        return TIPO_LOJA;
    }

    /**
     * Devolve a quantidade de funcionários da Loja Âncora Externa.
     *
     * @return a quantidade de funcionários da Loja Âncora Externa
     */
    public int getQtdFunc() {
        return qtdFunc;
    }

    /**
     * Modifica a quantidade de funcionários da Loja Âncora Externa.
     *
     * @param qtdFunc a nova quantidade de funcionários da Loja Âncora Externa
     */
    public void setQtdFunc(int qtdFunc) {
        this.qtdFunc = qtdFunc;
    }

    /**
     * Devolve a descrição textual da Loja Âncora Externa.
     *
     * @return características da Loja Âncora Externa
     */
    public String toString() {
        return String.format("%s do tipo %s.", super.toString(), TIPO_LOJA);
    }

    /**
     * Devolve o valor da renda mensal da Loja Âncora Externa.
     *
     * @return renda mensal da Loja Âncora Externa
     */
    @Override
    public float calcularRendaMensal(){
        float renda = rendaFixa * ( 1 + (getArea()/100)) + getReceitas()/100;
        return renda;
    }

    /**
     * Devolve o valor dos custos de segurança da Loja Âncora Externa.
     *
     * @return custos de segurança da Loja Âncora Externa
     */
    @Override
    public float calcularCustosSeguranca(){
        return getCustosSeguranca();
    }

    /**
     * Devolve o valor dos custos mensais da Loja Âncora Externa
     *
     * @return custos dos custos mensais da Loja Âncora Externa
     */
    @Override
    public float calcularCustosMensais(){
        float custosFunc = getQtdFunc() * 550;
        return custosFunc + calcularCustosSeguranca() + calcularRendaMensal();
    }

    /**
     * Compara duas Lojas Ancora Externas e verifica se são iguais ou diferentes.
     *
     * @param outroObjeto outra Loja Ancora Externa
     * @return true se as lojas forem iguais e false se forem diferentes
     */
    @Override
    public boolean equals(Object outroObjeto) {
        if (!super.equals(outroObjeto)) {
            return false;
        }
        Externa outraLoja = (Externa) outroObjeto;
        return this.qtdFunc == outraLoja.getQtdFunc();
    }
}
