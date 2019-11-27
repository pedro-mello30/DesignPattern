public class SocialSpammer {
    public SocialNetwork network;
    public ProfileIterator iterator;

    public SocialSpammer(SocialNetwork network) {
        this.network = network;
    }

    public void sendSpamToFriend(String profileEmail, String message){
        System.out.println("\nInterating over Friends...\n");
        iterator = network.createFriendsIterator(profileEmail);

        while (iterator.hasNext()){
            Profile profile = iterator.getNext();
            sendMessage(profile.getEmail(), message);
        }
    }

    public void sendSpamToCoworkers(String profileEmail, String message){
        System.out.println("\nInterating over Coworkers...\n");
        iterator = network.createCoworkersIterator(profileEmail);

        while (iterator.hasNext()){
            Profile profile = iterator.getNext();
            sendMessage(profile.getEmail(), message);
        }
    }

    public void sendMessage(String email, String message){
        System.out.println("Sent Message To: " + email + "\nMessage: " + message + "\n\n");
    }
}
