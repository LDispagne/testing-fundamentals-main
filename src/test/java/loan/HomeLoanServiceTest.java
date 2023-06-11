package loan;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HomeLoanServiceTest {

    HomeLoanService homeLoanService;

    @BeforeEach
    void beforeEach () {
        homeLoanService = new HomeLoanService();
    }
//    Test scenario 1:
//Given that property price is 140_000.00
//Given that account balance is 21_000.00
//Assert that final decision is granted

    @Test
    void testLowerPropertyPriceWithBalance (){

        //given
        double accountBalance = 21_000;
        double propertyPrice = 140_000;

        //when
        boolean result = homeLoanService.applyForHomeLoan(accountBalance, propertyPrice);

        //then
        Assertions.assertThat(result).isTrue();
    }
//
//    Test scenario 2:
//            - Given that property price is 125_000.00
//            - Given that account balance is 18_749.00
//            - Assert that final decision is not granted

    @Test
    void testHigherPropertyPriceWithoutBalance() {

        //given
        double accountBalance = 18_749;
        double propertyPrice = 125_000;

        //when
        boolean result = homeLoanService.applyForHomeLoan(accountBalance, propertyPrice);

        //then
        Assertions.assertThat(result).isFalse();
    }
//
//
//    Test scenario 3:
//            - Given that property price is 150_000.00
//            - Given that account balance is 30_000.00
//            - Assert that final decision is granted

    @Test
    void testLowerPropertyPriceWithoutBalance() {

        //given
        double accountBalance = 30_000;
        double propertyPrice = 150_000;

        //when
        boolean result = homeLoanService.applyForHomeLoan(accountBalance, propertyPrice);

        //then
        Assertions.assertThat(result).isTrue();
    }
//
//
//    Test scenario 4:
//            - Given that property price is 200_000.00
//            - Given that account balance is 25_000.00
//            - Assert that final decision is not granted

    @Test
    void testHigherPropertyPriceWithBalance() {

        //given
        double accountBalance = 25_000;
        double propertyPrice = 200_000;

        //when
        boolean result = homeLoanService.applyForHomeLoan(accountBalance, propertyPrice);

        //then
        Assertions.assertThat(result).isFalse();
    }

}
