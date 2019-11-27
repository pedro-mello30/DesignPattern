import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {


    public Application() {

        System.out.println("Please Select Social Network:");
        System.out.println("1. Facebook");
        System.out.println("2. Linkedin");

        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();

        SocialNetwork network;

        if(choice.equals("2") || choice.toLowerCase().equals("linkedin")){
            network = new Linkedin(createTestProfiles());

        }else{
            network = new Facebook(createTestProfiles());
        }



        SocialSpammer spammer = new SocialSpammer(network);

        spammer.sendSpamToFriend("anna.smith@bing.com", "Hello Friends!");
        spammer.sendSpamToCoworkers("sam@amazon.com", "Hello Coworkers!");
    }

    public static List<Profile> createTestProfiles() {
        List<Profile> data = new ArrayList<Profile>();
        data.add(new Profile("anna.smith@bing.com", "Anna Smith", "friends:mad_max@ya.com", "friends:catwoman@yahoo.com", "coworkers:sam@amazon.com"));
        data.add(new Profile("mad_max@ya.com", "Maximilian", "friends:anna.smith@bing.com", "coworkers:sam@amazon.com"));
        data.add(new Profile("bill@microsoft.eu", "Billie", "coworkers:avanger@ukr.net"));
        data.add(new Profile("avanger@ukr.net", "John Day", "coworkers:bill@microsoft.eu"));
        data.add(new Profile("sam@amazon.com", "Sam Kitting", "coworkers:anna.smith@bing.com", "coworkers:mad_max@ya.com", "friends:catwoman@yahoo.com"));
        data.add(new Profile("catwoman@yahoo.com", "Liza", "friends:anna.smith@bing.com", "friends:sam@amazon.com"));
        return data;
    }
}
