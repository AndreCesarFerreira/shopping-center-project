package CentroComercial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExternaTest {

    @Test
    void testEqualsObjectosDiferentesComMesmasCaracteristicas() {
        // Arrange
        Lojas lE1 = new Externa("Z111", "Worten", 150, 30000, 500, 20);
        Lojas lE2 = new Externa("Z111", "Worten", 150, 30000, 500, 20);

        // Act
        boolean result = lE1.equals(lE2);

        // Assert
        assertTrue(result);
    }

    @Test
    void testEqualsObjectosDiferentesComCaracteristicasDiferentes() {
        // Arrange
        Lojas lE1 = new Externa("Z111", "Worten", 150, 30000, 500, 20);
        Lojas lE2 = new Externa("G68975", "Wells", 16, 8500, 400, 4);

        // Act
        boolean result = lE1.equals(lE2);

        // Assert
        assertFalse(result);
    }

    @Test
    void testCalcularRendaMensal() {
        // Arrange
        Lojas lE1 = new Externa("Z111", "Worten", 150, 30000, 500, 20);
        float expectedResult = 5300;

        // Act
        float result = lE1.calcularRendaMensal();

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    void testCalcularCustosSeguranca() {
        // Arrange
        Lojas lE1 = new Externa("Z111", "Worten", 150, 30000, 500, 20);
        float expectedResult = 500;

        // Act
        float result = lE1.calcularCustosSeguranca();

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    void testCalcularCustosMensais() {
        // Arrange
        Lojas lE1 = new Externa("Z111", "Worten", 150, 30000, 500, 20);
        float expectedResult = 16800;

        // Act
        float result = lE1.calcularCustosMensais();

        // Assert
        assertEquals(expectedResult, result);
    }
}