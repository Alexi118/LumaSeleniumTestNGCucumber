package StepDefinition;

import io.cucumber.java.en.When;
import static pages.SignInPage.*;

public class SignInPageStep {
    @When("User successfully enters the log in details")
    public void user_login_to_login_page(){
        sendKey_user_Txt();
        sendKey_password_Txt();
        click_login_Btn();
    }
}
