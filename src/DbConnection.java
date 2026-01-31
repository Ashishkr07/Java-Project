public class DbConnection {

    static DbConnection dbConnection = new DbConnection();
    private DbConnection(){

    }

    static DbConnection getInstance(){
        return dbConnection;
    }

}
