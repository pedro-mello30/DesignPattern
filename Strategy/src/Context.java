public class Context {
    Strategy strategy;

    Context(){ }

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public void executeStrategy(double a, double b){
        System.out.println(strategy.execute(a, b));
    }
}
