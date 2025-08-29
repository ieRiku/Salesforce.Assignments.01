package tests;

import base.DriverSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.SearchPage;

public class SearchTest {

    WebDriver driver;
    SearchPage searchPage;
    WebDriverWait wait;
    Actions actions;

    @BeforeClass
    public void setup() {
        searchPage = new SearchPage(DriverSetup.getDriver());
    }

    @Test(priority = 1)
    public void testSearchProduct() {
        searchPage.searchProduct("laptop");
        Assert.assertTrue(searchPage.verifyResultsDisplayed(), "Search results not displayed!");
    }

    @Test(priority = 3)
    public void testSortLowToHigh() {
        searchPage.sortLowToHigh();
        Assert.assertTrue(searchPage.verifyResultsDisplayed(), "Results not visible after Low-High sort!");
    }
    
    @Test(priority = 2)
    public void testApplyFilters() throws InterruptedException {
        // Search for laptops first
        searchPage.searchProduct("laptop");

        // Apply brand filter
        searchPage.selectBrand("HP");
        Thread.sleep(3000);

        // Verify results displayed after applying filters
        Assert.assertTrue(searchPage.verifyResultsDisplayed(), "Filtered results not displayed!");
    }
    
    @Test(priority = 4)
    public void testBlankSearch() {
        searchPage.searchBlank();
        Assert.assertTrue(driver.getTitle().contains("Amazon"), "Blank search did not stay on Amazon search page!");
    }

    @Test(priority = 5)
    public void testViewProductDetails() {
       searchPage.searchProduct("laptop");
       searchPage.clickFirstProduct();

       String title = searchPage.getSelectedProductTitle();
       String price = searchPage.getSelectedProductPrice();

       System.out.println("Product Title: " + title);
       System.out.println("Product Price: " + price);

       Assert.assertFalse(title.isEmpty(), "Product title is not displayed!");
   }
}