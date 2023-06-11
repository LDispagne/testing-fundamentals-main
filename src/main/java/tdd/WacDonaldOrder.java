package tdd;

public class WacDonaldOrder {

    /**
     * The prices per item unit are:
     * <p>
     * | Item             | Type  | Price |
     * |------------------|-------|-------|
     * | Cheeseburger     | Main  | 1.55  |
     * | Big burger       | Main  | 6.50  |
     * | Chicken nuggets  | Side  | 4.20  |
     * | French fries     | Side  | 1.90  |
     * | Great-Cola       | Drink | 1.65  |
     * | Water            | Drink | 2.00  |
     * | Apple juice      | Drink | 1.85  |
     * <p>
     * <p>
     * A 30% discount should be applied when a customer chooses a combo:
     * one Main + one Side + one Drink.
     */

    public double calculatorOrder(String[] items) {
        double price = 0;
        double countMain = 0;
        double countSide = 0;
        double countDrink = 0;

        for (String item : items) {
            if (item.equals("Cheeseburger")) {
                price += 1.55;
                countMain++;
            }

            if (item.equals("Big burger")) {
                price += 6.50;
            }
            if (item.equals("Chicken nuggets")) {
                price += 4.20;
                countMain++;
            }
            if (item.equals("French fries")) {
                price += 1.90;
                countSide++;
            }
            if (item.equals("Great-Cola")) {
                price += 1.65;
                countDrink++;
            }
            if (item.equals("Water")) {
                price += 2.00;
                countDrink++;
            }
            if (item.equals("Apple juice")) {
                price += 1.85;
                countDrink++;
            }
        }

        if (countMain == 1 && countSide == 1 && countDrink == 1) {
            price = price * 0.70;
        }
        return price;
    }
}
