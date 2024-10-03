import org.junit.jupiter.api.Test;
import com.example.Calculadora;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    public CalculadoraTest() {
    }

    @BeforeAll
    public static void setUpClass() {
        System.out.println("Executado antes de todos os testes.");
    }

    @AfterAll
    public static void tearDownClass() {
        System.out.println("Executado depois de todos os testes.");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("Executado antes de cada teste.");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Executado depois de cada teste.");
    }

    @Test
    public void testSomar() {
        System.out.println("Testando somar com números positivos.");
        int n1 = 5;
        int n2 = 5;
        Calculadora instance = new Calculadora();
        double expResult = 10;
        double result = instance.somar(n1, n2);
        assertEquals(expResult, result, 0.0001);
    }

    @Test
    public void testSomar2() {
        System.out.println("Testando somar com números positivos e negativos.");
        int n1 = 5;
        int n2 = -1;
        Calculadora instance = new Calculadora();
        double expResult = 4;
        double result = instance.somar(n1, n2);
        assertEquals(expResult, result, 0.0001);
    }

    @Test
    public void testSubtrair() {
        System.out.println("Testando subtrair.");
        int n1 = 1;
        int n2 = 2;
        Calculadora instance = new Calculadora();
        double expResult = -1;
        double result = instance.subtrair(n1, n2);
        assertEquals(expResult, result, 0.0001);
    }

    @Test
    public void testMultiplicar() {
        System.out.println("Testando multiplicar.");
        int n1 = 3;
        int n2 = 2;
        Calculadora instance = new Calculadora();
        double expResult = 6;
        double result = instance.multiplicar(n1, n2);
        assertEquals(expResult, result, 0.0001);
    }

    @Test
    public void testDividir() {
        System.out.println("Testando dividir com divisor zero (deve gerar exceção).");
        int n1 = 8;
        int n2 = 0;
        Calculadora instance = new Calculadora();
        assertThrows(ArithmeticException.class, () -> {
            instance.dividir(n1, n2);
        });
    }

    @Test
    public void testDividir_CT01() {
        System.out.println("Testando dividir com divisor não zero.");
        int n1 = 8;
        int n2 = 2;
        Calculadora instance = new Calculadora();
        double expResult = 4;
        double result = instance.dividir(n1, n2);
        assertEquals(expResult, result, 0.0001);
    }

    // Testando a função isPar
    @Test
    public void testIsPar() {
        System.out.println("Testando se um número é par.");
        Calculadora instance = new Calculadora();
        assertTrue(instance.isPar(4), "4 deve ser par.");
        assertFalse(instance.isPar(5), "5 não deve ser par.");
    }

    // Testando a função isDivisivel
    @Test
    public void testIsDivisivel() {
        System.out.println("Testando se um número é divisível por outro.");
        Calculadora instance = new Calculadora();
        assertTrue(instance.isDivisivel(10, 2), "10 deve ser divisível por 2.");
        assertFalse(instance.isDivisivel(10, 3), "10 não deve ser divisível por 3.");
        assertThrows(ArithmeticException.class, () -> {
            instance.isDivisivel(10, 0);
        }, "Deve lançar exceção ao tentar dividir por zero.");
    }

    // Testando a função resolverEquacaoPrimeiroGrau
    @Test
    public void testResolverEquacaoPrimeiroGrau() {
        System.out.println("Testando a resolução de equação de 1º grau.");
        Calculadora instance = new Calculadora();
        assertEquals(2, instance.resolverEquacaoPrimeiroGrau(2, -4), 0.0001);
        assertEquals(-3, instance.resolverEquacaoPrimeiroGrau(3, 9), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> {
            instance.resolverEquacaoPrimeiroGrau(0, 5);
        }, "Deve lançar exceção quando o coeficiente 'a' for zero.");
    }

    // Testando a função resolverEquacaoSegundoGrau
    @Test
    public void testResolverEquacaoSegundoGrau() {
        System.out.println("Testando a resolução de equação de 2º grau.");
        Calculadora instance = new Calculadora();
        double[] expectedRoots = { 1, -1 };
        assertArrayEquals(expectedRoots, instance.resolverEquacaoSegundoGrau(1, 0, -1), 0.0001);

        assertThrows(IllegalArgumentException.class, () -> {
            instance.resolverEquacaoSegundoGrau(0, 1, 1);
        }, "Deve lançar exceção quando o coeficiente 'a' for zero.");

        assertThrows(IllegalArgumentException.class, () -> {
            instance.resolverEquacaoSegundoGrau(1, 0, 1);
        }, "Deve lançar exceção quando a equação não possui raízes reais.");
    }
}
