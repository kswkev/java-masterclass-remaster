package academy.learnprogramming;

public interface NodeList<T extends Comparable<T>> {
    abstract ListItem<T> getRoot();
    abstract boolean addItem(ListItem<T> item);
    abstract boolean removeItem(ListItem<T> item);
    abstract void traverse(ListItem<T> root);
}
