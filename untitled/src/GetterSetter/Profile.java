package GetterSetter;

public class Profile {
    private String userName;
    private int Password;

    public void setPassword(int password) {
        Password = password;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public int getPassword() {
        return Password;
    }
    public String getUserName() {
        return userName;
    }
}
