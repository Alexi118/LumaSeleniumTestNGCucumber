package StepDefinition;

import io.cucumber.java.en.Then;
import static pages.ProductCategoryPage.*;

public class ProductCategoryPageStep {
    @Then("User should be able to view the product category page")
    public void verify_user_is_able_to_view_product_category_page(){
        verify_formalShoes_Txt_IsVisible();
    }
}
