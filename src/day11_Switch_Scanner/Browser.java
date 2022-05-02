package day11_Switch_Scanner;

public class Browser {
    public static void main(String[] args) {
        /*1. Create a class called Browser. Write a program that can display the name of
        selected browser
	        1. declear a String variable named browserName
	        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge
	        3. if the browser name does not match with the valid browsers' names,
	        out put should be: Invalid Browser Name
	        Ex:
	        	String browser = "chrome";
	    	Output:
	    		Chrome Browser is selected
			Note: MUST use nested if      */


        String browserName = "safari";
        String result = "";
        boolean validBrowser = browserName == "chrome" || browserName == "firefix" || browserName == "opera" || browserName == "safari" || browserName == "edge";

        if (validBrowser) {// 5 conditions
            if (browserName == "chrome") {
                System.out.println("Browser Chrome is selected");
            } else if (browserName == "firefox") {
                System.out.println("Browser Firexif is selected");
            } else if (browserName == "opera") {
                System.out.println("Opera Browser is selected");
            } else if (browserName == "safari") {
                System.out.println("Safari Browser is selected");
            } else {
                System.out.println(" Egde Browser is selected");
            }

        } else {
            System.out.println("Invalid Browser Name");
        }
    }
}
