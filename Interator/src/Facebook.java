
import java.util.ArrayList;
import java.util.List;

public class Facebook implements SocialNetwork{
    private List<Profile> profiles;

    public Facebook(List<Profile> cache) {
        if(cache != null){
            this.profiles = cache;
        }else{
            profiles = new ArrayList<>();
        }
    }

    public Profile requestProfileFromFacebook(String email){

        System.out.println("Facebook: Loading profile " + email);

        return findProfile(email);

    }

    public List<String> requestProfileFriendsFromFacebook(String email, String type){
        System.out.println("Facebook: Loading '"+ type +"' list of " + email);

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
        return new FacebookIterator(this, "friends", profileEmail);
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileEmail) {
        return new FacebookIterator(this, "coworkers", profileEmail);
    }
}
