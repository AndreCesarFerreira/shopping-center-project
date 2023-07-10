package CentroComercial;

/**
 * Esta interface permite o cálculo através do polimorfismo da renda mensal das lojas,
 * os seus custos de segurança e os seus custos mensais.
 *
 * @authors André Ferreira e João Sanches
 */
public interface CustosMensais {
    float calcularRendaMensal();
    float calcularCustosSeguranca();
    float calcularCustosMensais();
}
