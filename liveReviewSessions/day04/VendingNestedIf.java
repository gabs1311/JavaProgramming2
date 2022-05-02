package day04;

public class VendingNestedIf {
    public static void main(String[] args) {
      /*
        selection = "drink" or can be "snack"
drinkItem = "tea" , "coke"
snackItem = "chips" , "candy"

when selection is "drink":
"drink option is selected"

    when drinkItem is "tea":
        "tea is selected"
    when drinkItem is "coke":
        "coke is selected"
when selection is "snack"
"snack option is selected"

    when snackItem is "chips":
        "chips item is selected"
    when snackItem is "candy":
        "candy item is selected"
       */

        String selection = "drink";        // drink or snack
        String drinkItem = "tea";       // coffee, tea
        String snackItem = "chips";        // chips, candy

        if (selection == "drink") {
            System.out.println("Drink options is selected");

            if (drinkItem == "tea") {
                System.out.println("Tea item selected");
            } else if (drinkItem == "coffee") {
                System.out.println("Coffee item selected");
            } else {

            }
        } else if (selection == "snack") {
            System.out.println("Snack options is selected");

            if (snackItem == " chips") {
                System.out.println("Chips item selected");
            } else if (snackItem == "candy") {
                System.out.println("Candy item selected");
            }
            System.out.println("Invalid Entry");


        }
    }
}