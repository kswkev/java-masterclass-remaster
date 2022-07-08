package academy.learnprogramming;

public class Node<T extends Comparable<T>> extends ListItem<T>{

    public Node(T value) {
        super(value);
    }

    @Override
    ListItem<T> next() {
        return this.next;
    }

    @Override
    void setNext(ListItem<T> item) {
        this.next = item;
    }

    @Override
    ListItem<T> previous() {
        return this.previous;
    }

    @Override
    void setPrevious(ListItem<T> item) {
        this.previous = item;
    }

    @Override
    int compareTo(ListItem<T> obj) {
        return this.getValue().compareTo(obj.getValue());
    }
}
