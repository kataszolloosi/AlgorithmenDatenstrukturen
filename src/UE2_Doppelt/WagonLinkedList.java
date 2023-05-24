package UE2_Doppelt;

public class WagonLinkedList {
    // *** Membervariablen ***
    private Node first;
    private Node last;

    // *** Methoden ***

    public Node getFirst() {
        return this.first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return this.last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    void insertWagonAtFirstPos(String wagonId) {
        // Knoten anlegen
        Node newNode = new Node();
        newNode.setWagonId(wagonId);

        // Fall: Liste ist noch leer
        if (first == null)
        {
            first = newNode;
            last = newNode;
        }
        // Fall: Liste ist befüllt
        else
        {
            newNode.setNext(first);
            first.setPrev(newNode);
            first = newNode;
        }
    }

    void removeWagonFromLastPos() {
        // Fall: Liste ist leer
        if (first == null)
            return;
            // Fall: Ein Element
        else if (first == last)
        {
            first = null;
            last = null;
        }
        // Fall: Liste besteht aus 2 oder mehreren ELementen
        else {
            // Ohne Hilfsvariable
            last.getPrev().setNext(null);     //vorgänger vom letzten knoten
            last = last.getPrev();            //lass zeigt jetzt auf den vorgänger

            // Mit Hilfsvariable
//            Node helpNode = last.getPrev();
//            helpNode.setNext(null);
//            last = helpNode;
        }
    }

    void printList() {
        System.out.print("List: ");

        if (this.getFirst() == null) {
            System.out.print("---leer---");
        } else {
            Node currentNode = this.getFirst();
            while (currentNode != null) {
                System.out.print(currentNode.getWagonId() + ", ");
                currentNode = currentNode.getNext();
            }
        }

        System.out.println();
    }


}
