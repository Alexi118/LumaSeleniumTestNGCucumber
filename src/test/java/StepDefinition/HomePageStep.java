package StepDefinition;

import io.cucumber.java.en.Given;

public class HomePageStep{
    @Given("User navigates to the Login page")
    public void user_navigates_to_the_Login_page(){
        homePage.click_hamburger_menu_Btn();
        homePage.click_signIn_Btn();
    }
}
