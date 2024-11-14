package tutorial.unit.test;

import org.junit.jupiter.api.DisplayNameGenerator;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class SimpleDisplayNameGenerator implements DisplayNameGenerator {

    @Override
    public String generateDisplayNameForClass(Class<?> testClass) {
        return "Test " + testClass.getSimpleName();
    }

    @Override
    public String generateDisplayNameForNestedClass(Class<?> nestedClass) {
        return null;
    }

    @Override
    public String generateDisplayNameForMethod(Class<?> testClass, Method testMethod) {
        return "Test " + testClass.getSimpleName() + "." + testMethod.getName();
    }
}
