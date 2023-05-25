package Bäume.BinaryTree;

public class Node {
    private int number;
    private Node left;
    private Node right;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "number=" + number +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
