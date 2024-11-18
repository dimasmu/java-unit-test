package tutorial.unit.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class ConditionTest {

    @Test
    @EnabledOnOs({OS.WINDOWS})
    void testRunOnlyOnWindows() {

    }

}
