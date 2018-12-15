package heroku;

import org.openqa.selenium.By;

public class HomePageHeroku extends BasePageHeroku {

    private By searchBar = By.id("aa-search-input");

    private By listBox = By.id("algolia-autocomplete-listbox-0");

    private By textFieldError = By.xpath("//*[@id='aa-input-container']/span/pre");

 //   private By sectionContent = By.xpath("/html/body/div[2]/div");

    private By sectionContent = By.className("col-md-3");

    private By sectionContentH3 = By.tagName("h3");

    private By sectionContentH4 = By.tagName("h4");

    private By sectionContentImg = By.tagName("img");

    private By joinButton = By.xpath("//*[@id='bs-example-navbar-collapse-1']/ul/li[2]/p/a");

    public void clickOnJoinButton() {
        clickOn(joinButton);
    }

//    private By listBox = By.xpath("//*[@id='algolia-autocomplete-listbox-0']");

    public By getSearchBar() {
        return searchBar;
    }

    public By getListBox() {
        return listBox;
    }

    public By getTextFieldError() {
        return textFieldError;
    }

    public By getSectionContent() {
        return sectionContent;
    }

    public By getSectionContentH3() {
        return sectionContentH3;
    }

    public By getSectionContentH4() {
        return sectionContentH4;
    }

    public By getSectionContentImg() {
        return sectionContentImg;
    }
}
