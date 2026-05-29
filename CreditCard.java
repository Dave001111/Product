import java.util.Scanner;

public class CreditCard {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Hello, Kindly Enter card number: ");
        String cardNumber = input.nextLine();

        
        if (cardNumber.length() == 13 || cardNumber.length() == 16) {

            int sum = 0;
            int count = 0; 

            
            for (int i = cardNumber.length() - 1; i >= 0; i--) {

                int digit = cardNumber.charAt(i) - '0';

                
                if (count % 2 == 1) {
                    digit = digit * 2;

                    if (digit > 9) {
                        digit = digit - 9;
                    }
                }

                sum = sum + digit;

                count = count + 1; 
            }

            
            String cardType = "Unknown";

            if (cardNumber.startsWith("4")) {
                cardType = "Visa";
            }
            else if (cardNumber.startsWith("5")) {
                cardType = "MasterCard";
            }
            else if (cardNumber.startsWith("37")) {
                cardType = "American Express";
            }
            else if (cardNumber.startsWith("6")) {
                cardType = "Discover";
            }

            
            String status;

            if (sum % 10 == 0) {
                status = "Valid";
            } else {
                status = "Invalid";
            }

            
            System.out.println(" CARD DETAILS ");
            System.out.println("Type: " + cardType);
            System.out.println("Number: " + cardNumber);
            System.out.println("Length: " + cardNumber.length());
            System.out.println("Status: " + status);
            

        } else {
            System.out.println("Card must be 13 or 16 digits");
        }

        
