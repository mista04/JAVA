
public class Main {
    public static void main(String[] args) {
    // Create the instances
        IDandPassword idandPassword = new IDandPassword();
        LoginPage loginPage = new LoginPage(idandPassword.getLoginInfo());
        WelcomePage welcomePage = new WelcomePage();

    }
}