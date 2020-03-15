
public class App {

    public static void main(String[] args) {

        LinkedList link1 = new LinkedList();

        System.out.println("=============================");  
        System.out.println("=======INSERT SECTION========");  
        System.out.println("=============================");
        //insert 10
        link1.insert(5);
        link1.insert(20);
        link1.insert(30);
      
        //Print out the linked list
        System.out.println(link1);
        //Print out the Head
        System.out.println(link1.head);
        System.out.println("=============================");  
        System.out.println("=======SEARCH SECTION========");  
        System.out.println("=============================");
        //Print out Search
        if(link1.search(10) != null)
            System.out.println("Found 10");
        else
            System.out.println("Not found");

        System.out.println("=============================");  
        System.out.println("=======UPDATE SECTION========");  
        System.out.println("=============================");
        //Print out Update
        System.out.println("Will update 20 to 100");  
        if(link1.update(20,100))
            System.out.println("Updated!");            
        else
            System.out.println("Failed update!");
        //Print out the linked list
        System.out.println(link1);
        
        //Insert 50
        link1.insert(50);
        //Print out the linked list
        System.out.println(link1);

        System.out.println("=============================");  
        System.out.println("=======APPEND SECTION========");  
        System.out.println("=============================");
        //Append 40 after 5
        link1.append(40);
        //Print out the linked list
        System.out.println(link1);
        //Append 60 after 40
        link1.append(60);
        //Print out the linked list
        System.out.println(link1);

        System.out.println("=============================");  
        System.out.println("=======PUSH SECTION========");  
        System.out.println("=============================");
        link1.push(2);
        //Print out the linked list
        System.out.println(link1);
        
        System.out.println("=============================");  
        System.out.println("=======DELETE SECTION========");  
        System.out.println("=============================");
        //Delete 40
        System.out.println("Will delete 40");  
        if(link1.delete(40))
            System.out.println("Deleted!");  
        else
            System.out.println("Failed delete!");  
        //Print out the linked list
        System.out.println(link1);

        //Delete 50
        System.out.println("Will delete 50");  
        if(link1.delete(50))
            System.out.println("Deleted!");  
        else
            System.out.println("Failed delete!");  
        //Print out the linked list
        System.out.println(link1);

        //Delete 70
        System.out.println("Will delete 70");  
        if(link1.delete(70))
            System.out.println("Deleted!");  
        else
            System.out.println("Failed delete!");  
        //Print out the linked list
        System.out.println(link1);

        //Delete list
        link1.deleteList();
        System.out.println(link1);

    }

}