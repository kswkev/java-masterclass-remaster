package academy.learnprogramming;

public class SearchTree implements NodeList {

    private ListItem root;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (null == this.getRoot()) {
            this.root = item;
            return true;
        }

        ListItem parent = this.getRoot();
        while (null != parent) {
            if (parent.compareTo(item) == 0) {
//                duplicate found
                return false;
            } else if (parent.compareTo(item) > 0) {
                if (null == parent.previous()) {
                    parent.setPrevious(item);
                    return true;
                } else {
                    parent = parent.previous();
                }
            } else {
                if (null == parent.next()) {
                    parent.setNext(item);
                    return true;
                } else {
                    parent = parent.next();
                }
            }
        }

        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        ListItem current = this.getRoot();
        ListItem parent = null;

        while (null != current && current.compareTo(item) == 0) {
            parent = current;
            if (current.compareTo(item) > 0) {
                current = current.previous();
            } else {
                current = current.next();
            }
        }

        if (current == null) {
            return false;
        } else {
            performRemoval(current, parent);
            return true;
        }

    }

    private void performRemoval(ListItem item, ListItem parent) {
        // remove item from the tree
        if (item.next() == null) {
            // no right tree, so make parent point to left tree (which may be null)
            if (parent.next() == item) {
                // item is right child of its parent
                parent.setNext(item.previous());
            } else if (parent.previous() == item) {
                // item is left child of its parent
                parent.setPrevious(item.previous());
            } else {
                // parent must be item, which means we were looking at the root of the tree
                this.root = item.previous();
            }
        } else if (item.previous() == null) {
            // no left tree, so make parent point to right tree (which may be null)
            if (parent.next() == item) {
                // item is right child of its parent
                parent.setNext(item.next());
            } else if (parent.previous() == item) {
                // item is left child of its parent
                parent.setPrevious(item.next());
            } else {
                // again, we are deleting the root
                this.root = item.next();
            }
        } else {
            // neither left nor right are null, deletion is now a lot trickier!
            // From the right sub-tree, find the smallest value (i.e., the leftmost).
            ListItem current = item.next();
            ListItem leftmostParent = item;
            while (current.previous() != null) {
                leftmostParent = current;
                current = current.previous();
            }
            // Now put the smallest value into our node to be deleted
            item.setValue(current.getValue());
            // and delete the smallest
            if (leftmostParent == item) {
                // there was no leftmost node, so 'current' points to the smallest
                // node (the one that must now be deleted).
                item.setNext(current.next());
            } else {
                // set the smallest node's parent to point to
                // the smallest node's right child (which may be null).
                leftmostParent.setPrevious(current.next());
            }
        }
    }

    @Override
    public void traverse(ListItem root) {
        if (null != root) {
            traverse(root.previous());
            traverse(root.next());
            System.out.println(root.getValue());
        }
    }
}
