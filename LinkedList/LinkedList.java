
public class LinkedList{

    public Node head;

    public LinkedList(){
        head = null;
    }
    
    public void insert(int data){
        System.out.println("Add new Node " + data);
        Node temp = new Node();
        temp.data = data;
        temp.next = head;
        head = temp;
    }

    // Append to the end of the list
    public void append(int data){
        System.out.println("Append new Node " + data + " to the list.");
        //Create a temp Node
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        if(head == null){
            head = newNode;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    //Delete the list
    public void deleteList(){
        System.out.println("Deleting list...");
        head = null;
    }

    //Push a node at the front of the list
    public void push(int data){
        System.out.println("Push a new Node " + data + " at the front of the list");
        Node temp = new Node();
        temp.data = data;
        temp.next = null;

        if(head == null){            
            head = temp;
        }else{
            temp.next = head;
            head = temp;            
        }
    }

    public boolean update(int oldData, int newData){
        Node old = this.search(oldData);
        
        if(old == null)
            return false;

        old.data = newData;
        
        return true;
    }

    public boolean delete(int data){
        Node current = head;

        if(current == null)
            return false;
        
        if(current.data == data){
            head = current.next;
            current = null;
            return true;
        }

        current = head.next;
        Node prev = head;
        while (current != null) {
            if(current.data == data){
                prev.next = current.next;
                current = null;
                return true;
            }
            current = current.next;
            prev = prev.next;
        }

        return false;
    }

    public Node search(int data){
        Node temp = head;
        while(temp != null){
            if(temp.data == data)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    public int listLength(){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }

        return count;
    }



    //Tostring
    public String toString(){
        String outString = "";
        Node temp = head;
        while(temp != null){
            outString += String.format("%s", temp);
            temp = temp.next;
        }

        outString += String.format("List is empty!\n");
        outString += String.format("Length of List = %d ",this.listLength());
        return outString;
    }



}


