package CentroComercial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CentroComercialTest {

    @Test
    void testCalcularTotalRendasLojasAncora() {
        // Arrange
        CentroComercial cC = new CentroComercial("MaiaShopping", "Av. dos Descobrimentos");

        Lojas p1 = new Propria("D241", "Agave", 64, 6400, 200);
        Lojas p2 = new Propria("B123", "Mango", 58, 30200, 450);
        Lojas e1 = new Externa("Z111", "Worten", 150, 30000, 500, 20);

        cC.inserirLoja(p1);
        cC.inserirLoja(p2);
        cC.inserirLoja(e1);

        float expectedResult = 5300;

        // Act
        float result = cC.calcularTotalRendasLojasAncora();

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    void testCalcularTotalRendasLojasComuns() {
        // Arrange
        CentroComercial cC = new CentroComercial("MaiaShopping", "Av. dos Descobrimentos");

        Lojas r1 = new Restauracao("H524", "Shimarrao", 50, 100000, 25, 50, 500);
        Lojas r2 = new Restauracao("L113", "Ochinchi", 10, 18000, 5, 20, 100);
        Lojas q1 = new Quiosque("N999", "Tabacaria Julio", 5, 2000, 3);
        Lojas q2 = new Quiosque("B345", "Bijuteria Juliana", 10, 4500, 4);

        cC.inserirLoja(r1);
        cC.inserirLoja(r2);
        cC.inserirLoja(q1);
        cC.inserirLoja(q2);

        float expectedResult = 6360;

        // Act
        float result = cC.calcularTotalRendasLojasComuns();

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    void testCalcularCustosSegurancaLojasAncora() {
        // Arrange
        CentroComercial cC = new CentroComercial("MaiaShopping", "Av. dos Descobrimentos");

        Lojas p1 = new Propria("D241", "Agave", 64, 6400, 200);
        Lojas p2 = new Propria("B123", "Mango", 58, 30200, 450);
        Lojas e1 = new Externa("Z111", "Worten", 150, 30000, 500, 20);

        cC.inserirLoja(p1);
        cC.inserirLoja(p2);
        cC.inserirLoja(e1);

        float expectedResult = 1150;

        // Act
        float result = cC.calcularCustosSegurancaLojasAncora();

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    void testCalcularCustosSegurancaLojasComuns() {
        // Arrange
        CentroComercial cC = new CentroComercial("MaiaShopping", "Av. dos Descobrimentos");

        Lojas r1 = new Restauracao("H524", "Shimarrao", 50, 100000, 25, 50, 500);
        Lojas r2 = new Restauracao("L113", "Ochinchi", 10, 18000, 5, 20, 100);
        Lojas q1 = new Quiosque("N999", "Tabacaria Julio", 5, 2000, 3);
        Lojas q2 = new Quiosque("B345", "Bijuteria Juliana", 10, 4500, 4);

        cC.inserirLoja(r1);
        cC.inserirLoja(r2);
        cC.inserirLoja(q1);
        cC.inserirLoja(q2);

        float expectedResult = 350;

        // Act
        float result = cC.calcularCustosSegurancaLojasComuns();

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    void testCalcularTotalCustosSegurancaTodasLojas() {
        // Arrange
        CentroComercial cC = new CentroComercial("MaiaShopping", "Av. dos Descobrimentos");

        Lojas p1 = new Propria("D241", "Agave", 64, 6400, 200);
        Lojas p2 = new Propria("B123", "Mango", 58, 30200, 450);
        Lojas e1 = new Externa("Z111", "Worten", 150, 30000, 500, 20);
        Lojas r1 = new Restauracao("H524", "Shimarrao", 50, 100000, 25, 50, 500);
        Lojas r2 = new Restauracao("L113", "Ochinchi", 10, 18000, 5, 20, 100);
        Lojas q1 = new Quiosque("N999", "Tabacaria Julio", 5, 2000, 3);
        Lojas q2 = new Quiosque("B345", "Bijuteria Juliana", 10, 4500, 4);

        cC.inserirLoja(p1);
        cC.inserirLoja(p2);
        cC.inserirLoja(e1);
        cC.inserirLoja(r1);
        cC.inserirLoja(r2);
        cC.inserirLoja(q1);
        cC.inserirLoja(q2);

        float expectedResult = 1500;

        // Act
        float result = cC.calcularTotalCustosSegurancaTodasLojas();

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    void testCalcularTotalReceitas() {
        // Arrange
        CentroComercial cC = new CentroComercial("MaiaShopping", "Av. dos Descobrimentos");

        Lojas p1 = new Propria("D241", "Agave", 64, 6400, 200);
        Lojas p2 = new Propria("B123", "Mango", 58, 30200, 450);
        Lojas e1 = new Externa("Z111", "Worten", 150, 30000, 500, 20);
        Lojas r1 = new Restauracao("H524", "Shimarrao", 50, 100000, 25, 50, 500);
        Lojas r2 = new Restauracao("L113", "Ochinchi", 10, 18000, 5, 20, 100);
        Lojas q1 = new Quiosque("N999", "Tabacaria Julio", 5, 2000, 3);
        Lojas q2 = new Quiosque("B345", "Bijuteria Juliana", 10, 4500, 4);

        cC.inserirLoja(p1);
        cC.inserirLoja(p2);
        cC.inserirLoja(e1);
        cC.inserirLoja(r1);
        cC.inserirLoja(r2);
        cC.inserirLoja(q1);
        cC.inserirLoja(q2);

        float expectedResult = 13160;

        // Act
        float result = cC.calcularTotalReceitas();

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    void testEqualsObjectosDiferentesComMesmasCaracteristicas() {
        // Arrange
        CentroComercial cC1 = new CentroComercial("MaiaShopping", "Av. dos Descobrimentos");
        CentroComercial cC2 = new CentroComercial("MaiaShopping", "Av. dos Descobrimentos");

        // Act
        boolean result = cC1.equals(cC2);

        // Assert
        assertTrue(result);
    }

    @Test
    void testEqualsObjectosDiferentesComCaracteristicasDiferentes() {
        // Arrange
        CentroComercial cC1 = new CentroComercial("MaiaShopping", "Av. dos Descobrimentos");
        CentroComercial cC2 = new CentroComercial("AlmadaShopping", "Av. dos Aliados");
        // Act
        boolean result = cC1.equals(cC2);

        // Assert
        assertFalse(result);
    }
}