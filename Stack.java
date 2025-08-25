public class Stack {
   
    Node top;
    int count;
    public Stack()
    {
        this.top = null;
        this.count = 0;


    }
    public void push(int data)
    {
        Node newnode = new Node(data);
        this.count++;
        //stack is empty
        if(this.top == null)
        {
            this.top = newnode;
            return;
        }
        //Stack has some node
        newnode.next = this.top;
        this.top = newnode;
        
    }

    public int pop()
    {
        // stack is empty
        if (this.top == null)
        {
            System.err.println("Stack is empty");
            return -1;
        }
        int value = this.top.data;
        this.top = this.top.next;
        this.count--;
        return value;
    }
    public int getcount()
    {
        return this.count;
    }

    public int peek()
    {
        if (this.top == null)
        {
            return -1;
        }
        else
        {
            return this.top.data;
        }

    }

    public void printStack()
    {
        if(this.top == null)
        {
            System.out.println("Stack is empty");
        }
        Node cureentnode = this.top;
        while(cureentnode != null)
        {
            System.out.println(" " + cureentnode.data + ".....>");
            cureentnode = cureentnode.next;
        }

    }

    public void teastAllmethods()
    {
        this.pop();
        this.printStack();
        System.out.println("number of elements in stack " + this.getcount());
        this.push(90);
        this.push(78);
        this.push(84);
        this.peek();
        this.printStack();
        this.pop();
        

    }

    
}
