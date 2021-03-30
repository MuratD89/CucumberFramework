package com.saucelabs.stepdefinitions;

import com.saucelabs.utils.HelperMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationFinding {

    WebDriver driver;
    By inputArea = By.xpath("//input[@type='text']");
    By currentLocationBtn = By.className("currentLocationButton");
    By searchBtn = By.className("searchButton");
    By highTemp = By.xpath("//span[@class='high-temp-text']");
    By lowTemp = By.xpath("//span[@class='low-temp-text']");


    @Given("navigate to Website")
    public void navigate_to_website() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://darksky.net/");
    }

    @And("click on input area")
    public void click_on_input_area() {
        driver.findElement(inputArea).click();
    }

    @And("type your location")
    public void type_your_location() {
        //driver.findElement(inputArea).sendKeys("Friedrichshafen");

    }

    @When("click on search button")
    public void click_on_search_button() throws InterruptedException {
    Thread.sleep(2000);
        driver.findElement(currentLocationBtn).click();
        driver.findElement(searchBtn).click();
    }

    @Then("verify the lowest and highest temperature")
    public void verify_the_lowest_and_highest_temperature() {
       //driver.findElement(highTemp).isDisplayed();
       //driver.findElement(lowTemp).isDisplayed();

    }


}
