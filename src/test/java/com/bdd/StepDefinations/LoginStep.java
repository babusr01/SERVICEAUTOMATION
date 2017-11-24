package com.bdd.StepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStep {




    @Given("^I navigate to the login Page$")
    public void iNavigateToTheLoginPage() {

        try{
            System.out.println("I am navigating the Login page...");
        }catch(Exception ex){
            System.out.print(ex.getMessage());
        }
        finally {

        }
    }

    @And("^I click the login Button$")
    public void iClickTheLoginButton() {
        try{
            System.out.println("I am clicking the Login Button");
        }catch(Exception ex){
            System.out.print(ex.getMessage());
        }
        finally {

        }
    }

    @Then("^I should see the landing page$")
    public void iShouldSeeTheLandingPage() {
        try {
            System.out.println("I am in thew Landing Page");
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        } finally {

        }
    }


    @And("^I enter the UserName as UserName and password as Password$")
    public void iEnterTheUserNameAsUserNameAndPasswordAsPassword()  {
        try {
            System.out.println("I am in thew Landing Page");
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        } finally {

        }
    }

    @And("^I enter <UserName> and <password> for Scenario Outlined$")
    public void iEnterUserNameAndPasswordForScenarioOutlined() {
        try {
            System.out.println("I am in Login Method with input Data");
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        } finally {

        }
    }

    @And("^I enter \"([^\"]*)\" and \"([^\"]*)\" for Scenario Outlined$")
    public void iEnterAndForScenarioOutlined(String arg0, String arg1) {
        try {
            System.out.println("UserName is :" + arg0 + "and the password is :" + arg1);
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        } finally {

        }
    }
}
