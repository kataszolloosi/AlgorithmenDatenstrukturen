package Bäume.BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.add(50);
        tree.add(7);
        tree.add(59);
        tree.add(1);
        tree.add(97);
        tree.add(51);
        tree.add(25);
        tree.add(28);
        System.out.println(tree);

        Node searchNode1 = tree.search(51);
        System.out.println(searchNode1.getNumber());


    }
}
