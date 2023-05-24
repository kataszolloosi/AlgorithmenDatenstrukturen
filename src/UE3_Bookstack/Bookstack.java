package UE3_Bookstack;

public class Bookstack {
    //membervariable
    private Node top;

    //getter-setter

    public Node getTop() {
        return top;
    }

    public void setTop(Node top) {
        this.top = top;
    }

    public void push(String title) {
        // Node erstellen
        Node newNode = new Node(title);

        // Stack ist nicht leer
        if (top != null)
            newNode.setNext(top);

        // top neu setzen
        top = newNode;
    }

    // Pop: Erstes Element zurückliefern und vom Stack herunternehmen
    public String pop() throws StackEmptyException {
        if (top == null) {
            throw new StackEmptyException();
        } else {
            String temp = top.getTitel();
            top = top.getNext();
            return temp;
        }
    }

    public int getCount() {
        int counter = 0;
        Node current = top;

        while (current.getNext() != null) {
            current = current.getNext();
            counter++;
        }

        return counter;
    }
}
