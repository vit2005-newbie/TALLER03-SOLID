// 3. Login para administradores
public class LogInAdmin implements ILogin {
    private MySQL mySQL;

    public LogInAdmin(MySQL mySQL) {
        this.mySQL = mySQL;
    }

    @Override
    public void log(User user) {
        // Verificación
        if (!verifyIfTheUserIsAdmin(user)) {
            System.out.println("Access denied: user is not admin");
            return;
        }

        // Autenticación
        System.out.println("Has access to the website in admin mode");

        // Inserción 
        insertUserInDatabase(user);
    }

    private boolean verifyIfTheUserIsAdmin(User user){
        // Verifica usuario
        return true;
    }

    private void insertUserInDatabase(User user){

    }
}
