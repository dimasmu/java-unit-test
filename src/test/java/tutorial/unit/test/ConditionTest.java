package tutorial.unit.test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

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
}
