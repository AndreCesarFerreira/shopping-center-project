package CentroComercial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropriaTest {
    @Test
    void testCalcularRendaMensal() {
        // Arrange
        Lojas ap1 = new Propria("D241", "Agave", 64, 6400, 200);
        float expectedResult = 0f;

        // Act
        float result = ap1.calcularRendaMensal();

        // Assert
        assertEquals(expectedResult, result);

    }

    @Test
    void testCalcularCustosSeguranca() {
        // Arrange
        Lojas ap1 = new Propria("D241", "Agave", 64, 6400, 200);
        float expectedResult = 200.0f;

        // Act
        float result = ap1.calcularCustosSeguranca();

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    void testCalcularCustosMensais() {
        // Arrange
        Lojas ap1 = new Propria("D241", "Agave", 64, 6400, 200);
        float expectedResult = 200.0f;

        // Act
        float result = ap1.calcularCustosMensais();

        // Assert
        assertEquals(expectedResult, result);

    }

    @Test
    void testEquals() {
        // Testar se dois objetos iguais são iguais
        // Arrange
        Lojas ap1 = new Propria("D241", "Agave", 64, 6400, 200);
        Lojas ap2 = new Propria("D241", "Agave", 64, 6400, 200);

        // Act
        boolean result = ap1.equals(ap2);

        // Assert
        assertTrue(result);

    }

    @Test
    void testEqualsDifferentObjectsSameClass() {
        // Testar se dois objetos diferentes são iguais (mesma classe)
        // Arrange
        Lojas ap1 = new Propria("D241", "Agave", 64, 6400, 200);
        Lojas ap2 = new Propria("B123", "Mango", 58, 30200, 450);

        // Act
        boolean result = ap1.equals(ap2);

        // Assert
        assertFalse(result);

    }

    @Test
    void testEqualsDifferentObjectsSameClassDifferentNumberAttributes() {
        // Testar se dois objetos diferentes são iguais (mesma classe e número de atributos diferente)
        // Arrange
        Lojas ap2 = new Propria("B123", "Mango", 58, 30200, 450);
        Lojas ap3 = new Propria("D478", "SpringField", 200, 50000);

        // Act
        boolean result = ap2.equals(ap3);

        // Assert
        assertFalse(result);

    }

    @Test
    void testEqualsDifferentObjectsDifferentClass() {
        // Testar se dois objetos diferentes são iguais (classe diferente)
        // Arrange
        Lojas ap1 = new Propria("D241", "Agave", 64, 6400, 200);
        Lojas ae1 = new Externa("Z111", "Worten", 150, 30000, 500, 20);

        // Act
        boolean result = ap1.equals(ae1);

        // Assert
        assertFalse(result);

    }
}