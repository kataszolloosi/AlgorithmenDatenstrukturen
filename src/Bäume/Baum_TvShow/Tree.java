package Bäume.Baum_TvShow;

public class Tree {
    private Node root;

    public void addNode(TvShow newTvShow) {
        Node newNode = new Node(newTvShow);

        if (root == null) {
            // TODO: Was tun, wenn Baum leer ist?
            root = newNode;
        } else {
            addNodeRecursive(root, newNode);
        }
    }

    private void addNodeRecursive(Node currentNode, Node newNode) {
        // TODO: Implementierung hinzufügen
        if (newNode.getTvShow().getRank() < currentNode.getTvShow().getRank()) {
            if (currentNode.getLeft() == null) {
                currentNode.setLeft(newNode);
            } else {
                addNodeRecursive(currentNode.getLeft(), newNode);
            }
        } else {
            if (currentNode.getRight() == null) {
                currentNode.setRight(newNode);
                return;
            } else {
                addNodeRecursive(currentNode.getRight(), newNode);
            }
        }
    }

    public int getMaxDepth() {
        return getMaxDepth(root);
    }

    private int getMaxDepth(Node currentTree) {
        if (currentTree == null)
            return 0;
        else {
            int leftDepth = getMaxDepth(currentTree.getLeft());
            int rightDepth = getMaxDepth(currentTree.getRight());

            if (leftDepth > rightDepth)
                return (leftDepth + 1);
            else
                return (rightDepth + 1);
        }
    }

    /**
     * Knoten nach rechts rotieren:
     * <p>
     * N				 L
     * / \             / \
     * L   r     =>    ll  N
     * / \			      / \
     * ll lr               lr  r
     */
    public void rotateRight() {
        // TODO: Implementierung hinzufügen
        Node nNode = root;
        Node lNode = root.getLeft();
        Node lrNode = root.getRight();

        nNode.setLeft(lrNode);
        root = lNode;
        lNode.setRight(nNode);
    }


    /**
     * Knoten nach links rotieren:
     * <p>
     * N				 R
     * / \             / \
     * l   R     =>    N  rr
     * / \	      / \
     * rl rr       l  rl
     */
    public void rotateLeft()
    {
        // TODO: Implementierung hinzufügen

        //HIlfsvariablen erstellen

        Node nNode = root;
        Node rNode = root.getRight();
        Node rlNode = rNode.getLeft();

        //RL referenz umhängen zum N
        nNode.setRight(rlNode);
        // Neue root ist r
        root = rNode;
        //N Node und R Noder verschieben
        rNode.setLeft(nNode);
    }

    public int getNodeCount() {
        return getNodeCount(root);
    }

    private int getNodeCount(Node currentNode) {
        if (currentNode == null)
            return 0;
        else {
            Node leftNode = currentNode.getLeft();
            if (leftNode != null)
                return (1 + getNodeCount(leftNode));

            Node rightNode = currentNode.getRight();
            if (rightNode != null)
                return (1 + getNodeCount(rightNode));

            return 1;
        }
    }

}
