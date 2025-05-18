package pkg_oop;

public class Admin extends Account{

// A private string specified only with the Admin

    private String AuthenticatePassword;

    public Admin(int _id, String _name, String _password){
        id = _id;
        name = _name;
        AuthenticatePassword = _password;
    }

}
