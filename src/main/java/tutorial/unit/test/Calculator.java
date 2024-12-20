package tutorial.unit.test;

public class Calculator {


    public Integer divide(Integer first, Integer second) {

        if (second == 0) {
            throw new IllegalArgumentException("Can't divide by zero");
        }

        return first / second;
    }

    public Integer add(Integer first, Integer second) {
        return first + second;
    }

}
