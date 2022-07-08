package academy.learnprogramming;

public abstract class ListItem<T extends Comparable<T>> {

    protected ListItem previous;
    protected ListItem next;
    protected T value;

    public ListItem(T value) {
        this.value = value;
    }

    abstract ListItem<T> next();
    abstract void setNext(ListItem<T> item);
    abstract ListItem<T> previous();
    abstract void setPrevious(ListItem<T> item);

    abstract int compareTo(ListItem<T> obj);

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
