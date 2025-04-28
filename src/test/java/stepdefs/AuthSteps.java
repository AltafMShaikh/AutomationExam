package stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import pages.*;

import static org.junit.Assert.*;

public class AuthSteps {
    SignUpPage signUpPage = new SignUpPage();
    SignInPage signInPage = new SignInPage();
    SignOut signOut =new SignOut();

    @Given("User is on the Home page")
    public void userIsOnSignUpPage() {
        signUpPage.OpenHomePage();
    }
    @And("I click on Get Started")
    public
    @When("User enters a new valid email and password")
    public void enterValidSignUpCredentials() {
        signUpPage.signUp("test@gmail.com", "Test@123");
    }

//    @When("User enters an already registered email and password")
//    public void enterDuplicateSignUp() {
//        signUpPage.signUp("existinguser@mail.com", "Test@123");
//    }
//
//    @Then("User should be registered successfully")
//    public void verifySignUpSuccess() {
//        assertTrue(signUpPage.isRegistrationSuccessful());
//    }
//
//    @Then("An error message should be displayed for existing email")
//    public void verifySignUpFailure() {
//        assertTrue(signUpPage.isRegistrationErrorDisplayed());
//    }
//
//    @Given("User is on the Sign In page")
//    public void userIsOnSignInPage() {
//        signInPage.openSignInPage();
//    }
//
//    @When("User enters valid email and password")
//    public void validSignIn() {
//        signInPage.signIn("existinguser@mail.com", "Test@123");
//    }
//
//    @When("User enters valid email and incorrect password")
//    public void invalidPasswordSignIn() {
//        signInPage.signIn("existinguser@mail.com", "WrongPassword");
//    }
//
//    @Then("User should be logged in successfully")
//    public void verifySignInSuccess() {
//        assertTrue(homePage.isLoggedIn());
//    }
//
//    @Then("An error message should be displayed for incorrect credentials")
//    public void verifySignInError() {
//        assertTrue(signInPage.isLoginErrorDisplayed());
//    }
//
//    @Given("User is signed in")
//    public void ensureUserSignedIn() {
//        userIsOnSignInPage();
//        validSignIn();
//    }
//
//    @When("User clicks on Sign Out")
//    public void userClicksSignOut() {
//        signOut.signOut();
//    }
//
//    @Then("User should be redirected to the login page")
//    public void verifySignOut() {
//        assertTrue(homePage.isAtSignInPage());
//    }


}
