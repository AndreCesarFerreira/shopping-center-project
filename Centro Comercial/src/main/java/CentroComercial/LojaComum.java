package CentroComercial;

/**
 * Esta classe permite a construção de uma hierarquia de classes para
 * representarem diferentes tipos de lojas comuns. Especifica membros
 * comuns a todas as subclasses da hierarquia.
 *
 * @authors César Ferreira e João Sanches
 */
public abstract class LojaComum extends Lojas{
    private int qtdFunc;
    private static int contadorLojasComuns = 0;

    private static final int QTDFUNC_POR_OMISSAO = 0;

    /**
     * Construtor de uma Loja Comum recebendo o número de identificação, o nome da loja, a área,
     * o valor das receitas do ano passado e a quantidade de funcionários.
     *
     * @param numeroId o número de identificação da loja
     * @param nome o nome da loja
     * @param area a área que ocupada no centro comercial
     * @param receitas o valor das receitas no ano passado
     * @param qtdFunc a quantidade de funcionários da loja
     */
    public LojaComum(String numeroId, String nome, float area, float receitas, int qtdFunc) {
        super(numeroId, nome, area, receitas);
        this.qtdFunc = qtdFunc;
        contadorLojasComuns++;
    }

    /**
     * Construtor de uma Loja Comum com a quantidade de funcionários omitida.
     *
     * @param numeroId o número de identificação da loja
     * @param nome o nome da loja
     * @param area a área que ocupada no centro comercial
     * @param receitas o valor das receitas no ano passado
     */
    public LojaComum(String numeroId, String nome, float area, float receitas) {
        super(numeroId, nome, area, receitas);
        qtdFunc = QTDFUNC_POR_OMISSAO;
        contadorLojasComuns++;
    }

    /**
     * Construtor de uma Loja Comum com toda a informação omitida.
     */
    public LojaComum() {
        super();
        qtdFunc = QTDFUNC_POR_OMISSAO;
        contadorLojasComuns++;
    }

    /**
     * Devolve a quantidade de funcionários da Loja Comum.
     *
     * @return a quantidade de funcionários
     */
    public int getQtdFunc() {
        return qtdFunc;
    }

    /**
     * Modifica a quantidade de funcionários da Loja Comum.
     *
     * @param qtdFunc a quantidade de funcionários
     */
    public void setQtdFunc(int qtdFunc) {
        this.qtdFunc = qtdFunc;
    }

    /**
     * Devolve a quantidade de Lojas Comuns no centro Comercial.
     *
     * @return a quantidade de Lojas Comuns
     */
    public static int getContadorLojasComuns() {
        return contadorLojasComuns;
    }

    /**
     * Modifica a quantidade de Lojas Comuns no centro Comercial.
     *
     * @param contadorLojasComuns a nova quantidade de Lojas Comum criadas
     */
    public static void setContadorLojasComuns(int contadorLojasComuns) {
        LojaComum.contadorLojasComuns = contadorLojasComuns;
    }

    /**
     * Devolve a descrição textual da Loja Comum.
     *
     * @return características da Loja Comum
     */
    @Override
    public String toString() {
        return String.format("%s é uma loja Comum", super.toString());
    }

    /**
     * Compara duas lojas e verifica se são iguais ou diferentes
     *
     * @param outroObjeto outra loja que passe por parametro
     * @return true se forem iguais e false se forem diferentes
     */
    @Override
    public boolean equals(Object outroObjeto) {
        if (!super.equals(outroObjeto)) {
            return false;
        }
        LojaComum outraLoja = (LojaComum) outroObjeto;
        return this.qtdFunc == outraLoja.getQtdFunc();
    }
}
