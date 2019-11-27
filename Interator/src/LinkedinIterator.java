import java.util.ArrayList;
import java.util.List;

public class LinkedinIterator implements ProfileIterator{

    private Linkedin linkedin;
    private String type;
    private String email;
    private int currentPos = 0;
    private List<String> emails = new ArrayList<>();
    private List<Profile> profiles = new ArrayList<>();

    public LinkedinIterator(Linkedin linkedin, String type, String email) {
        this.linkedin = linkedin;
        this.type = type;
        this.email = email;
    }

    public void lazyLoad(){
        if(emails.size() == 0){
            List<String> profs = linkedin.requestProfileFriendsFromLinkedin(email, type);
            for (String prof : profs){
                emails.add(prof);
                profiles.add(null);
            }
        }
    }


    @Override
    public Profile getNext() {
        if(!hasNext())
            return null;

        String friendEmail = emails.get(currentPos);
        Profile friendProfile = profiles.get(currentPos);

        if(friendProfile == null){
            friendProfile = linkedin.requestProfileFromLinkedin(friendEmail);
            profiles.set(currentPos, friendProfile);
        }

        currentPos++;
        return friendProfile;
    }

    @Override
    public boolean hasNext() {
        lazyLoad();
        return currentPos < emails.size();
    }
}

