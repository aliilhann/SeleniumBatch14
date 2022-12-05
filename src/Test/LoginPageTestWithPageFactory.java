package Test;

import Pages.LoginPageWithPageFactory;
import Utils.CommonMethods;

public class LoginPageTestWithPageFactory {
    public static void main(String[] args) {

        CommonMethods.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        LoginPageWithPageFactory login=new LoginPageWithPageFactory();
        login.userNameField.sendKeys("Admin");
        login.passwordField.sendKeys("Hum@nhrm123");
        login.loginBtn.click();

    }
}
