public class Main {

    public static void main(String[] args) {

        Singleton sing = Singleton.getInstance();

        System.out.println(System.identityHashCode(sing));

        Singleton singA = Singleton.getInstance();

        System.out.println(System.identityHashCode(singA));
    }
}
