package academy.learnprogramming;

public class MyLinkedList implements NodeList {

    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (null == item) {
            return false;
        }

        ListItem previousItem = null;
        ListItem nextItem = null;

        nextItem = this.root;
        while (null != nextItem && item.compareTo(nextItem) >= 0) {

            if (nextItem.compareTo(item) == 0) {
                //values are equal, therefore duplicate
                return false;
            }

            previousItem = nextItem;
            nextItem = nextItem.next();
        }

        if (null == previousItem) {
            //inserting at root
            if (null != this.root) {
                nextItem = this.root;
                if (null != nextItem) {
                    item.setNext(nextItem);
                    nextItem.setPrevious(item);
                }
            }
            this.root = item;
            return true;
        } else if (null == nextItem) {
            //inserting at end of the list
            previousItem.setNext(item);
            item.setPrevious(previousItem);
            return true;
        } else {
            //inserting midway in the list
            previousItem.setNext(item);
            item.setPrevious(previousItem);
            item.setNext(nextItem);
            nextItem.setPrevious(item);
            return true;
        }
    }

    @Override
    public boolean removeItem(ListItem item) {

        if (null == item) {
            return false;
        }

        ListItem previousItem = null;
        ListItem nextItem = null;

        nextItem = this.root;
        while (null != nextItem && item.compareTo(nextItem) != 0) {
            previousItem = nextItem;
            nextItem = nextItem.next();
        }

        if (null == nextItem) {
//            Item wasn't found
            return false;
        } else {
            ListItem itemToDelete = nextItem;

            nextItem = nextItem.next();
            if (null != nextItem) {
                nextItem.setPrevious(previousItem);
            }
            if (null == previousItem) {
//                item to delete is the root
                this.root = nextItem;
            } else {
                previousItem.setNext(nextItem);
            }

            itemToDelete.setNext(null);
            itemToDelete.setPrevious(null);

            return true;

        }

    }

    @Override
    public void traverse(ListItem root) {
        if (null == root) {
            System.out.println("The list is empty");
        } else {
            System.out.println(root.getValue());
            if (null != root.next()) {
                traverse(root.next());
            }
        }
    }
}
