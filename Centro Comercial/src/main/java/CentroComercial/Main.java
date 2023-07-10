package CentroComercial;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File fichDados = new File("Centro Comercial e Lojas.txt");
        boolean fichExiste = fichDados.exists();

        CentroComercial cC = new CentroComercial();

        if (!fichExiste) {

            System.out.println("\n* O ficheiro de texto não existe! Objetos (Lojas) declarados e inicializados conforme o enunciado.\n");
            cC = new CentroComercial("MaiaShopping", "Av. dos Descobrimentos");

            Lojas ap1 = new Propria("D241", "Agave", 64, 6400, 200);
            Lojas ap2 = new Propria("B123", "Mango", 58, 30200, 450);
            Lojas ap3 = new Propria("D478", "SpringField", 200, 50000);
            Lojas ae1 = new Externa("Z111", "Worten", 150, 30000, 500, 20);
            Lojas cr1 = new Restauracao("R333", "Burger King", 18, 60000, 18, 30, 180);
            Lojas cr2 = new Restauracao("I789", "MacDonald", 25, 100000, 30, 40, 300);
            Lojas cr3 = new Restauracao("H524", "Shimarrao", 50, 100000, 25, 50, 500);
            Lojas cr4 = new Restauracao("L113", "Ochinchi", 10, 18000, 5, 20, 100);
            Lojas cq1 = new Quiosque("N999", "Tabacaria Julio", 5, 2000, 3);
            Lojas cq2 = new Quiosque("B345", "Bijuteria Juliana", 10, 4500, 4);
            Lojas cq3 = new Quiosque("P931", "Papelaria Tiberio", 15, 8000, 2);

            cC.inserirLoja(ap1);
            cC.inserirLoja(ap2);
            cC.inserirLoja(ap3);
            cC.inserirLoja(ae1);
            cC.inserirLoja(cr1);
            cC.inserirLoja(cr2);
            cC.inserirLoja(cr3);
            cC.inserirLoja(cr4);
            cC.inserirLoja(cq1);
            cC.inserirLoja(cq2);
            cC.inserirLoja(cq3);

        } else {

            System.out.println("\n* O ficheiro de texto já existe! Objetos (Lojas) declarados e inicializados de acordo com a informação no ficheiro de texto.\n");
            cC.lerInfo();
        }

        // Redefinição do valor a pagar para 7 euros por cada mesa nas lojas de restauração;
        System.out.println("### Redefinição do valor a pagar para 7 euros por cada mesa nas Lojas de Restauração ###");
        System.out.printf("%nValor original a pagar pela segurança por mesa %.1f", cC.calcularTotalCustosSegurancaTodasLojas());
        Restauracao.setCustoSegurancaPorMesa(7);
        System.out.printf("%nValor após alteração a pagar pela segurança por mesa %.1f", cC.calcularTotalCustosSegurancaTodasLojas());

        //Apresentação no ecrã da seguinte informação:
        System.out.printf("%n%n### APRESENTAÇÃO DE INFORMAÇÃO RELATIVA AO CENTRO COMERCIAL ###%n");
        System.out.printf("%nO centro comercial chama-se %s", cC.getNomeCentroComercial());
        System.out.printf(" está localizado em %s", cC.getMoradaCentroComercial());
        System.out.printf("%nO centro comercial tem %d lojas.", cC.qtdLojas());
        System.out.printf("%nO valor total das rendas das lojas Âncora é: %.2f", cC.calcularTotalRendasLojasAncora());
        System.out.printf("%no valor total das rendas das lojas Comuns é: %.2f", cC.calcularTotalRendasLojasComuns());
        System.out.printf("%nO valor total de custos com a segurança do centro comercial é: %.2f", cC.calcularTotalCustosSegurancaTodasLojas());
        System.out.printf("%nO valor total de todas as receitas do centro comercial é: %.2f", cC.calcularTotalReceitas());
        System.out.printf("%nO peso pago pelas lojas âncora ao centro comercial é: %.2f %%",
                (cC.calcularTotalRendasLojasAncora() + cC.calcularCustosSegurancaLojasAncora()) / cC.calcularTotalReceitas() * 100);
        System.out.printf("%nO peso pago pelas lojas Comuns ao centro comercial é: %.2f %%",
                (cC.calcularTotalRendasLojasComuns() + cC.calcularCustosSegurancaLojasComuns()) / cC.calcularTotalReceitas() * 100);

        System.out.println();

        // Ordenar pelo nome por ordem alfabética, usando a interface Comparable
        cC.ordenarLojasPorNome();
        System.out.printf("%n### Listagem das Lojas ordenadas alfabeticamente por nome ###%n");
        cC.listarLojas();
        System.out.println();

        // Ordenar por tipo e depois por área, usando a interface Comparator
        cC.ordenarLojasPorTipo();
        System.out.printf("%n### Listagem das Lojas ordenadas de forma crescente por tipo e a seguir de forma decrescente por área ###%n");
        cC.listarLojas();

        // Eliminação da loja âncora externa passando por parâmetro uma cópia dessa loja;
        Lojas ae2 = new Externa("Z111", "Worten", 150, 30000, 500, 20);
        cC.inserirLoja(ae2);
        cC.ordenarLojasPorTipo();
        System.out.println("\n### Listagem das lojas incluindo cópia da Loja Externa ###\n");
        cC.listarLojas();

        cC.eliminarLoja(ae2);
        cC.ordenarLojasPorTipo();
        System.out.println("\n### Listagem das lojas após eliminação da cópia da Loja Externa ###\n");
        cC.listarLojas();

        // Gravação, em ficheiro de texto, de toda a informação relativa ao centro comercial e respetivas lojas.
        cC.guardarInfo();
        System.out.println("\nToda a informação relativa ao Centro Comercial e respetivas Lojas foi guardada com sucesso no ficheiro Centro Comercial e Lojas.txt");
    }
}
