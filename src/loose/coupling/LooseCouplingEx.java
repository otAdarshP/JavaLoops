package loose.coupling;

public class LooseCouplingEx {
    public static void main (String [] args){
        UserDataProvider userDBProvider = new UserDBProvider ();
        UserManager userManagerWithDB = new UserManager (userDBProvider);
        System.out.println (userManagerWithDB.getUserInfo());

        UserDataProvider webServiceDataProvider = new WebServiceDataProvider();
        UserManager userManagerWithWS = new UserManager (webServiceDataProvider);
        System.out.println (userManagerWithWS.getUserInfo());

        UserDataProvider newDBProvider = new NewDBProvider();
        UserManager userManagerWithNewDB = new UserManager (newDBProvider);
        System.out.println (userManagerWithNewDB.getUserInfo());

    }

}
