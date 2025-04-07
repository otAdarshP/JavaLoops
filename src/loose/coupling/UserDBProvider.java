package loose.coupling;

public class UserDBProvider implements UserDataProvider{

    @Override
    public String getUserDetails() {
        return "Details from Database.";
    }
}
