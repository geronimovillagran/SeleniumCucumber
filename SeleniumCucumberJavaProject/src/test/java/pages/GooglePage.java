package pages;

public class GooglePage extends BasePage {
    
    public GooglePage(){
        super(driver);
    }

    public void navigateToGoole(){
        navigateTo("https://www.google.com");
    }
}
