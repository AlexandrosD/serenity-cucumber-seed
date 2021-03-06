package io.github.alexandrosd.serenity_cucumber_seed.cucumber.steps.serenity;

import io.github.alexandrosd.serenity_cucumber_seed.cucumber.pages.GoogleHomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ActorSteps extends ScenarioSteps {

    GoogleHomePage google;

    @Step
    public void visitGoogle() {
        google.open();
    }

    @Step
    public void search(String keyword) {
        google.searchFor(keyword);
    }

    @Step
    public void shouldSee(String text) {
        google.shouldContainText(text);
    }
}