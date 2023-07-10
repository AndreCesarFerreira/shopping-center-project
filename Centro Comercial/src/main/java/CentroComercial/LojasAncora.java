package CentroComercial;

/**
 * Esta classe permite a construção de uma hierarquia de classes para representarem diferentes
 * tipos de lojas âncora. Especifica membros comuns a todas as subclasses da hierarquia.
 *
 * @authors André Ferreira e João Sanches
 */
public abstract class LojasAncora extends Lojas {

    /**
     * O valor dos custos de segurança.
     */
    private float custosSeguranca;

    /**
     * A quantidade de Lojas Âncora.
     */
    private static int contadorLojasAncora = 0;

    /**
     * O valor por omissão dos custos de segurança.
     */
    private static final float CUSTOS_SEGURANCA_POR_OMISSAO = 250;

    /**
     * Construtor de uma Loja Âncora recebendo o número de identificação, o nome da loja, a área,
     * o valor de receitas do ano passado e o valor de custos de segurança recebidos.
     *
     * @param numId o número de identificação
     * @param nome o nome da loja
     * @param area a área
     * @param receitas o valor de receitas do ano passado
     * @param custosSeguranca os custos de segurança.
     */
    public LojasAncora(String numId, String nome, float area, float receitas, float custosSeguranca){
        super(numId, nome, area, receitas);
        this.custosSeguranca = custosSeguranca;
        this.contadorLojasAncora++;
    }

    /**
     * Construtor de uma Loja Âncora com o número de identificação, o nome da loja, a área,
     * o valor de receitas do ano passado recebidos
     * e o valor por omissão de custos de segurança.
     *
     * @param numId o número de identificação
     * @param nome o nome da loja
     * @param area a área
     * @param receitas o valor de receitas do ano passado
     */
    public LojasAncora(String numId, String nome, float area, float receitas){
        super(numId, nome, area, receitas);
        custosSeguranca = CUSTOS_SEGURANCA_POR_OMISSAO;
        this.contadorLojasAncora++;
    }

    /**
     * Construtor de uma Loja Âncora scom todos os atributos omitidos.
     */
    public LojasAncora(){
        super();
        custosSeguranca = CUSTOS_SEGURANCA_POR_OMISSAO;
        this.contadorLojasAncora++;
    }

    /**
     * Devolve a quantidade de Lojas Ancora no centro Comercial.
     *
     * @return a quantidade de Lojas Ancora criadas
     */
    public static int getContadorLojasAncora() {
        return contadorLojasAncora;
    }

    /**
     /**
     * Modifica a quantidade de Lojas Ancora no centro Comercial.
     *
     * @param contadorLojasAncora a nova quantidade de Lojas Ancora criadas
     */
    public static void setContadorLojasAncora(int contadorLojasAncora) {
        LojasAncora.contadorLojasAncora = contadorLojasAncora;
    }

    /**
     * Devolve o valor dos custos de segurança da Loja Âncora.
     *
     * @return custos de segurança
     */
    public float getCustosSeguranca() {
        return custosSeguranca;
    }

    /**
     * Modifica o valor de custos de segurança da Loja Âncora.
     *
     * @param custosSeguranca o novo valor de custos de segurança
     */
    public void setCustosSeguranca(float custosSeguranca) {
        this.custosSeguranca = custosSeguranca;
    }

    /**
     * Devolve a descrição textual da Loja Âncora.
     *
     * @return características da loja âncora
     */
    public String toString() {
        return String.format("%s é uma loja Âncora", super.toString());
    }

    /**
     * Compara duas lojas e verifica se são iguais ou diferentes.
     *
     * @param outroObjeto outra loja
     * @return true se as lojas forem iguais e false se forem diferentes
     */
    @Override
    public boolean equals(Object outroObjeto) {
        if (!super.equals(outroObjeto)) {
            return false;
        }
        LojasAncora outraLoja = (LojasAncora) outroObjeto;
        return this.custosSeguranca == outraLoja.custosSeguranca;
    }
}
