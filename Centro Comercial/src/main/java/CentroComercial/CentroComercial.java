package CentroComercial;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.Scanner;

/**
 * Representa um Centro Comercial através do seu nome e morada.
 *
 * * * Permite o processamento de dados das diferentes Lojas.
 *
 * @authors André Ferreira e João Sanches
 */
public class CentroComercial {
    /**
     * O nome do Centro Comercial.
     */
    private String nomeCentroComercial;
    /**
     * A morada do Centro Comercial.
     */
    private String moradaCentroComercial;
    /**
     * O contentor de Lojas.
     */
    private ArrayList<Lojas> contentorLojas = new ArrayList<Lojas>();

    /**
     * O nome do Centro Comercial por omissão.
     */
    private static final String NOME_CENTRO_COMERCIAL_POR_OMISSAO = "Sem Nome";

    /**
     * A morada do Centro Comercial por omissão.
     */
    private static final String MORADA_CENTRO_COMERCIAL_POR_OMISSAO = "Sem Morada";

    /**
     * Construtor de um Centro Comercial recebendo o nome e a morada.
     *
     * @param nomeCentroComercial o nome do Centro Comercial
     * @param moradaCentroComercial a morada do Centro Comercial
     */
    public CentroComercial(String nomeCentroComercial, String moradaCentroComercial) {
        this.nomeCentroComercial = nomeCentroComercial;
        this.moradaCentroComercial = moradaCentroComercial;
    }

    /**
     * Construtor de um Centro Comercial com a morada omitida.
     *
     * @param nomeCentroComercial o nome do Centro Comercial
     */
    public CentroComercial(String nomeCentroComercial) {
        this.nomeCentroComercial = nomeCentroComercial;
        moradaCentroComercial = MORADA_CENTRO_COMERCIAL_POR_OMISSAO;
    }

    /**
     * Construtor de um Centro Comercial com todos os atributos omitidos.
     */
    public CentroComercial() {
        nomeCentroComercial = NOME_CENTRO_COMERCIAL_POR_OMISSAO;
        moradaCentroComercial = MORADA_CENTRO_COMERCIAL_POR_OMISSAO;
    }

    /**
     * Devolve o nome do Centro Comercial.
     *
     * @return o nome do Centro Comercial
     */
    public String getNomeCentroComercial() {
        return nomeCentroComercial;
    }

    /**
     * Devolve a morada do Centro Comercial.
     *
     * @return a morada do Centro Comercial
     */
    public String getMoradaCentroComercial() {
        return moradaCentroComercial;
    }


    /**
     * Modifica o nome do Centro Comercial.
     *
     * @param nomeCentroComercial o novo nome do Centro Comercial
     */
    public void setNomeCentroComercial(String nomeCentroComercial) {
        this.nomeCentroComercial = nomeCentroComercial;
    }

    /**
     * Modifica a morada do Centro Comercial.
     *
     * @param moradaCentroComercial a nova morada do Centro Comercial
     */
    public void setMoradaCentroComercial(String moradaCentroComercial) {
        this.moradaCentroComercial = moradaCentroComercial;
    }

    /**
     * Devolve a quantidade de lojas armazenadas no contentor do Centro Comercial.
     *
     * @return quantidade de lojas
     */
    public int qtdLojas() {
        return contentorLojas.size();
    }

    /**
     * Insere uma loja no contentor do Centro Comercial.
     *
     * @param loja nova loja
     */
    public void inserirLoja(Lojas loja) {
        contentorLojas.add(loja);
    }

    /**
     * Elimina uma loja do contentor do Centro Comercial.
     *
     * @param loja loja a eliminar
     */
    public void eliminarLoja(Lojas loja) {
        for (int i = 0; i < contentorLojas.size(); i++) {
            if (contentorLojas.get(i) == loja) {
                contentorLojas.remove(contentorLojas.get(i));
            }
        }
    }

    /**
     * Lista as lojas contidas no contentor do Centro Comercial.
     */
    public void listarLojas() {
        for (Lojas loja : contentorLojas) {
            System.out.println(loja);
        }
    }

    /**
     * Devolve o valor total das rendas a pagar pelas Lojas Âncora.
     *
     * @return o valor total das rendas
     */
    public float calcularTotalRendasLojasAncora() {
        float total = 0;
        for (int i = 0; i < contentorLojas.size(); i++) {
            Lojas loja = contentorLojas.get(i);
            if (loja instanceof LojasAncora) {
                total += loja.calcularRendaMensal();
            }
        }
        return total;
    }

    /**
     * Devolve o valor total das rendas a pagar pelas Lojas Comuns.
     *
     * @return o valor total das rendas
     */
    public float calcularTotalRendasLojasComuns() {
        float total = 0;
        for (int i = 0; i < contentorLojas.size(); i++) {
            if (contentorLojas.get(i) instanceof LojaComum) {
                total += contentorLojas.get(i).calcularRendaMensal();
            }
        }
        return total;
    }

    /**
     * Devolve o custo de segurança das Lojas Âncora.
     *
     * @return os custos de segurança
     */
    public float calcularCustosSegurancaLojasAncora() {
        float total = 0;
        for (int i = 0; i < contentorLojas.size(); i++) {
            if (contentorLojas.get(i) instanceof LojasAncora) {
                total += contentorLojas.get(i).calcularCustosSeguranca();
            }
        }
        return total;
    }

    /**
     * Devolve o custo de segurança das Lojas Comuns.
     *
     * @return os custos de segurança
     */
    public float calcularCustosSegurancaLojasComuns() {
        float total = 0;
        for (int i = 0; i < contentorLojas.size(); i++) {
            if (contentorLojas.get(i) instanceof LojaComum) {
                total += contentorLojas.get(i).calcularCustosSeguranca();
            }
        }
        return total;
    }

    /**
     * Devolve o valor total de custos com a segurança a pagar pelas Lojas do Centro Comercial.
     *
     * @return o valor total dos custos de segurança
     */
    public float calcularTotalCustosSegurancaTodasLojas() {
        return calcularCustosSegurancaLojasAncora() + calcularCustosSegurancaLojasComuns();
    }

    /**
     * Devolve o valor total de receitas (rendas + custos com segurança) do Centro Comercial.
     *
     * @return o valor total de receitas
     */
    public float calcularTotalReceitas() {
        return calcularTotalRendasLojasAncora() + calcularTotalRendasLojasComuns() + calcularTotalCustosSegurancaTodasLojas();
    }

    /**
     * Compara dois Centros Comerciais e verifica se são iguais ou diferentes.
     *
     * @param outroCentroComercial outro Centro Comercial
     * @return true se forem iguais e false se forem diferentes
     */
    public boolean equals(CentroComercial outroCentroComercial) {
        if (this == outroCentroComercial) {
            return true;
        }
        if (outroCentroComercial == null || this.getClass() != outroCentroComercial.getClass()) {
            return false;
        }
        CentroComercial centroComercial = outroCentroComercial;
        return this.nomeCentroComercial.equalsIgnoreCase(centroComercial.nomeCentroComercial) &&
                this.moradaCentroComercial.equalsIgnoreCase(centroComercial.moradaCentroComercial);
    }

    /**
     * Ordena alfabeticamente as lojas pelo nome, recorrendo à interface Java Comparable.
     */
    public void ordenarLojasPorNome() {
        Collections.sort(contentorLojas);
    }

    /**
     * Ordena as lojas alfabeticamente pelo seu tipo e em cada tipo, ordena decrescentemente pela área,
     * recorrendo à interface Java Comparator.
     */
    public void ordenarLojasPorTipo() {
        Collections.sort(contentorLojas, new OrdenarPorTipo());
    }


    /**
     * Lê de um ficheiro de texto toda a informação relativa ao Centro Comercial e respetivas Lojas.
     *
     * @throws FileNotFoundException
     */
    public void lerInfo() throws FileNotFoundException {
        Scanner fichCentroComercial = new Scanner(new File("Centro Comercial e Lojas.txt"));
        String linha = fichCentroComercial.nextLine();
        while (fichCentroComercial.hasNextLine()) {
            String[] vetLinha = linha.split(",");
            if (vetLinha[0].equals("CentroComercial")) {
                setNomeCentroComercial(vetLinha[1].trim());
                setMoradaCentroComercial(vetLinha[2].trim());
            } else if (vetLinha[0].equals("Propria")) {
                this.inserirLoja(new Propria(
                        vetLinha[1].trim(),
                        vetLinha[2].trim(),
                        Integer.parseInt(vetLinha[3].trim()),
                        Integer.parseInt(vetLinha[4].trim()),
                        Integer.parseInt(vetLinha[5].trim())));
            } else if (vetLinha[0].equals("Externa")) {
                this.inserirLoja(new Externa(
                        vetLinha[1].trim(),
                        vetLinha[2].trim(),
                        Integer.parseInt(vetLinha[3].trim()),
                        Integer.parseInt(vetLinha[4].trim()),
                        Integer.parseInt(vetLinha[5].trim()),
                        Integer.parseInt(vetLinha[6].trim())));
            } else if (vetLinha[0].equals("Restauracao")) {
                this.inserirLoja(new Restauracao(
                        vetLinha[1].trim(),
                        vetLinha[2].trim(),
                        Integer.parseInt(vetLinha[3].trim()),
                        Integer.parseInt(vetLinha[4].trim()),
                        Integer.parseInt(vetLinha[5].trim()),
                        Integer.parseInt(vetLinha[6].trim()),
                        Integer.parseInt(vetLinha[7].trim())));
            } else if (vetLinha[0].equals("Quiosque")) {
                this.inserirLoja(new Quiosque(
                        vetLinha[1].trim(),
                        vetLinha[2].trim(),
                        Integer.parseInt(vetLinha[3].trim()),
                        Integer.parseInt(vetLinha[4].trim()),
                        Integer.parseInt(vetLinha[5].trim())));
            }
            linha = fichCentroComercial.nextLine();
            System.out.println("linha: " + linha);
        }
        fichCentroComercial.close();
    }

    /**
     * Guarda num ficheiro de texto toda a informação relativa ao Centro Comercial e respetivas Lojas.
     *
     * @throws FileNotFoundException
     */
    public void guardarInfo() throws FileNotFoundException {
        File fich = new File("Centro Comercial e Lojas.txt");
        Formatter fichCentroComercial = new Formatter(fich);
        fichCentroComercial.format("CentroComercial, %s, %s\n", nomeCentroComercial, moradaCentroComercial);
        for (int i = 0; i < contentorLojas.size(); i++) {
            if (contentorLojas.get(i) instanceof Propria) {
                fichCentroComercial.format("%s, %s, %s, %.0f, %.0f, %.0f\n",
                        ((Propria) contentorLojas.get(i)).getTipoLoja(),
                        (contentorLojas.get(i)).getNumeroId(),
                        (contentorLojas.get(i)).getNome(),
                        (contentorLojas.get(i)).getArea(),
                        (contentorLojas.get(i)).getReceitas(),
                        ((Propria) contentorLojas.get(i)).getCustosSeguranca());

            } else if (contentorLojas.get(i) instanceof Externa) {
                fichCentroComercial.format("%s, %s, %s, %.0f, %.0f, %.0f, %d\n",
                        ((Externa) contentorLojas.get(i)).getTipoLoja(),
                        (contentorLojas.get(i)).getNumeroId(),
                        (contentorLojas.get(i)).getNome(),
                        (contentorLojas.get(i)).getArea(),
                        (contentorLojas.get(i)).getReceitas(),
                        ((Externa) contentorLojas.get(i)).getCustosSeguranca(),
                        ((Externa) contentorLojas.get(i)).getQtdFunc());
            } else if (contentorLojas.get(i) instanceof Restauracao) {
                fichCentroComercial.format("%s, %s, %s, %.0f, %.0f, %d, %d, %.0f\n",
                        ((Restauracao) contentorLojas.get(i)).getTipoLoja(),
                        (contentorLojas.get(i)).getNumeroId(),
                        (contentorLojas.get(i)).getNome(),
                        (contentorLojas.get(i)).getArea(),
                        (contentorLojas.get(i)).getReceitas(),
                        ((Restauracao) contentorLojas.get(i)).getQtdFunc(),
                        ((Restauracao) contentorLojas.get(i)).getQtdMesas(),
                        ((Restauracao) contentorLojas.get(i)).getCustosManutencao());
            } else if (contentorLojas.get(i) instanceof Quiosque) {
                fichCentroComercial.format("%s, %s, %s, %.0f, %.0f, %d\n",
                        ((Quiosque) contentorLojas.get(i)).getTipoLoja(),
                        (contentorLojas.get(i)).getNumeroId(),
                        (contentorLojas.get(i)).getNome(),
                        (contentorLojas.get(i)).getArea(),
                        (contentorLojas.get(i)).getReceitas(),
                        ((Quiosque) contentorLojas.get(i)).getQtdFunc());
            }
        }

        fichCentroComercial.format("FIM");
        fichCentroComercial.close();
    }
}
