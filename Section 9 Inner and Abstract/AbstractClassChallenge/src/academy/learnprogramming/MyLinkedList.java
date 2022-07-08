package academy.learnprogramming;

public class MyLinkedList<T extends Comparable<T>> implements NodeList<T> {

    private ListItem<T> root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem<T> getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        ListItem<T> currentItem = root;
        if (null == currentItem) {
            this.root = item;
//            System.out.println(item.getValue() + " set as root");
            return true;
        } else {
            while (currentItem != null) {

                int comparison = item.compareTo(currentItem);

                if (comparison == 0) {
                    System.out.println(item.getValue() + " already exists");
                    return false;
                }

                if (comparison > 0) {
                    if (currentItem.next() == null) {
                        currentItem.setNext(item);
                        item.setPrevious(currentItem);
//                        System.out.println(item.getValue() + " set after " + currentItem.getValue());
                        return true;
                    }
                }

                if (comparison < 0) {
                    if (currentItem.previous() == null) {
                        root = item;
                    } else {
                        currentItem.previous().setNext(item);
                        item.setPrevious(currentItem.previous());
                    }
                    item.setNext(currentItem);
                    currentItem.setPrevious(item);
                    return true;
                }

                currentItem = currentItem.next;
            }

        }
    return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        ListItem<T> currentItem = root;
        if (null == currentItem) {
            return false;
        } else {
            while (currentItem != null) {
                if (currentItem.getValue().equals(item.getValue())) {
                    if (currentItem.previous() != null && currentItem.next() != null) {
                        System.out.println(item.getValue() + " removed from between " + currentItem.previous().getValue() + " and " + currentItem.next().getValue());
                        currentItem.previous().setNext(currentItem.next());
                        currentItem.next().setPrevious(currentItem.previous());
                    }

                    if (currentItem.previous() == null) {
                        System.out.println(item.getValue() + " removed and " + currentItem.next().getValue() + " set as root");
                        root = currentItem.next();
                        currentItem.next().setPrevious(null);
                    }

                    if (currentItem.next() == null) {
                        System.out.println(item.getValue() + " removed from end of list");
                        currentItem.previous().setNext(null);
                    }

                    return true;
                } else {
                    currentItem = currentItem.next();
                }
            }
            System.out.println(item.getValue() + " not found and cannot be removed");
            return false;
        }
    }

    @Override
    public void traverse(ListItem<T> root) {
        if (root == null) {
            System.out.println("The list is empty");
        } else {
            ListItem<T> currentItem = root;
            while (currentItem != null) {
                System.out.println(currentItem.getValue());
                currentItem = currentItem.next();
            }
        }
    }
}
