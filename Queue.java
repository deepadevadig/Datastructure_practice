public class Queue {

    Node rear,front ;

    public Queue()
    {
        this.front = null;
        this.rear = null;

    }

    public void enqueue(int data)
    {
        Node newnode = new Node(data);
        System.out.println("Adding elements to the queue");
        //queue empty
        if(this.rear == null)
        {
            this.front = this.rear = newnode;
            return;
        }
        //There are one or more nodes in the queue
        this.rear.next = newnode;
        this.rear = newnode;
    }
    public int dequeue()
    {
        if(this.rear == null)
        {
            System.out.println("Queue is empty");
            return -1;
        }
        int data = this.front.data;
        this.front = this.front.next;
        if(this.front == null)
        {
            this.rear = null;
        }
        return data;

    }
    public int peek()
    {
        if(this.front == null)
        {
            System.out.println("queue is null");
            return -1;
        }
        else
        {
           return this.front.data;
        }
    }
    public boolean isempty()
    {
        if(this.front == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void printallelements()
    {
        if (this.front == null)
        {
            System.out.println("Queue is empty");
            return;
        }
        Node currNode = this.front;
        while(currNode != null)
        {
            System.out.println(currNode.data);
            currNode = currNode.next;

        }


    }
    
    public void testQueueOperations()
    {
        this.dequeue();
        this.peek();

        this.enqueue(90);
        this.enqueue(87);
        this.enqueue(54);
        this.peek();
        this.printallelements();

        System.out.println("this element is removed from the queue"+ this.dequeue());
        System.out.println("this element is removed from the queue"+ this.dequeue());

        this.printallelements();


    }
    
}
