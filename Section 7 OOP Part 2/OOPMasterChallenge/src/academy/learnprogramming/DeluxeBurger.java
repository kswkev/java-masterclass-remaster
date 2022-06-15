package academy.learnprogramming;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger(String breadRollType, String meat, double basePrice) {
        super(breadRollType, meat, basePrice, 2);

        this.addAdditionalItem(new Item("chips", 2.50));
        this.addAdditionalItem(new Item("drink", 1.25));
    }
}
