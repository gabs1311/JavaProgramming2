package day04;

public class AmazonFreeShipping {
    public static void main(String[] args) {
/*
assign double value to totalPrice variable

if totalPrice is more than or equal to 25
print "FREE SHIPPING ELIGIBILE. Your order total: $55"
ELSE
print "NOT ELIGIBLE FOR FREE SHIPPING. Your order total is $10. less than minimum of $25"
 */
        double totalPrice = 55.50;
        if (totalPrice >= 25.0) {
            System.out.println("Free shipping eligible. Your total order :$   " + totalPrice);
            ;
        } else {
            System.out.println("Not eligible for free shipping : $ " + totalPrice);
        }
        System.out.println("thanks for shopping with us");


    }
}
