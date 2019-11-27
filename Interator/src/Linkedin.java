import java.util.ArrayList;
import java.util.List;

public class Linkedin implements SocialNetwork{
    private List<Profile> profiles;

    public Linkedin(List<Profile> cache) {
        if(cache != null){
            this.profiles = cache;
        }else{
            profiles = new ArrayList<>();
        }
    }

    public Profile requestProfileFromLinkedin(String email){

        System.out.println("Linkedin: Loading profile " + email);

        return findProfile(email);

    }

    public List<String> requestProfileFriendsFromLinkedin(String email, String type){
        System.out.println("Linkedin: Loading '"+ type +"' list of " + email);

        Profile profile = findProfile(email);

        if(profile != null) {
            return profile.getContacts(type);
        }

        return null;
    }


    public Profile findProfile(String email){
        for (Profile prof : profiles){

            if(prof.getEmail().equals(email)){
                return prof;
            }
        }

        return null;
    }


    @Override
    public ProfileIterator createFriendsIterator(String profileEmail) {
        return new LinkedinIterator(this, "friends", profileEmail);
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileEmail) {
        return new LinkedinIterator(this, "coworkers", profileEmail);
    }
}
