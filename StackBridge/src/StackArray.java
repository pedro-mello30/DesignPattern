public class StackArray extends Stack {

    private int[] items;
    private int size = -1;

    public StackArray(){
        this.items = new int[12];
    }

    public StackArray(int length){
        this.items = new int[length-1];
    }

    @Override
    public void push(int i) {
        if(!isFull())
            items[++size] = i;
    }

    @Override
    public int top() {
        if(isEmpty())
            return -1;

        return items[size];
    }

    @Override
    public int pop() {
        if(isEmpty())
            return -1;

        return items[size--];
    }

    @Override
    public boolean isEmpty() {
        return size == -1;
    }

    @Override
    public boolean isFull() {
        return size == items.length-1;
    }
}
