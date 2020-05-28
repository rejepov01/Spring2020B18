package day44_Exceptions;

import javax.security.auth.login.AccountLockedException;

/*
warmup task:
	1. create a class called Browsers
			actions: openBrowser(): opens the default browser
					 closeBrowser(): closes the default browser
	2. create a class called ChromeBrowser
			actions: openBrowser(): opens the chrome browser
					 closeBrowser(): closes the chrome browser
	3. creata a class called FirefoxBrowser
			actions: openBrowser(): opens the Firefox browser
					 closeBrowser(): closes the Firefox browser
	4. create a class called Opera browser
			actions: openBrowser(): opens the Opera browser
					 closeBrowser(): closes the Opera browser
	5. create a class called Test:
			create an object of each browsers and call the openBrowser & closeBrowser actions
 */
public class Browsers {

    protected void openBrowser(){
        System.out.println("opening the default browse");
    }

    protected void closeBrowser(){
        System.out.println("closing the default browse");
    }
}
class  ChromeBrowser extends Browsers {
    /*
    openBrowser()
    closeBrowser()
     */
    @Override
    public void openBrowser(){
        System.out.println("Opening the chrome browser");
    }
    @Override
    public void closeBrowser(){
        System.out.println("Closing the chrome browser");
    }
}

class FirefoxBrowser extends Browsers{

    @Override
    public void openBrowser(){
        System.out.println("Opening the firefox browser");
    }

    @Override
    public void closeBrowser(){
        System.out.println("Closing the firefox browser");
    }
}

class Opera extends Browsers{
    @Override
    public void openBrowser(){
        System.out.println("Opening the opera browser");
    }

   @Override
    public void closeBrowser(){
        System.out.println("Closing the opera browser");
    }

}

class Test{

    public static void main(String[] args) {
        ChromeBrowser obj = new ChromeBrowser();
        obj.openBrowser();
        obj.closeBrowser();

        System.out.println("================================");

        FirefoxBrowser obj2 = new FirefoxBrowser();
        obj2.openBrowser();
        obj2.closeBrowser();


        System.out.println("===========================================");

        Opera obj3 = new Opera();
        obj3.openBrowser();
        obj3.closeBrowser();
    }
}