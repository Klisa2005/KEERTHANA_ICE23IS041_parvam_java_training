 class Account{
    private String name ;
    private float balance ;
    private int number ;

    public Account(float balance, String name, int number) {
        this.balance = balance;
        this.name = name;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    // Masking function for balance
    private String maskBalance() {
        return "***.**";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Account{");
        sb.append("name=").append(name);
        sb.append(", balance=").append(maskBalance());
        sb.append(", number=").append(number);
        sb.append('}');
        return sb.toString();
    }
    
}

public class PojoDemo{
    public static void main(String[] args) {
        Account ob=new Account(2.4f,"Keerthana",3);
        System.err.println(ob);
    }
}