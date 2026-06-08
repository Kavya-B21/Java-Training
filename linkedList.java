public class linkedList {
    public static void main(String[] args) {
       SinglyLinkedList sll = new SinglyLinkedList();
        sll.insertEnd(10);
        sll.insertEnd(20);
        sll.insertEnd(30);
        sll.insertEnd(40);
        sll.insertEnd(50);
        sll.insertEnd(60);
        sll.insertEnd(20);
        sll.traversal();
        sll.find(30);
        sll.findocc(20);
        sll.length();
        sll.updateFirst(15);
        sll.updateLast(65);
        sll.updateAtPosition(3,35);
        sll.traversal();
    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class SinglyLinkedList{
    Node head = null;
    Node tail = null;
    void traversal(){
        if(this.head == null){
            System.out.println("List is Empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"");
            temp = temp.next;
        }
        System.out.println();
    }
    void insertEnd(int data){
        Node newNode = new Node(data);
        if(this.head == null){
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    void find(int value)
    {
        Node temp=head;
        while(temp!=null)
        {
            if (temp.data==value)
            {
                System.out.println("Found");
                return;
            }
            temp=temp.next;
        }
    }
    void findocc(int value)
    {
        int occ=0;
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==value)
            {
                occ++;
            }
            temp=temp.next;
        }
        System.out.println("occ:"+occ);
    }
    void length()
    {
        int count=0;
        Node temp=head;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        System.out.println("length:"+count);
    }
    void updateFirst(int value)
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        head.data=value;
    }
    void updateLast(int value)
    {
        if(tail==null)
        {
            System.out.println("List is empty");
            return;
        }
        tail.data=value;
    }
    void updateAtPosition(int pos,int value)
    {
        if(pos==1)
        {
            updateFirst(value);
            return;
        }
        Node temp = head;
        for(int i=1;i<pos-1 && temp != null;i++){
            temp = temp.next;
        }
        if(temp == null || temp.next == null){
            System.out.println("Invalid Position");
            return;
        }
        temp.next.data=value;
    }
}