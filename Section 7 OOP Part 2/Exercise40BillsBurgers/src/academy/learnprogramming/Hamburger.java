package academy.learnprogramming;

public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadRollType;


    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll with " + this.meat + ", price is " + this.price);
    }

    public void addHamburgerAddition1(String additionName, double additionPrice) {
        this.addition1Name = additionName;
        this.addition1Price = additionPrice;
        System.out.println("Added " + additionName + " for an extra " + additionPrice);
    }

    public void addHamburgerAddition2(String additionName, double additionPrice) {
        this.addition2Name = additionName;
        this.addition2Price = additionPrice;
        System.out.println("Added " + additionName + " for an extra " + additionPrice);
    }

    public void addHamburgerAddition3(String additionName, double additionPrice) {
        this.addition3Name = additionName;
        this.addition3Price = additionPrice;
        System.out.println("Added " + additionName + " for an extra " + additionPrice);
    }

    public void addHamburgerAddition4(String additionName, double additionPrice) {
        this.addition4Name = additionName;
        this.addition4Price = additionPrice;
        System.out.println("Added " + additionName + " for an extra " + additionPrice);
    }

    public double itemizeHamburger() {
        double price = this.price;

        if (this.addition1Name != null) {
            price += this.addition1Price;
        }

        if (this.addition2Name != null) {
            price += this.addition2Price;
        }

        if (this.addition3Name != null) {
            price += this.addition3Price;
        }

        if (this.addition4Name != null) {
            price += this.addition4Price;
        }

        return price;
    }
}
