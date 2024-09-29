//lazy initialization
public class Connection {
    private static Connection connection = null;

    private Connection(){

    }

    public static Connection getConnection(){
        if (connection == null) {
            return connection = new Connection();
        }
        return connection;
    }
}

//eager initialization
class NewConnection{
    private static NewConnection connection= new NewConnection();

    private NewConnection(){

    }

    public static NewConnection getConnection(){
        if (connection==null) {
            return connection = new NewConnection();
        }

        return connection;
    }
}


