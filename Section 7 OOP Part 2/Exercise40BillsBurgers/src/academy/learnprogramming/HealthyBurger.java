package academy.learnprogramming;

public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String additionName, double additionPrice) {
        this.healthyExtra1Name = additionName;
        this.healthyExtra1Price = additionPrice;
        System.out.println("Added " + additionName + " for an extra " + additionPrice);
    }

    public void addHealthyAddition2(String additionName, double additionPrice) {
        this.healthyExtra2Name = additionName;
        this.healthyExtra2Price = additionPrice;
        System.out.println("Added " + additionName + " for an extra " + additionPrice);
    }

    @Override
    public double itemizeHamburger() {
        double price =  super.itemizeHamburger();

        if (this.healthyExtra1Name != null) {
            price += this.healthyExtra1Price;
        }

        if (this.healthyExtra2Name != null) {
            price += this.healthyExtra2Price;
        }

        return price;
    }
}
