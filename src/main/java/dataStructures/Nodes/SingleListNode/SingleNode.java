package dataStructures.Nodes.SingleListNode;

public class SingleNode {

    private Object data;
    private SingleNode next;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public SingleNode getNext() {
        return next;
    }

    public void setNext(SingleNode next) {
        this.next = next;
    }


    public SingleNode()
    {
        data = null;
        next = null;

    }

    public SingleNode(Object input)
    {
        setData(input);
        setNext(null);
    }



}
