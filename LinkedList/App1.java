

public class App1{

    public static void main(String[] args){

        LinkedList link1 = new LinkedList();
       
        link1.append(60);
        //Print out the linked list
        System.out.println(link1);

        //insert 10
        link1.insert(5);
        link1.insert(20);
        link1.insert(30);
      
        //Print out the linked list
        System.out.println(link1);
        //Print out the Head
        System.out.println(link1.head);
        //Print out Search
        if(link1.search(10) != null)
            System.out.println("Found 10");
        else
            System.out.println("Not found");

        //Print out Update
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
        
        //Append 40 after 5
        link1.append(40);
        //Print out the linked list
        System.out.println(link1);
        //Append 60 after 40
        link1.append(60);
        //Print out the linked list
        System.out.println(link1);



    }

    
}