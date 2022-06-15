package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

public class Hamburger {

    private String breadRollType;
    private String meat;
    private List<Item> additionalItems;
    private double basePrice;
    private int maxAdditionalItemsAllowed;

    public Hamburger(String breadRollType, String meat, double basePrice) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.additionalItems = new ArrayList<Item>();
        this.basePrice = basePrice;
        this.maxAdditionalItemsAllowed = 4;
    }

    public Hamburger(String breadRollType, String meat, double basePrice, int maxAdditionalItemsAllowed) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.additionalItems = new ArrayList<Item>();
        this.basePrice = basePrice;
        this.maxAdditionalItemsAllowed = maxAdditionalItemsAllowed;
    }

    public void addAdditionalItem(Item item) {
        if (additionalItems.size() < maxAdditionalItemsAllowed) {
            this.additionalItems.add(item);
        } else {
            System.out.println("No more additional items can be added");
        }
    }

    public double calculateTotalCost() {
        double totalCost = this.basePrice;
        for (Item item : additionalItems) {
            totalCost += item.getPrice();
        }
        return totalCost;
    }

    public String orderDetails() {
        String orderDetails = "Current order for:\n";
        orderDetails += "roll: " +  breadRollType + "\n";
        orderDetails += "meat: " +  meat + "\n";
        orderDetails += "cost: £" +  basePrice + "\n";
        orderDetails += "plus additional items:\n";
        if (additionalItems.size() == 0) {
            orderDetails += "NA\n";
        }
        for (Item item : additionalItems) {
            orderDetails += item.getName() + " cost: £" + item.getPrice() + "\n";
        }
        orderDetails += "total cost: £" + calculateTotalCost();
        return orderDetails;
    }


}
