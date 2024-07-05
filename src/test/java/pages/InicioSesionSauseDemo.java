package pages;

public class InicioSesionSauseDemo extends BasePage{
    
    private String lblUsuario = "//input[@id='user-name']";
    private String lblContrasena = "//input[@id='password']";
    private String btnLogin = "//input[@id='login-button']";


    public InicioSesionSauseDemo(){
        super(driver);
    }

    //Metodo para navegar a SauceDemo
    public void navigateToSauceDemo(){
        navigateTo("https://www.saucedemo.com/");
    }

    public void ingresoUsuario(String usuario){
        write(lblUsuario, usuario);
    }

    public void ingresoContrasena(String contrasena){
        write(lblContrasena, contrasena);
    }

    public void clickLogin(){
        clickElement(btnLogin);
    }
}
