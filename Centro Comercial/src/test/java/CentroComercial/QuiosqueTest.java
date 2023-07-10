package CentroComercial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuiosqueTest {

    @Test
    void testEqualsObjectosDiferentesComMesmasCaracteristicas() {
        // Arrange
        Lojas q1 = new Quiosque("N999", "Tabacaria Julio", 5, 2000, 3);
        Lojas q2 = new Quiosque("N999", "Tabacaria Julio", 5, 2000, 3);

        // Act
        boolean result = q1.equals(q2);

        // Assert
        assertTrue(result);
    }

    @Test
    void testEqualsObjectosDiferentesComCaracteristicasDiferentes() {
        // Arrange
        Lojas q1 = new Quiosque("N999", "Tabacaria Julio", 5, 2000, 3);
        Lojas q2 = new Quiosque("B345", "Bijuteria Juliana", 10, 4500, 4);

        // Act
        boolean result = q1.equals(q2);

        // Assert
        assertFalse(result);
    }

    @Test
    void testCalcularRendaMensal() {
        // Arrange
        Lojas q1 = new Quiosque("N999", "Tabacaria Julio", 5, 2000, 3);
        float expectedResult = 250;

        // Act
        float result = q1.calcularRendaMensal();

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    void testCalcularCustosSeguranca() {
        // Arrange
        Lojas q1 = new Quiosque("N999", "Tabacaria Julio", 5, 2000, 3);
        float expectedResult = 0;

        // Act
        float result = q1.calcularCustosSeguranca();

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    void testCalcularCustosMensais() {
        // Arrange
        Lojas q1 = new Quiosque("N999", "Tabacaria Julio", 5, 2000, 3);
        float expectedResult = 250;

        // Act
        float result = q1.calcularCustosMensais();

        // Assert
        assertEquals(expectedResult, result);
    }

}
