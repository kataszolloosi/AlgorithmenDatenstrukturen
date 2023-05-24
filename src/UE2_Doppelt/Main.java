package UE2_Doppelt;

public class Main {

    public static void main(String[] args) {
        WagonLinkedList list = new WagonLinkedList();

        list.printList();

        list.insertWagonAtFirstPos("A 15");
        list.insertWagonAtFirstPos("B 659");
        list.insertWagonAtFirstPos("C 2");
        list.insertWagonAtFirstPos("D 85444");
        list.printList();
        System.out.println("First: " + (list.getFirst() != null ? list.getFirst().getWagonId() : "null"));
        System.out.println("Last: " + (list.getLast() != null ? list.getLast().getWagonId() : "null"));

        list.removeWagonFromLastPos();
        list.printList();

    }
}
