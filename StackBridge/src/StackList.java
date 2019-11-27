public class StackList implements Stack {
    private Node last = null;


    @Override
    public void push(int i) {
        if(last == null){
            last = new Node(i);
        }else{
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    @Override
    public int top() {
        if(isEmpty())
            return -1;

        return last.val;
    }

    @Override
    public int pop() {
        if(isEmpty())
            return -1;

        int aux = last.val;
        last = last.prev;
        return aux;
    }

    @Override
    public boolean isEmpty() {
        return last == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }
}
