package bedefaced.telegram.infowebapp;

public class ContactInfo {

    private long userId;
    private boolean isRegistered;
    private String phone;
    private String firstname;
    private String lastname;
    private String username;
    private String photofilename;

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public void setRegistered(boolean registered) {
        isRegistered = registered;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPhotofilename(String photofilename) {
        this.photofilename = photofilename;
    }

    public long getUserId() {
        return userId;
    }

    public boolean isRegistered() {
        return isRegistered;
    }

    public String getPhone() {
        return phone;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getUsername() {
        return username;
    }

    public String getPhotofilename() {
        return photofilename;
    }

}
