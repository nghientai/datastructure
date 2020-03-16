public class Main {
    public static void main(String[] args) {
        CircularLinkedList l = new CircularLinkedList();
        l.insertBeforeCurrent(5);
        l.insertBeforeCurrent(3);
        l.insertBeforeCurrent(6);
        l.printCurrent();
        l.printForward();
        l.printReverse();

        System.out.println("\n==========INSERT AFTER CURRENT=======================");
        l.insertAfterCurrent(10);
        l.insertAfterCurrent(20);
        l.printCurrent();
        l.printForward();
        l.printReverse();

        // Searching
        System.out.println("\n=============SEARCHING==========================");
        System.out.println("Search 10: ");
        System.out.println(l.search(10)); // found
        l.printCurrent();
        l.printForward();
        l.printReverse();
        // Print out Search
        System.out.println("\n\nSearch 1000: ");
        if (l.search(1000) != null)
            System.out.println("\nFound");
        else
            System.out.println("1000 was not found");
        l.printCurrent();
        l.printForward();
        l.printReverse();

        // Update
        System.out.println("\n============UPDATING===========================");
        System.out.println("\n\nUpdate 6 -> 7: ");
        if (l.update(6, 7))
            System.out.println("\n=> Update succesfull");
        else
            System.out.println("\n=> Update failed");
        l.printCurrent();
        l.printForward();
        l.printReverse();

        System.out.println("\n\nUpdate 60 -> 7: ");
        if (l.update(60, 7))
            System.out.println("\n=> Update succesfull");
        else
            System.out.println("\n=> Update failed");
        l.printCurrent();
        l.printForward();
        l.printReverse();
         // Update
         System.out.println("\n============DELETING===========================");
         System.out.println("\n\nDelete 10");
         if (l.delete(10))
             System.out.println("\n=> Delete succesfull");
         else
             System.out.println("\n=> Delete failed");
         l.printCurrent();
         l.printForward();
         l.printReverse();

         System.out.println("\n\nDelete 2");
         if (l.delete(2))
             System.out.println("\n=> Delete succesfull");
         else
             System.out.println("\n=> Delete failed");
         l.printCurrent();
         l.printForward();
         l.printReverse();
        // Print size
        System.out.println("\n================================================");
        l.printSize();
    }
}