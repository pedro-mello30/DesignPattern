import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Stack[] stacks = {new StackArray(), new StackList(), new StackFIFO(), new StackHanoi()};

        Random rand = new Random();

        for (int i = 1; i <= 15; i++){
            stacks[0].push(i);
            stacks[1].push(i);
            stacks[2].push(i);
            stacks[3].push(rand.nextInt(30));
        }

        System.out.println("\n---------------------------------------------");
        System.out.println(stacks[0].getClass().getSimpleName() + ":");
        while (!stacks[0].isEmpty()){
            System.out.print(stacks[0].pop() + "  ");
        }


        System.out.println("\n---------------------------------------------");
        System.out.println(stacks[1].getClass().getSimpleName() + ":");
        while (!stacks[1].isEmpty()){
            System.out.print(stacks[1].pop() + "  ");
        }

        System.out.println("\n---------------------------------------------");
        System.out.println(stacks[2].getClass().getSimpleName() + ":");
        while (!stacks[2].isEmpty()){
            System.out.print(stacks[2].pop() + "  ");
        }

        System.out.println("\n---------------------------------------------");
        System.out.println(stacks[3].getClass().getSimpleName() + ":");
        while (!stacks[3].isEmpty()){
            System.out.print(stacks[3].pop() + "  ");
        }
        StackHanoi stackHanoi = (StackHanoi) stacks[3];
        System.out.println("\nTotal Rejected: " + stackHanoi.getTotalRejected());
    }
}
