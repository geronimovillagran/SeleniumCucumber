package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.GooglePage;

public class GoogleSteps {
    
    GooglePage google = new GooglePage();

    @Given("^im on the google search page$")
    public void navigateGoogle(){
        google.navigateToGoole();
    }

    @When("^I enter a search criteriaI enter a search criteria$")
    public void enterSearchCriteria(){

    }

    @And("^Click on the search button$")
    public void clickSearchButton(){

    }

    @Then("^The result march the criteria$")
    public void validateResult(){

    }
    
}
