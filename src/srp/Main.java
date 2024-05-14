package srp;


public class Main {

    public static void main(String[] args) {
        Repository repository = new MysqlRepository();
        PasswordHash passwordHash = new PasswordHash(repository);
        passwordHash.hashPassword("hello");
    }

}