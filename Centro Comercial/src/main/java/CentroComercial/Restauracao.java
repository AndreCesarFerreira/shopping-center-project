package CentroComercial;

/**
 * Representa uma Loja Comum do tipo Restauração através do número de identificação, do nome da loja, da área,
 * do valor de receitas do ano passado, da quantidade de funcionários, da quantidade de mesas e
 * os custos de manutenção.
 *
 * @authors André Ferreira e João Sanches
 */
public class Restauracao extends LojaComum{
    /**
     * A quantidade de mesas da Loja Comum Restauração.
     */
    private int qtdMesas;
    /**
     * O valor da renda fixa que a Loja Comum Restauração paga ao Centro Comercial.
     */
    private static int rendaFixa = 1800;
    /**
     * O valor do custo de manutenção da Loja Comum Restauração.
     */
    private float custosManutencao;
    /**
     * O valor do custo de segurança por cada mesa.
     */
    private static int custoSegurancaPorMesa = 5;
    /**
     * O tipo de Loja Comum.
     */
    private final String TIPO_LOJA = "Restauracao";
    /**
     * A quantidade de mesas da Loja Comum Restauração por omissão.
     */
    private static final int QTD_MESAS_POR_OMISSAO = 5;
    /**
     * O valor do custo de manutenção da Loja Comum Restauração por omissão.
     */
    private static final int CUSTOS_MANUTENCAO_POR_OMISSAO = 200;

    /**
     * Construtor de uma Loja Comum Restauracao recebendo o número de Identificação, nome, morada, área ocupada,
     * receitas referentes ao ano passado, quantidade de Funcionários, quantidade de mesas e os custos de manutenção.
     *
     * @param numeroId o número de identificação do Restaurante
     * @param nome o nome do Restaurante
     * @param area a área que ocupada no centro comercial
     * @param receitas o valor das receitas no ano passado
     * @param qtdFunc a quantidade de Funcionários
     * @param qtdMesas a quantidade de mesas
     * @param custosManutencao os custos de manutenção
     */
    public Restauracao(String numeroId, String nome, float area, float receitas, int qtdFunc, int qtdMesas, float custosManutencao) {
        super(numeroId, nome, area, receitas, qtdFunc);
        this.qtdMesas = qtdMesas;
        this.custosManutencao = custosManutencao;
    }

    /**
     * Construtor de uma Loja Comum Restauracao com os custos de manutenção omitidos.
     *
     * @param numeroId o número de identificação da loja
     * @param nome o nome da loja
     * @param area a área que ocupada no centro comercial
     * @param receitas o valor das receitas no ano passado
     * @param qtdFunc a quantidade de Funcionários
     * @param qtdMesas a quantidade de mesas
     */
    public Restauracao(String numeroId, String nome, float area, float receitas, int qtdFunc, int qtdMesas) {
        super(numeroId, nome, area, receitas, qtdFunc);
        this.qtdMesas = qtdMesas;
        custosManutencao = CUSTOS_MANUTENCAO_POR_OMISSAO;
    }
    /**
     * Construtor de uma Loja Comum Restauracao com a quantidade de mesas e os custos de manutenção omitidos.
     *
     * @param numeroId o número de identificação da loja
     * @param nome o nome da loja
     * @param area a área que ocupada no centro comercial
     * @param receitas o valor das receitas no ano passado
     * @param qtdFunc a quantidade de Funcionários
     */
    public Restauracao(String numeroId, String nome, float area, float receitas, int qtdFunc) {
        super(numeroId, nome, area, receitas, qtdFunc);
        qtdMesas = QTD_MESAS_POR_OMISSAO;
        custosManutencao = CUSTOS_MANUTENCAO_POR_OMISSAO;
    }
    /**
     * Construtor de uma Loja Comum Restauracao com a quantidade de funcionários, a quantidade de mesas e
     * os custos de manutenção omitidos.
     *
     * @param numeroId o número de identificação da loja
     * @param nome o nome da loja
     * @param area a área que ocupada no centro comercial
     * @param receitas o valor das receitas no ano passado
     */
    public Restauracao(String numeroId, String nome, float area, float receitas) {
        super(numeroId, nome, area, receitas);
        qtdMesas = QTD_MESAS_POR_OMISSAO;
        custosManutencao = CUSTOS_MANUTENCAO_POR_OMISSAO;
    }
    /**
     * Construtor de uma Loja Comum Restauracao com todos os atributos omitidos.
     */
    public Restauracao() {
        super();
        qtdMesas = QTD_MESAS_POR_OMISSAO;
        custosManutencao = CUSTOS_MANUTENCAO_POR_OMISSAO;
    }

    /**
     * Devolve o tipo de Loja.
     *
     * @return o tipo loja
     */
    public String getTipoLoja() {
        return TIPO_LOJA;
    }

    /**
     * Devolve a quantidade de mesas da Loja Comum Restauracao.
     *
     * @return quantidade de mesas da Loja Comum Restauracao
     */
    public int getQtdMesas() {
        return qtdMesas;
    }

    /**
     * Modifica a quantidade de mesas da Loja Comum Restauracao.
     *
     * @param qtdMesas nova quantidade de mesas da Loja Comum Restauracao
     */
    public void setQtdMesas(int qtdMesas) {
        this.qtdMesas = qtdMesas;
    }

    /**
     * Devolve o valor da renda fixa da Loja Comum Restauracao.
     *
     * @return o valor da renda fixa da Loja Comum Restauracao
     */
    public static int getRendaFixa() {
        return rendaFixa;
    }

    /**
     * Modifica o valor da renda fixa da Loja Comum Restauracao.
     *
     * @param rendaFixa o novo valor da renda fixa da Loja Comum Restauracao
     */
    public static void setRendaFixa(int rendaFixa) {
        Restauracao.rendaFixa = rendaFixa;
    }

    /**
     * Devolve o valor dos custos de manutenção da Loja Comum Restauracao.
     *
     * @return o valor dos custos de manutenção da Loja Comum Restauracao
     */
    public float getCustosManutencao() {
        return custosManutencao;
    }

    /**
     * Modifica o valor dos custos de manutenção da Loja Comum Restauracao.
     *
     * @param custosManutencao o novo valor dos custos de manutenção da Loja Comum Restauracao
     */
    public void setCustosManutencao(float custosManutencao) {
        this.custosManutencao = custosManutencao;
    }

    /**
     * Devolve o valor dos custos de segurança por mesa da Loja Comum Restauracao.
     *
     * @return o valor dos custos de segurança por mesa da Loja Comum Restauracao
     */
    public static int getCustoSegurancaPorMesa() {
        return custoSegurancaPorMesa;
    }

    /**
     * Modifica o valor dos custos de segurança por mesa da Loja Comum Restauracao.
     *
     * @param custoSegurancaPorMesa o novo custo de segurança por mesa da Loja Comum Restauracao
     */
    public static void setCustoSegurancaPorMesa(int custoSegurancaPorMesa) {
        Restauracao.custoSegurancaPorMesa = custoSegurancaPorMesa;
    }

    /**
     * Devolve a descrição textual da Loja Comum Restauracao.
     *
     * @return características da Loja Comum Restauracao
     */
    @Override
    public String toString() {
        return String.format("%s do tipo %s.", super.toString(), TIPO_LOJA);
    }

    /**
     * Devolve o valor da renda mensal da Loja Comum Restauracao.
     *
     * @return valor da renda mensal da Loja Comum Restauracao
     */
    @Override
    public float calcularRendaMensal() {
        float renda = rendaFixa * (1 + (getArea() / 100)) + (getReceitas() / 100);
        return renda;
    }

    /**
     * Devolve o valor dos custos de segurança da Loja Comum Restauracao
     *
     * @return valor dos custos de segurança da Loja Comum Restauracao
     */
    @Override
    public float calcularCustosSeguranca() {
        return qtdMesas * custoSegurancaPorMesa;
    }

    /**
     * Devolve o valor dos custos mensais da Loja Comum Restauracao
     *
     * @return valor dos custos mensais da Loja Comum Restauracao
     */
    @Override
    public float calcularCustosMensais() {
        return custosManutencao + calcularRendaMensal() + calcularCustosSeguranca();
    }

    /**
     * Compara duas Lojas Comuns Restauracao e verifica se são iguais ou diferentes
     *
     * @param outroObjeto outra Loja Comum Restauracao
     * @return true se forem iguais e false se forem diferentes
     */
    @Override
    public boolean equals(Object outroObjeto) {
        if (!super.equals(outroObjeto)) {
            return false;
        }
        Restauracao outraLoja = (Restauracao) outroObjeto;
        return this.qtdMesas == outraLoja.getQtdMesas() && this.custosManutencao == outraLoja.getCustosManutencao();
    }
}
