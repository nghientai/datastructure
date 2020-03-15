public class DoubleNode {
    public int data;
    public DoubleNode next;
    public DoubleNode prev;

    public DoubleNode() {
        this.data = -1;
        this.next = null;
        this.prev = null;
    }

    public String toString() {
        return String.format("%s -> ", this.data);
    }

}