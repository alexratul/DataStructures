package dataStructures.Nodes.listNodes;

public class node {

    private Object data;
    private node next;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public node getNext() {
        return next;
    }

    public void setNext(node next) {
        this.next = next;
    }


    public node()
    {
        data = null;
        next = null;

    }

    public node(Object input)
    {
        setData(input);
        setNext(null);
    }



}
