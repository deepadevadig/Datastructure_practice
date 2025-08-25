public class Cirsular {

    Node tail;

    public Cirsular()
    {
        this.tail = null;

    }

    public void InsertAt_tail( int data)
    {
        Node new_Node = new Node(data);
        //List is empty
        if(this.tail == null)
        {
             new_Node.next = new_Node;
             this.tail = new_Node;
             return;

        }
        //List has 2 or more elements
        new_Node.next = this.tail.next;
        this.tail.next = new_Node;
        this.tail = new_Node;
    }
    public void insertAtBegining(int data)
    {
        Node new_Node = new Node(data);
        //empty list
        if(this.tail == null)
        {
            new_Node.next = new_Node;
             this.tail = new_Node;
             return;
        }
        //list has one or more
        new_Node.next = tail.next;
        tail.next = new_Node;

    }
    public void printAllList()
    {
        
        // empty list
        if (this.tail == null)
        {
            System.out.println("List is empty");
            return;
        }
        

        Node currentNode = this.tail.next;
        System.out.println("Nodes in the list are");
        

        while (true) 
        {
            System.out.print(currentNode.data);
            currentNode = currentNode.next;
            if(currentNode == tail)
            {
                System.out.print("    " +currentNode.data);
                break;
            
            }
            
        }


    }

    public void search(int key)
    {
        
        // empty list
        if (this.tail == null)
        {
            System.out.println("List is empty");
            return;
        }
        
        // list has one

        Node currentNode = this.tail.next;
       System.out.println("Nodes in the list are");

        while (true) 
        {
            //System.out.print(currentNode.data);
            if (key == currentNode.data)
            {
                System.out.println("Ky is found");
                return;
            }
            currentNode = currentNode.next;
            if(currentNode == tail)
            {
                //System.out.print("" +currentNode.data);
                if(key == currentNode.data)
                {
                    System.out.println("Kys is found");
                    return;

                }
                break;
                
            
            }
            
        }
    System.out.println("Key is not found");
    }

    public void DelteAtTail()
    {
        // List is empty
        if(this.tail == null)
        {
            System.out.println("List is empty");
        }
        // if there is only one node
        if(this.tail.next == this.tail)
        {
            this.tail = null;
            return;

        }
        // if there are two or more nodes

        Node newTail = this.tail.next;
        while (newTail.next != this.tail) 
        {
            newTail = newTail.next;
            
        }
        newTail.next = this.tail.next;
        this.tail = newTail;
    }
    public void deleteAthead()
    {
        if(this.tail == null)
        {
            System.out.println("List is empty");
        }
        // if there is only one node
        if(this.tail.next == this.tail)
        {
            this.tail = null;
            return;
        }
        // two or more nodes
        tail.next = tail.next.next;

    }

    public void Testcircularlist()
    {
       // this.printAllList();
        this.InsertAt_tail(67);
        this.insertAtBegining(87);
        //this.printAllList();

        this.search(800);
        this.DelteAtTail();
        this.deleteAthead();
        this.insertAtBegining(8);
        this.search(8);
        this.printAllList();
    }



    
}