import org.jetbrains.annotations.NotNull;

public abstract class User implements PrintData {
    private String login, password;
    private int id;

    public User (int id,String login,String password){
        this.id = id;
        this.login = login;
        this.password = password;
    }
    User (){
        this(33, "default user", "default login");
    }
    public String getUserInfo () {
        return "ID: " + this.id+ ", Login: "+ this.login + ", Password: " + this.password;
    }

    public void printUser() {

    }

    public String getLogin() {
        return login;
    }
    public void setLogin(@NotNull String login) throws UserException {
        if(login.length() < 3) throw new UserException(UserException.SHORT_LOGIN);
        if(login.length() > 6) throw new UserException(UserException.LONG_LOGIN);
        this.login = login;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
