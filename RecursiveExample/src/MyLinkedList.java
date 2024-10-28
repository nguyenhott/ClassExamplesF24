public class MyLinkedList<E> {

    Node<E> head;

    public void insert(E data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node last = head;
        while(last.next != null)
        {
            last = last.next;
        }
        last.next = newNode;
    }

}

class Node<E> {
    E data;
    Node next;

    public Node(E d){
        data = d;
        next = null;
    }
}
