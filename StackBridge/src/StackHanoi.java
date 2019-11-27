public class StackHanoi extends StackArray {
    private int totalRejected = 0;

    public int getTotalRejected(){
        return totalRejected;
    }

    public void push(int i){
        if(!isEmpty() && i > top()){
            totalRejected++;
        }else{
            super.push(i);
        }
    }
}
