public class App {
    public static void main(String[] args) throws Exception {
        Connection connection1 = Connection.getConnection();
        Connection connection2 = Connection.getConnection();

        if (connection1==connection2) {
            System.out.println("Same");
        } else{
            System.out.println("Different");
        }

        NewConnection connection3 = NewConnection.getConnection();
        NewConnection connection4 = NewConnection.getConnection();

        if (connection3==connection4) {
            System.out.println("Same");
        } else{
            System.out.println("Different");
        }


    }
}
