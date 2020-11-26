package com.api.project.steps;


import com.api.project.model.CustomerPojo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.ArrayList;
import java.util.List;

public class CustomerSteps {
    CustomerPojo customer = new CustomerPojo();
    private RequestSpecification request;
    private Response response;

    @Given("^I have the data to create customer with \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void i_have_the_data_to_create_customer_with(String firstName, String lastName, String phone, String address1, String address2) throws Throwable {



        ArrayList<String> addresses = new ArrayList<String>();
        addresses.add(address1);
        addresses.add(address2);

        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setPhone(phone);
        customer.setAddresses(addresses);
    }



    @Given("^I use customer header$")
    public void i_use_customer_header() throws Throwable {

    }

    @When("^I create post request to create customer$")
    public void i_create_post_request_to_create_customer() throws Throwable {

    }
    @When("^I create delete request to create customer$")
    public void i_create_delete_request_to_create_customer() throws Throwable {

    }

    @Then("^I get status code (\\d+) from database$")
    public void i_get_status_code_from_database(int statusCode) throws Throwable {

    }

    @Then("^response body should contain$")
    public void response_body_should_contain(List<String> responseMap) {

    }
}