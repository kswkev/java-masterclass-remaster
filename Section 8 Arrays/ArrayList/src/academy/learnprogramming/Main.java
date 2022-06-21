package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        GroceryList groceries = new GroceryList();

        groceries.addGroceryItem("Milk");
        groceries.addGroceryItem("Bread");
        groceries.addGroceryItem("Cheese");

        groceries.printGroceryList();

        groceries.modifyGroceryItem(1, "wholemeal bread");

        groceries.printGroceryList();

        groceries.removeGroceryItem(0);

        groceries.printGroceryList();
    }
}
