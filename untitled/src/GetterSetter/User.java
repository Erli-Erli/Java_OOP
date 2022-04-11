package GetterSetter;

public class User {
    public static void main(String[] args) {

        Profile profile = new Profile();
        profile.setUserName("Admin");
        profile.setPassword(1234);

        System.out.println(profile.getUserName());
        System.out.println(profile.getPassword());

    }
}
