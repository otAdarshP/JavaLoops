package loose.coupling;

public class NewDBProvider implements UserDataProvider{
    @Override
    public String getUserDetails() {
        return "New Database in action.";
    }
}
