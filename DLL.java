
public class DLL {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertEnd(100);
        dll.insertEnd(200);
        dll.insertEnd(300);
        dll.insertStart(50);
        dll.insertStart(25);
        dll.insertStart(10);
        dll.insertAtPosition(150, 4);
        dll.traversalForward();
        dll.traversalBackward();
        dll.removeLast();
        dll.traversalForward();
        dll.traversalBackward();
        dll.removeFirst();
        dll.removeAtPosition(3);
        dll.traversalForward();
        dll.traversalBackward();
    }
}
class Node1{
    int data;
    Node1 prev;
    Node1 next;
    Node1(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
class DoublyLinkedList{
    Node1 head = null;
    Node1 tail = null;
    void traversalForward(){
        if(this.head == null){
            System.out.println("List is Empty");
            return;
        }
        Node1 temp = head;
        while(temp != null){
            System.out.print(temp.data+" => ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    void traversalBackward()
    {
        if(this.tail == null){
            System.out.println("List is Empty");
            return;
        }
        Node1 temp = tail;
        while(temp != null){
            System.out.print(temp.data+" => ");
            temp = temp.prev;
        }
        System.out.println("null");
    }
    void insertEnd(int data){
        Node1 newNode = new Node1(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    void insertStart(int data)
    {
        Node1 newNode = new Node1(data);
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        head.prev=newNode;
        newNode.next=head;
        head=newNode;
    }
    void insertAtPosition(int data,int pos)
    {
        if(pos==1)
        {
            insertStart(data);
            return;
        }
        Node1 temp=head;
        for(int i=1;i<pos-1 && temp != null;i++)
        {
            temp=temp.next;
        }
        if(temp==null)
        {
            System.out.println("Invalid Position");
            return;
        }
        if(temp.next==null)
        {
            insertEnd(data);
            return;
        }
        Node1 newNode =new Node1(data);
        newNode.prev=temp;
        newNode.next=temp.next;
        temp.next.prev=newNode;
        temp.next=newNode;
    }
    void removeLast()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        if(head.next==null)
        {
            head=null;
            tail=null;
            return;
        }
        Node1 temp=head;
        while(temp.next!=tail)
        {
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
    }
    void removeFirst()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        if(head.next==null)
        {
            head=null;
            tail=null;
            return;
        }
        Node1 temp=head;
        head=head.next;
        head.prev=null;
    }
    void removeAtPosition(int pos)
    {
        if(pos==1)
        {
            removeFirst();

        }
        Node1 temp=head;
        for(int i=1;i<pos-1 && temp != null;i++)
        {
            temp=temp.next;
        }
        if(temp==null || temp.next==null)
        {
            System.out.println("Invalid Position");
            return;
        }
        if(temp.next==tail)
        {
            tail=temp;
        }
        temp.next=temp.next.next;
        temp.next.prev=temp;
    }
    
}
