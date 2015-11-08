package io.github.alexandrosd.serenity_cucumber_seed.cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import io.github.alexandrosd.serenity_cucumber_seed.cucumber.steps.serenity.ActorSteps;

public class SampleFeatureStepDefinitions {
    @Steps
    ActorSteps actor;

    @Given("I am on google")
    public void onGoogle() {
        actor.visitGoogle();
    }

    @When("I search for '(.*)'")
    public void search(String keyword) {
        actor.search(keyword);
    }

    @Then("I should see '(.*)'")
    public void iShouldSee(String text) {
        actor.shouldSee(text);
    }

}
