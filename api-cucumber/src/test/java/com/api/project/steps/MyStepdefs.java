package com.api.project.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Benjamin Adjei on 24/11/20
 */
public class MyStepdefs {
        @Given("^today is \"([^\"]*)\"$")
        public void today_is(String answer) throws Throwable {
            System.out.println(answer);
        }

        @When("^I ask whether it's Friday yet$")
        public void i_ask_whether_it_s_Friday_yet() throws Throwable {
            System.out.println("I am asking");
        }

        @Then("^I should be told \"([^\"]*)\"$")
        public void i_should_be_told(String arg1) throws Throwable {
            System.out.println(arg1);
        }


    }
