

public class Administrator implements Crud {

    private String userName;
    private String password;
    private boolean isLoggedIn;

    public Administrator(String userName, String password) {

        this.userName = userName;
        this.password = password;

    this.userName = userName;
    this.password = password;

    }

    public String getUserName() {
        return userName;
    }



    public String getPassword() {
        return password;
    }


    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }

    @Override
    public void addContact() {

    }

    @Override
    public void readAll() {

    }

    @Override
    public void readContact() {

    }

    @Override
    public void updateContact() {

    }

    @Override
    public void deleteContact() {

    }
}
