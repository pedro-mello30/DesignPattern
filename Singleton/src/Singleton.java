public class Singleton {
    private static Singleton instance = null;

    Singleton(){}

    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }

}
