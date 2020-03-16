
public class CircularLinkedList {
    public int currentSize;
    public DoubleNode current;

    public CircularLinkedList() {
        current = null;
        this.currentSize = 0;
    }

    // Insert before current
    public void insertBeforeCurrent(int n) {

        // If list is empty
        if (current == null) {
            System.out.println("New node " + n + " created!");
            DoubleNode newNode = new DoubleNode();
            newNode.data = n;
            newNode.next = newNode.prev = newNode;
            current = newNode;
        } else {
            System.out.println("Insert " + n + " before " + current.data);
            DoubleNode newNode = new DoubleNode();
            newNode.data = n;
            // Point the pointer to the last Node
            DoubleNode last = (current).prev; // (current).prev

            // Assign next and prev of new node
            newNode.next = current;
            newNode.prev = last;

            // Update next and last pointer of start and last
            last.next = (current).prev = newNode;

            // Move current to newNode
            current = newNode;

        }

        this.currentSize++;

    }

    // Insert after current
    public void insertAfterCurrent(int n) {

        // If list is empty
        if (current == null) {
            System.out.println("New node " + n + " created!");
            DoubleNode newNode = new DoubleNode();
            newNode.data = n;
            newNode.next = newNode.prev = newNode;
            current = newNode;
        } else {
            System.out.println("Insert " + n + " after " + current.data);
            // Create node next of current node
            DoubleNode next = current.next;
            DoubleNode newNode = new DoubleNode();
            newNode.data = n;

            // Add newNode in the middle of current and next
            current.next = newNode;
            newNode.prev = current;
            newNode.next = next;
            next.prev = newNode;
            // assign current node to newnode
            current = newNode;
        }
        this.currentSize++;
    }

    // Search in the list
    public DoubleNode search(int n) {
        DoubleNode temp = current;

        if (temp == null)
            return null;
        else {

            while (temp.next != current) {
                if (temp.data == n) {
                    current = temp;
                    return temp;
                }
                temp = temp.next;
            }
            // Check the last item of the list
            if (temp.data == n) {
                current = temp;
                return temp;
            }
        }

        return null;
    }

    // Update a node
    public boolean update(int o, int n) {
        DoubleNode temp = current;

        if (temp == null) // return false if empty list
            return false;
        else {
            while (temp.next != current) {
                if (temp.data == o) {
                    temp.data = n;
                    current = temp;
                    return true;
                }
                temp = temp.next;
            }
            // check the last item
            if (temp.data == o) {
                temp.data = n;
                current = temp;
                return true;
            }
        }

        return false;
    }

    // Delete a node
    public boolean delete(int n) {
        DoubleNode temp = current, prev_temp = null;// create a new temp_prev to do search

        if (temp == null)
            return false;
        else {
            DoubleNode next = current.next;
            while (temp.data != n) {
                if (temp.next == current) {
                    return false;
                }
                prev_temp = temp;
                temp = temp.next;
                next = next.next;
            }
            // check if node is the only one node in the list
            if (current.next == current && prev_temp == null) {
                (current) = null;
                this.currentSize--;
                return true;
            }

            // check if node is the current node
            if (temp == current) {// the item found is the current item
                // move prev_temp to the last element
                prev_temp = (current).prev;
                // move current to the next element
                current = (current).next;
                // adjust the pointer
                prev_temp.next = current;
                (current).prev = prev_temp;
                
            } else if (current.next == current) { // the item found is the last item
                prev_temp.next = current;
                current.prev = prev_temp;
                current = next;
                
            } else {
                // if element in the middle
                /*
                 * System.out.println("\nPre Temp: " + prev_temp.data);
                 * System.out.println("\nTemp: " + temp.data); 
                 * System.out.println("\nNext: " + next.data);
                 */
                prev_temp.next = next;
                next.prev = prev_temp;
                current = next;

            }

            this.currentSize--;
            return true;
        }
    }

    // Print size of list
    public void printSize() {
        System.out.println("\nPrint size: ");
        System.out.printf("%d", currentSize);
    }

    // Print current
    public void printCurrent() {
        System.out.println("Current: ");
        if (currentSize == 0) {
            System.out.println("Empty list! ");
            return;
        }
        System.out.printf("%d ", current.data);
    }

    // Print forward
    public void printForward() {
        System.out.println("\nPrint forward: ");
        if (currentSize == 0) {
            System.out.println("Empty list! ");
            return;
        }

        DoubleNode temp = current;
        while (temp.next != current) {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
        System.out.printf("%d ", temp.data);
    }

    // Print Reverse
    public void printReverse() {
        System.out.println("\nPrint reverse: ");
        if (currentSize == 0) {
            System.out.println("Empty list! ");
            return;
        }
        DoubleNode temp = current;
        DoubleNode last = current.prev;
        System.out.printf("%d ", temp.data);
        temp = last;
        while (temp.prev != last) {
            System.out.printf("%d ", temp.data);
            temp = temp.prev;
        }

    }

    public String toString() {

        return "";
    }

}