package dataStructures.Nodes.doubleNode;

public class DoubleLinkedNode {

    private Object data;
    private DoubleLinkedNode next;
    private DoubleLinkedNode previous;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public DoubleLinkedNode getNext() {
        return next;
    }

    public void setNext(DoubleLinkedNode next) {
        this.next = next;
    }

    public DoubleLinkedNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoubleLinkedNode previous) {
        this.previous = previous;
    }


    public DoubleLinkedNode()
    {
        setNext(null);
        setPrevious(null);
        setData(null);
    }

    public DoubleLinkedNode(Object newData)
    {
        setData(newData);
        setNext(null);
        setPrevious(null);
    }


}
