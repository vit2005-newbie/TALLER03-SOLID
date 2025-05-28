public class AppWeb {
    private final Autenticador aut;
    private final BD bd;

    public AppWeb(Autenticador aut, BD bd) {
        this.aut = aut;
        this.bd = bd;
    }
}