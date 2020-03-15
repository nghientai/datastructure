public class Node {
    public int data;
    public Node next;

    public Node() {
        this.data = -1;
        this.next = null;
    }

    public String toString() {
        return String.format("%s -> ", this.data);
    }

}