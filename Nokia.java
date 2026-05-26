import java.util.ArrayList;
import java.util.Scanner;

public class Nokia {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        ArrayList<String> inbox = new ArrayList<>();
        ArrayList<String> sentMessages = new ArrayList<>();

        
        ArrayList<String> missedCalls = new ArrayList<>();
        ArrayList<String> dialedCalls = new ArrayList<>();
        ArrayList<String> receivedCalls = new ArrayList<>();

        
        missedCalls.add("David");
        missedCalls.add("Dayo");

        dialedCalls.add("Wale");
        dialedCalls.add("Afolabi");

        receivedCalls.add("Abbey");
        receivedCalls.add("Maleek");

        while (true) {

            System.out.println("\n NOKIA 3310 ");
            System.out.println("1. Messages");
            System.out.println("2. Calls");
            System.out.println("3. Settings");
            System.out.println("4. Ringtones");
            System.out.println("5. Games");
            System.out.println("6. Exit");

            System.out.print("Enter option: ");
            int mainChoice = input.nextInt();
            input.nextLine();

            switch (mainChoice) {

                
                case 1:

                    while (true) {

                        System.out.println("\n Messages ");
                        System.out.println("1. Write Message");
                        System.out.println("2. Inbox");
                        System.out.println("3. Sent Messages");
                        System.out.println("4. Back");

                        System.out.print("Enter option: ");
                        int messageChoice = input.nextInt();
                        input.nextLine();

                        switch (messageChoice) {

                            case 1:

                                System.out.print("Write your message: ");
                                String message = input.nextLine();

                                sentMessages.add(message);
                                inbox.add(message);

                                System.out.println("Message sent successfully");
                                break;

                            case 2:

                                System.out.println("\n Inbox ");

                                if (inbox.size() == 0) {
                                    System.out.println("No messages");
                                }

                                for (int i = 0; i < inbox.size(); i++) {
                                    System.out.println((i + 1) + ". " + inbox.get(i));
                                }

                                break;

                            case 3:

                                System.out.println("\n Sent Messages ");

                                if (sentMessages.size() == 0) {
                                    System.out.println("No sent messages");
                                }

                                for (int i = 0; i < sentMessages.size(); i++) {
                                    System.out.println((i + 1) + ". " + sentMessages.get(i));
                                }

                                break;

                            case 4:
                                break;

                            default:
                                System.out.println("Invalid option");
                        }

                        if (messageChoice == 4) {
                            break;
                        }
                    }

                    break;

                
                case 2:

                    while (true) {

                        System.out.println("\n Calls ");
                        System.out.println("1. Missed Calls");
                        System.out.println("2. Dialed Calls");
                        System.out.println("3. Received Calls");
                        System.out.println("4. Back");

                        System.out.print("Enter option: ");
                        int callChoice = input.nextInt();

                        switch (callChoice) {

                            case 1:

                                System.out.println("\n Missed Calls ");

                                for (int i = 0; i < missedCalls.size(); i++) {
                                    System.out.println((i + 1) + ". " + missedCalls.get(i));
                                }

                                break;

                            case 2:

                                System.out.println("\n Dialed Calls ");

                                for (int i = 0; i < dialedCalls.size(); i++) {
                                    System.out.println((i + 1) + ". " + dialedCalls.get(i));
                                }

                                break;

                            case 3:

                                System.out.println("\n Received Calls ");

                                for (int i = 0; i < receivedCalls.size(); i++) {
                                    System.out.println((i + 1) + ". " + receivedCalls.get(i));
                                }

                                break;

                            case 4:
                                break;

                            default:
                                System.out.println("Invalid option");
                        }

                        if (callChoice == 4) {
                            break;
                        }
                    }

                    break;

                
                case 3:

                    while (true) {

                        System.out.println("\n Settings ");
                        System.out.println("1. Phone Settings");
                        System.out.println("2. Display Settings");
                        System.out.println("3. Security Settings");
                        System.out.println("4. Back");

                        System.out.print("Enter option: ");
                        int settingChoice = input.nextInt();

                        switch (settingChoice) {

                            
                            case 1:

                                while (true) {

                                    System.out.println("\n Phone Settings ");
                                    System.out.println("1. Language");
                                    System.out.println("2. Phone Name");
                                    System.out.println("3. Back");

                                    System.out.print("Enter option: ");
                                    int phoneChoice = input.nextInt();

                                    if (phoneChoice == 1) {
                                        System.out.println("Language selected");
                                    }

                                    else if (phoneChoice == 2) {
                                        System.out.println("Phone Name selected");
                                    }

                                    else if (phoneChoice == 3) {
                                        break;
                                    }

                                    else {
                                        System.out.println("Invalid option");
                                    }
                                }

                                break;

                            
                            case 2:

                                while (true) {

                                    System.out.println("\n Display Settings ");
                                    System.out.println("1. Brightness");
                                    System.out.println("2. Wallpaper");
                                    System.out.println("3. Back");

                                    System.out.print("Enter option: ");
                                    int displayChoice = input.nextInt();

                                    if (displayChoice == 1) {
                                        System.out.println("Brightness selected");
                                    }

                                    else if (displayChoice == 2) {
                                        System.out.println("Wallpaper selected");
                                    }

                                    else if (displayChoice == 3) {
                                        break;
                                    }

                                    else {
                                        System.out.println("Invalid option");
                                    }
                                }

                                break;

                            
                            case 3:

                                while (true) {

                                    System.out.println("\n Security Settings ");
                                    System.out.println("1. Change PIN");
                                    System.out.println("2. Phone Lock");
                                    System.out.println("3. Back");

                                    System.out.print("Enter option: ");
                                    int securityChoice = input.nextInt();

                                    if (securityChoice == 1) {
                                        System.out.println("Change PIN selected");
                                    }

                                    else if (securityChoice == 2) {
                                        System.out.println("Phone Lock selected");
                                    }

                                    else if (securityChoice == 3) {
                                        break;
                                    }

                                    else {
                                        System.out.println("Invalid option");
                                    }
                                }

                                break;

                            case 4:
                                break;

                            default:
                                System.out.println("Invalid option");
                        }

                        if (settingChoice == 4) {
                            break;
                        }
                    }

                    break;

                
                case 4:

                    while (true) {

                        System.out.println("\n Ringtones ");
                        System.out.println("1. Default Tone");
                        System.out.println("2. Silent");
                        System.out.println("3. Vibrate");
                        System.out.println("4. Volume");
                        System.out.println("5. Back");

                        System.out.print("Enter option: ");
                        int ringtoneChoice = input.nextInt();

                        switch (ringtoneChoice) {

                            case 1:
                                System.out.println("Default Tone selected");
                                break;

                            case 2:
                                System.out.println("Silent selected");
                                break;

                            case 3:
                                System.out.println("Vibrate selected");
                                break;

                            case 4:
                                System.out.println("Volume selected");
                                break;

                            case 5:
                                break;

                            default:
                                System.out.println("Invalid option");
                        }

                        if (ringtoneChoice == 5) {
                            break;
                        }
                    }

                    break;

                
                case 5:

                    while (true) {

                        System.out.println("\n Games ");
                        System.out.println("1. Football");
                        System.out.println("2. COD");
                        System.out.println("3. Sm Manager");
                        System.out.println("4. Temple Run");
                        System.out.println("5. Back");

                        System.out.print("Enter option: ");
                        int gameChoice = input.nextInt();

                        switch (gameChoice) {

                            case 1:
                                System.out.println("Football selected");
                                break;

                            case 2:
                                System.out.println("COD selected");
                                break;

                            case 3:
                                System.out.println("Sm Manager selected");
                                break;

                            case 4:
                                System.out.println("Temple Run selected");
                                break;

                            case 5:
                                break;

                            default:
                                System.out.println("Invalid option");
                        }

                        if (gameChoice == 5) {
                            break;
                        }
                    }

                    break;

                
                case 6:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid option");
            }

            if (mainChoice == 6) {
                break;
            }
        }
    } 
}