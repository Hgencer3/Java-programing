package day34_void_methods;

public class dEtsySearchTest {
    public static void main(String[] args) {
        System.out.println("-----Starting Etsy Search Smoke Test-----");
        openBrowser();
        navigateToEtsyUrl();
        searchWoodenSpoon();
        verifyResultsAreDisplayed();

    }
    public static void openBrowser() {
        System.out.println("Launcing Choremo Browser");
    }

    public static void navigateToEtsyUrl() {
        System.out.println("Navigate to Https://www.etsy.com/ ");
    }

    public static void searchWoodenSpoon() {
        System.out.println("PASS: Verify Etsy home page is displayed");
        System.out.println("Type'Wooden Spoon' in search field and click search");
    }
    public static void verifyResultsAreDisplayed() {
        System.out.println("PASS: Search results are successfully display");
    }

}
