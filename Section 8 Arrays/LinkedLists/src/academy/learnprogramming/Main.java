package academy.learnprogramming;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] randomsTenThousand = generateRandoms(1000000);

        populateLists(randomsTenThousand);
//        populateListsInOrder(randomsTenThousand);
        countEvens(randomsTenThousand);
    }

    private static int[] generateRandoms(int amount) {
        int[] randoms = new int[amount];
        Random random = new Random();
        for (int i=0; i < amount; i++) {
            randoms[i] = random.nextInt(Integer.MAX_VALUE);
        }
        return randoms;
    }

    private static void populateLists(int[] randoms) {
        long start = System.currentTimeMillis();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i < randoms.length; i++)  {
            list.add(randoms[i]);
        }
        long end = System.currentTimeMillis();
        System.out.println("It took " + (end-start) + "ms to populate an ArrayList with " + randoms.length + " random ints.");

        start = System.currentTimeMillis();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i=0; i < randoms.length; i++)  {
            linkedList.add(randoms[i]);
        }
        end = System.currentTimeMillis();
        System.out.println("It took " + (end-start) + "ms to populate a LinkedList with " + randoms.length + " random ints.");
    }

    private static void populateListsInOrder(int[] randoms) {
        long start = System.currentTimeMillis();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i < randoms.length; i++)  {
            Iterator<Integer> iterator = list.iterator();
            int index = 0;
            while (iterator.hasNext()) {
                if (iterator.next() > randoms[i]) {
                    break;
                }
                index++;
            }
            list.add(index, randoms[i]);
        }
        long end = System.currentTimeMillis();
        System.out.println("It took " + (end-start) + "ms to populate an ArrayList with " + randoms.length + " sorted ints.");


        start = System.currentTimeMillis();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i=0; i < randoms.length; i++)  {
            ListIterator<Integer> iterator = linkedList.listIterator();
            while (iterator.hasNext()) {
                if (iterator.next() > randoms[i]) {
                    break;
                }
            }
            iterator.add(randoms[i]);
        }
        end = System.currentTimeMillis();
        System.out.println("It took " + (end-start) + "ms to populate a LinkedList with " + randoms.length + " sorted ints.");
    }

    private static void countEvens(int[] randoms) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i < randoms.length; i++)  {
            list.add(randoms[i]);
        }

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i=0; i < randoms.length; i++)  {
            linkedList.add(randoms[i]);
        }

        long start = System.currentTimeMillis();
        int listEvenCount = 0;
        for (Integer item : list) {
            if (item % 2 == 0) {
                listEvenCount++;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("It took " + (end-start) + "ms to process an ArrayList with " + randoms.length + " ints.");

        start = System.currentTimeMillis();
        listEvenCount = 0;
        for (Integer item : linkedList) {
            if (item % 2 == 0) {
                listEvenCount++;
            }
        }
        end = System.currentTimeMillis();
        System.out.println("It took " + (end-start) + "ms to process a LinkedList with " + randoms.length + " ints.");
    }
}
