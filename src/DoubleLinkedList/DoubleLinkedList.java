package DoubleLinkedList;

public class DoubleLinkedList {
    private Node first;
    private Node last;

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public void addBookingToLastPos(Booking newBooking) {
        //knoten anlegen
        Node newNode = new Node();
        newNode.setBooking(newBooking);  //wert drinnen steht

        //fall: liste ist leer
        if (first == null) {
            first = newNode;
            last = newNode;
        }
        //fall: liste ist befüllt
        else {
            newNode.setPrev(last);
            last.setNext(newNode);
            last = newNode;
        }
    }

    public void addBookingAtIndex(int index, Booking newBooking) {
        Node newNode = new Node();
        newNode.setBooking(newBooking);
        //wenn ein zu größer indes angegeben wird,
        // dann fügen wir es am ende hinzu
        //beispiel: liste besteht aus 4 knoten. angabe index 9 dh.
        // neues element wird der 5. knoten in dem fall

        //fall: liste ist leer
        if (first == null) {
            first = newNode;
            last = newNode;
        }
        //
        else if (index == 0) {
            newNode.setNext(first);
            first.setPrev(newNode);
            first = newNode;
        } else {
            //vorgänger vom übergebenen index finden
            Node predecessorNode = first;
            for (int i = 0; i < index - 1; i++) {
                //weiterhüpfen zur nächsten node
                predecessorNode = predecessorNode.getNext();
//                TODO: fehlersituation: index zu groß
                if (predecessorNode == last) {
                    break;
                }
            }
            newNode.setNext(predecessorNode.getNext());
            newNode.setPrev(predecessorNode);
            predecessorNode.setNext(newNode);
            //mit hilfsvariable
//           Node currentNode = newNode.getNext();
//           currentNode.setPrev(newNode);

            Node helperNode = newNode.getNext();
            if (helperNode != null) {
                newNode.getNext().setPrev(newNode);
                //Null.setprev --> exception
            } else {
                //neues element ist letztes element jetzt - last anpassen
                last = newNode;
            }
        }
    }
}
