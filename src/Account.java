public class Account {

    private int id;
    private String name;
    private double balance;

    public Account(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Account(int id, String name) {
        this(id,name,0.0);
    }

    public Account(){
       // this(0,"unknown",0.0);
        this(9,"asc");
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
}
