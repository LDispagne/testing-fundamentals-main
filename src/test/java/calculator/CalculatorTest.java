package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void beforeEach(){
        System.out.println("Instantiating a new calculator");
        calculator = new Calculator();
        System.out.println("Calculator is ready");
    }

    //test scenario 1:
    //5+3=8;
    @Test
    void testAddTwoNumbers (){
        //given
        double first = 5;
        double second = 3;


        // when
        double result = calculator.add(first, second);

        // then
        Assertions.assertEquals(8, result);
    }

    //test scenario 2:
    //2 - 6 = -4;
    @Test
    void testSubtractTwoNumbers () {
        //given
        double first = 2;
        double second = 6;


        // when
        double result = calculator.subtract(first, second);

        // then
        Assertions.assertEquals(-4, result);
    }

    //test scenario 3:
    //4/2=2;
    @Test
    void testDivideTwoNumbers () {
        //given
        double first = 4;
        double second = 2;


        // when
        double result = calculator.divide(first, second);

        // then
        Assertions.assertEquals(2, result);
    }

    //test scenario 4:
    //5*3=15;
    @Test
    void testMultiplyTwoNumbers () {
        //given
        double first = 5;
        double second = 3;


        // when
        double result = calculator.multiply(first, second);

        // then
        Assertions.assertEquals(15, result);
    }
}
