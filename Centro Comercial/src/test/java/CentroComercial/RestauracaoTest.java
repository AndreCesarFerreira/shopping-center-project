package CentroComercial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestauracaoTest {
    @Test
    void testCalcularRendaMensal() {
        // Arrange
        Lojas cr1 = new Restauracao("R333", "Burger King", 18, 60000, 18, 30, 180);
        float expectedResult = 2724.0f;

        // Act
        float result = cr1.calcularRendaMensal();

        // Assert
        assertEquals(expectedResult, result);

    }

    @Test
    void testCalcularCustosSeguranca() {
        // Arrange
        Lojas cr1 = new Restauracao("I789", "MacDonald", 25, 100000, 30, 40, 300);
        Restauracao.setCustoSegurancaPorMesa(5);
        float expectedResult = 200.0f;

        // Act
        float result = cr1.calcularCustosSeguranca();

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    void testCalcularCustosMensais() {
        // Arrange
        Lojas cr2 = new Restauracao("I789", "MacDonald", 25, 100000, 30, 40, 300);
        Restauracao.setCustoSegurancaPorMesa(5);
        float expectedResult = 3750.0f;

        // Act
        float result = cr2.calcularCustosMensais();

        // Assert
        assertEquals(expectedResult, result);

    }

    @Test
    void testCalcularNovoCustosSeguranca() {
        // Arrange
        Lojas cr2 = new Restauracao("I789", "MacDonald", 25, 100000, 30, 40, 300);
        Restauracao.setCustoSegurancaPorMesa(7);
        float expectedResult = 280.0f;

        // Act
        float result = cr2.calcularCustosSeguranca();

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    void testCalcularNovoCustosMensais() {
        // Arrange
        Lojas cr2 = new Restauracao("I789", "MacDonald", 25, 100000, 30, 40, 300);
        Restauracao.setCustoSegurancaPorMesa(7);
        float expectedResult = 3830.0f;

        // Act
        float result = cr2.calcularCustosMensais();

        // Assert
        assertEquals(expectedResult, result);

    }

    @Test
    void testEquals() {
        // Testar se dois objetos iguais são iguais
        // Arrange
        Lojas cr1 = new Restauracao("R333", "Burger King", 18, 60000, 18, 30, 180);
        Lojas cr2 = new Restauracao("R333", "Burger King", 18, 60000, 18, 30, 180);

        // Act
        boolean result = cr1.equals(cr2);

        // Assert
        assertTrue(result);

    }

    @Test
    void testEqualsDifferentObjectsSameClass() {
        // Testar se dois objetos diferentes são iguais (mesma classe)
        // Arrange
        Lojas cr1 = new Restauracao("R333", "Burger King", 18, 60000, 18, 30, 180);
        Lojas cr2 = new Restauracao("R333", "Burger King", 30, 60000, 15, 30, 180);

        // Act
        boolean result = cr1.equals(cr2);

        // Assert
        assertFalse(result);

    }

    @Test
    void testEqualsDifferentObjectsDifferentClass() {
        // Testar se dois objetos diferentes são iguais (classe diferente)
        // Arrange
        Lojas cr1 = new Restauracao("R333", "Burger King", 18, 60000, 18, 30, 180);
        Lojas cq1 = new Quiosque("N999", "Tabacaria Julio", 5, 2000, 3);

        // Act
        boolean result = cr1.equals(cq1);

        // Assert
        assertFalse(result);

    }
}