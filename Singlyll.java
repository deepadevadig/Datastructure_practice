public class Singlyll 
{
    Node head;

    
    public Singlyll( )
    {
        this.head = null;
        System.out.println("Singly ll object is created");
        


    }
    // it does not matter where it has nodes or not
    //we can set next to current head
    //make the new node as current node
    public void insertAtBeginning(int data)
    {
        Node newnode = new Node(data);
        newnode.next = this.head;
        this.head = newnode;

    }

    public void inssertAtend(int data)
    {
        Node newnode = new Node(data);
        if (this.head == null)
        {
            this.head = newnode;
            System.out.println("list was empty we made the new node as head");
            return;
        }
        Node currentNode = this.head;
        while(currentNode.next != null)
        {
            currentNode = currentNode.next;

        }
            currentNode.next = newnode;
            System.out.println("inserted node at the last");
            
    
     

    }
    public void PrintAllnodesData()
    {
        if(this.head == null)
            {
                System.out.println("List is empty");

            }
         
        System.out.println("nodes in the list are");     
        Node currentNode = this.head;
            while(currentNode != null)
            {
                System.out.print(" "+ currentNode.data + "------> " );
               currentNode = currentNode.next;
            }

            System.out.println("null");
    }
    public void insertAtgiven_position(int data, int targeted_position)
    {
        if (targeted_position <= 0)
        {
            System.out.println("Invalid position");
            return;
        }
        if (targeted_position == 1)
        {
            this.insertAtBeginning(data);
        }
        Node current_node = this.head;
        int currentpotision = 1;
        while(currentpotision <= targeted_position-1)
        {
            if(current_node == null)
            {
                break;
            }
            current_node = current_node.next;
            currentpotision = currentpotision+1;
        }
        if (current_node == null)
        {
            System.out.println("Invalid position");
            return;
        }
        Node new_Node = new Node(data);
        new_Node.next = current_node.next;
        current_node.next = new_Node;

    }

    public void deleteAt_beginning()
    {
      //list is empty
      if(this.head == null)
      {
        System.out.println("list is empty we cannot delete ");
        return;

      }
      //list has only one node when you delete this node list becomes empty
      if(this.head.next == null)
      {
        this.head =this.head.next;
        return;
      }
      // 2 or more node present in the list
      this.head = this.head.next;
      System.err.println("deleted the nodes in the list");
    }
    public void deleAtend()
    {
        //List is empty
         if(this.head == null)
      {
        System.out.println("list is empty we cannot delete ");
        return;

      }
      // list has one node if this node deleted list becomes empty
      if(this.head.next == null)
      {
        this.head = null;
        return;
      }

    // What if there are two or more node
    Node currentNode = this.head;
    while(currentNode.next.next != null)
    {
        currentNode = currentNode.next;

    }
    // delete operation
    currentNode.next = null;

    }
    
    public void Search(int key)
    {
        if(this.head == null)
            {
                System.out.println("List is empty");

            }
         //System.out.println("nodes in the list are");     
        Node currentNode = this.head;
            while(currentNode != null)
            {
                if(currentNode.data == key)
                {
                    System.out.println("key is found in the list");
                    return;
                }
               currentNode = currentNode.next;
            }

            System.out.println("Key is not found in the list");
    }


    public void insertAtposition()
    {
      this.insertAtgiven_position(23, 2);
      this.insertAtgiven_position(90, -1);
      this.insertAtgiven_position(100, 0);
      this.insertAtgiven_position(150, 3);
    }
    public void testAlloperations()
    {
        this.deleteAt_beginning();
        this.deleAtend();
        
        this.insertAtBeginning(76);
        this.deleteAt_beginning();
        
        this.insertAtBeginning(80);
        this.deleAtend();
         
        this.insertAtBeginning(3);
        this.insertAtBeginning(9);
        this.insertAtBeginning(5);
        this.insertAtBeginning(98);

        this.PrintAllnodesData();
        this.inssertAtend(444);
        this.PrintAllnodesData();

        this.deleteAt_beginning();
        this.PrintAllnodesData();

        this.deleAtend();
        this.PrintAllnodesData();
        
        this.Search(100);
        this.Search(3);

    }
    
}
