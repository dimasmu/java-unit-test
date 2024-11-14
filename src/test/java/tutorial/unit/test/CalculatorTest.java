package tutorial.unit.test;

import org.junit.jupiter.api.*;
import org.opentest4j.TestAbortedException;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

//@DisplayName("Test untuk kalkulator class")
@DisplayNameGeneration(SimpleDisplayNameGenerator.class)
public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @BeforeAll
    public static void beforeAll(){
        System.out.println("before All");
    }

    @AfterAll
    public static void afterAl(){
        System.out.println("After All");
    }
    @BeforeEach
    public void setup() {
        System.out.println("Before each");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("After each");
    }

    @Test
    @DisplayName("Test skenario sukses method add(integer, integer)")
    public void testAddSuccess() {
        var result = calculator.add(10, 10);

        assertEquals(20, result);
    }

    @Test
    public void testDivideSuccess() {
//      Jika ingin mencari tidak sama dengan bisa memakai assertNotEquals
        var result = calculator.divide(100, 10);
        assertEquals(10, result);
    }

    @Test
    public void testDivideFailed() {
//      jika ada throw errors pada codingan bisa memakai assertThrows
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(100, 0);
        });
    }

    @Test
    @Disabled
    public void testComingSoon() {
//  TODO
//  Buat unit test yang akan mau dibuat atau akan mau difix namun belum paham untuk membetulkannya ketika perintah "mvn test" bakal ada 1 yang skipped
    }

//  Exception namun tidak error. dianggap berhenti
    @Test
    public void testAborted(){
        var profile = System.getenv("PROFILE");
        if(!"DEV".equals(profile)) throw new TestAbortedException("Test dibatalkan karena bukan dev");
    }

    @Test
    public void testAssumption(){
//      Penggunaan sama persis seperti method testAborted. namun lebih bagus memakai assume karena tidak perlu manual melakukan trhow error
        assumeTrue("DEV".equals(System.getenv("PROFILE")));
    }
}
