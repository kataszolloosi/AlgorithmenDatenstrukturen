package UE3_Bookstack;

public class Node {
    //membervariable
    private final String title;
    private Node next;

    //konstruktor
    public Node(String title) {
        this.title = title;
    }

    //getter-setter
    public String getTitel() {
        return title;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
