package tdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WacDonaldsOrderTest {

    WacDonaldOrder wacDonaldOrder;

    @BeforeEach
    void beforeEach(){
        wacDonaldOrder = new WacDonaldOrder();
    }

    //- One chicken nuggets + one water = 6.20

    @Test
    void testCalculateSmallOrder(){
        //given
        String [] items = new String[] {
                "Chicken nuggets", "Water"};

        //when
        double result = wacDonaldOrder.calculatorOrder(items);

        //then
        Assertions.assertThat(result).isEqualTo(6.20);
        }

    //- One big burger + one french fries + two apple juices = 12.10

    @Test
    void testCalculateBigOrder(){
        //given
        String [] items = new String[] {
                "Big Burger", "French Fries", "Apple juice", "Apple juice"};

        //when
        double result = wacDonaldOrder.calculatorOrder(items);

        //then
        Assertions.assertThat(result).isEqualTo(12.10);
    }
    //- One cheeseburger + one chicken nuggets + one great-cola = 5.18
    @Test
    void testCalculateComboOrder(){
        //given
        String [] items = new String[] {
                "Cheeseburger", "Chicken nuggets", "Great-Cola"};

        //when
        double result = wacDonaldOrder.calculatorOrder(items);

        //then
        Assertions.assertThat(result).isEqualTo(5.18);

    }


}
