package tutorial.unit.test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import java.util.Properties;

public class ConditionTest {

    @Test
    @EnabledOnOs({OS.WINDOWS})
    void testRunOnlyOnWindows() {

    }

    @Test
    @DisabledOnOs({OS.WINDOWS})
    void testDisabledOnlyOnWindows() {

    }

    @Test
    @EnabledOnJre(value = {JRE.JAVA_8})
    void testEnabledOnJava8() {

    }

    @Test
    @DisabledOnJre(value = {JRE.JAVA_8})
    void testDisabledOnJava8() {

    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_11)
    void testEnableRange() {

    }

    @Test
    @DisabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_11)
    void testDisabledRange() {

    }

    @Test
    @EnabledIfSystemProperties({
            @EnabledIfSystemProperty(named = "java.vm.specification.vendor", matches = "Oracle Corporation")
    })
    void testEnabledSystemProperties() {
        Properties properties = System.getProperties();
        properties.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });
    }

    @Test
    @DisabledIfSystemProperties({
            @DisabledIfSystemProperty(named = "java.vm.specification.vendor", matches = "Oracle Corporation")
    })
    void testDisabledSystemProperties() {
        Properties properties = System.getProperties();
        properties.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });
    }
}
