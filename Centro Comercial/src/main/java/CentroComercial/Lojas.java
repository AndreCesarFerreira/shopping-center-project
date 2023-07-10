package CentroComercial;

/**
 * Esta classe permite a construção de uma hierarquia de classes para representarem diferentes tipos de lojas.
 * Especifica membros comuns a todas as subclasses da hierarquia.
 *
 * @authors André Ferreira e João Sanches
 */
public abstract class Lojas implements CustosMensais, Comparable<Lojas>{

    /**
     * O número de identificação da Loja.
     */
    private String numeroId;

    /**
     * O nome da Loja
     */
    private String nome;

    /**
     * A área que ocupa no Centro Comercial.
     */
    private float area;

    /**
     * O valor das receitas do ano passado.
     */
    private float receitas;

    /**
     * O valor do limite Inferior de área de uma loja média.
     */
    private static int limiteInfArea = 20;

    /**
     * O valor do limite Superior de área de uma loja média.
     */
    private static int limiteSupArea = 100;

    /**
     * O número de identificação da Loja por omissão.
     */
    private static final String NUMERO_ID_POR_OMISSAO = "123456";

    /**
     * O nome da Loja por omissão.
     */
    private static final String NOME_POR_OMISSAO = "sem nome";

    /**
     * A área que ocupa no centro comercial por omissão.
     */
    private static final float AREA_POR_OMISSAO = 24;

    /**
     * O valor das receitas no ano passado por omissão.
     */
    private static final float RECEITAS_POR_OMISSAO = 2400;

    /**
     * Construtor da superclasse Lojas recebendo o número de identificação da Loja, o nome,
     * a área que ocupa e o valor das receitas do ano passado.
     *
     * @param numeroId o número de identificação da Loja
     * @param nome o nome da Loja
     * @param area a área que ocupa no centro comercial
     * @param receitas o valor das receitas do ano passado
     */
    public Lojas(String numeroId, String nome, float area, float receitas) {
        this.numeroId = numeroId;
        this.nome = nome;
        this.area = area;
        this.receitas = receitas;
    }

    /**
     * Construtor da superclasse Lojas com o valor das receitas omitido.
     *
     * @param numeroId o número de identificação da Loja
     * @param nome o nome da Loja
     * @param area a área que ocupa no centro comercial
     */
    public Lojas(String numeroId, String nome, float area) {
        this.numeroId = numeroId;
        this.nome = nome;
        this.area = area;
        receitas = RECEITAS_POR_OMISSAO;
    }

    /**
     * Construtor da superclasse Lojas com o valor da área omitido.
     *
     * @param numeroId o número de identificação da Loja
     * @param nome o nome da Loja
     */
    public Lojas(String numeroId, String nome) {
        this.numeroId = numeroId;
        this.nome = nome;
        area = AREA_POR_OMISSAO;
        receitas = RECEITAS_POR_OMISSAO;
    }

    /**
     * Construtor da superclasse Lojas com o nome omitido.
     *
     * @param numeroId o número de identificação da Loja
     */
    public Lojas(String numeroId) {
        this.numeroId = numeroId;
        nome = NOME_POR_OMISSAO;
        area = AREA_POR_OMISSAO;
        receitas = RECEITAS_POR_OMISSAO;
    }

    /**
     * Construtor da superclasse Lojas com toda a informação omitida.
     */
    public Lojas() {
        numeroId = NUMERO_ID_POR_OMISSAO;
        nome = NOME_POR_OMISSAO;
        area = AREA_POR_OMISSAO;
        receitas = RECEITAS_POR_OMISSAO;
    }

    /**
     * Devolve o número de identificação da Loja.
     *
     * @return número de identificação
     */
    public String getNumeroId() {
        return numeroId;
    }

    /**
     * Devolve o nome da Loja.
     *
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Devolve o valor da área da Loja.
     *
     * @return area
     */
    public float getArea() {
        return area;
    }

    /**
     * Devolve o valor das receitas da Loja.
     *
     * @return valor das receitas
     */
    public float getReceitas() {
        return receitas;
    }

    /**
     * Devolve o valor do limite inferior para a classificação das Lojas.
     *
     * @return limite inferior
     */
    public static int getLimiteInfArea() {
        return limiteInfArea;
    }

    /**
     * Obtém o valor do limite superior para a classificação das Lojas.
     *
     * @return limite superior
     */
    public static int getLimiteSupArea() {
        return limiteSupArea;
    }

    /**
     * Modifica o número de Identificação da Loja.
     *
     * @param numeroId número de Identificação
     */
    public void setNumeroId(String numeroId) {
        this.numeroId = numeroId;
    }

    /**
     * Modifica o nome da Loja.
     *
     * @param nome nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Modifica o valor da área da Loja.
     *
     * @param area área
     */
    public void setArea(float area) {
        this.area = area;
    }

    /**
     * Modifica o valor das receitas da Loja.
     *
     * @param receitas receitas
     */
    public void setReceitas(float receitas) {
        this.receitas = receitas;
    }

    /**
     * Modifica o valor do limite inferior para a classificação das Lojas.
     *
     * @param limiteInfArea limite inferior
     */
    public static void setLimiteInfArea(int limiteInfArea) {
        Lojas.limiteInfArea = limiteInfArea;
    }

    /**
     * Modifica o valor do limite superior para a classificação das Lojas.
     *
     * @param limiteSupArea limite superior
     */
    public static void setLimiteSupArea(int limiteSupArea) {
        Lojas.limiteSupArea = limiteSupArea;
    }

    /**
     * Permite classificar as Lojas dependendo do valor da área.
     *
     * @return classificação
     */
    public String classificar() {
        if (getArea() < getLimiteInfArea()) {
            return "Loja Pequena";
        } else
        if (getArea() > getLimiteSupArea()) {
            return "Loja Grande";
        } else {
            return "Loja Média";
        }
    }

    /**
     * Devolve toda a informação das Lojas assim como da sua classificação conforme a área.
     *
     * @return a informação das lojas
     */
    @Override
    public String toString() {
        return String.format("Loja com Id:%s : %s %nPossui uma area de %.2f m (%s) e um valor de Receita anual de %.2f",
                numeroId, nome, area, classificar(), receitas);
    }

    /**
     * Compara o nome de duas lojas com a ‘interface’ Comparable.
     *
     * @param outraLoja outra loja para ser comparada
     * @return
     * * -1 se a primeira letra do nome da primeira loja for alfabeticamente inferior ao da segunda
     * * 0 se o nome começar pela mesma letra
     * * 1 se a primeira letra do nome da primeira loja for alfabeticamente superior ao da segunda
     */
    @Override
    public int compareTo(Lojas outraLoja) {
        return this.nome.compareTo(outraLoja.nome);
    }

   /**
     * Compara duas lojas e verifica se são iguais ou diferentes.
     *
     * @param outraLoja outra loja que passe por parametro
     * @return true se forem iguais e false se forem diferentes
     */
    public boolean equals(Lojas outraLoja) {
        if (this == outraLoja) {
            return true;
        }
        if (outraLoja == null || this.getClass() != outraLoja.getClass()) {
            return false;
        }
        Lojas loja = outraLoja;
        return this.numeroId.equals(loja.numeroId) &&
                this.nome.equalsIgnoreCase(loja.nome) &&
                this.area == loja.getArea() &&
                this.receitas == loja.getReceitas();
    }

}
