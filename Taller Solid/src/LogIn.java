// Login estandar
public class LogIn implements ILogin {
    private MySQL mySQL;

    public LogIn(MySQL mySQL) {
        this.mySQL = mySQL;
    }

    @Override
    public void log(User user) {
        // Autenticación
        System.out.println("Has access to the website");

        // Inserción separada, pero contenida dentro
        insertUserInDatabase(user);
    }

    private void insertUserInDatabase(User user){
        // Insertar nuevo user

    }
}
