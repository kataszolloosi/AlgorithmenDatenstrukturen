package Bäume.BinaryTree;

public class BinaryTree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void add(int number) {
        //Node-objekt erzeugen - knoten
        Node newNode = new Node();
        newNode.setNumber(number);

        //wenn baum ist leer
        if (root == null) {
            root = newNode;
        }
        //wenn baum ist nicht leer
        else {
            Node current = root;
            boolean nodeAdded = false;
            while (nodeAdded == false) {
                //wenn neuer wert ist kleiner als aktueller knoten, dann left
                if (newNode.getNumber() < current.getNumber()) {
                    if (current.getLeft() == null) {
                        current.setLeft(newNode);
                        nodeAdded = true;
                    }
                    //sonst beim linken knoten weitersuchen
                    else {
                        current = current.getLeft();
                    }
                }
                //falls ist größer, dann right
                else {
                    //rechtes kind existiert nicht - hier kann neuer knoten eingefügt werden
                    if (current.getRight() == null) {
                        current.setRight(newNode);
                        nodeAdded = true;
                    } else {
                        current = current.getRight();
                    }
                }
            }
        }
    }

    public Node search(int number) {
        //hilfsvariable
        Node current = root;

        while(current != null) {
            // knoten gefunden
            if (current.getNumber() == number) {
                return current;
            }
            //gesuchter wert kleiner als aktueller knoten, dann links weitergehen
            else if (number < current.getNumber()) {
                current = current.getLeft();
            }
            //gesuchter wert größer als aktueller knoten, dann rechts weitergehen
            else {
                current = current.getRight();
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }
}
