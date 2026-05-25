import java.util.Scanner;

public class Nokia {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("\n NOKIA 3310 ");
            System.out.println("1. Messages");
            System.out.println("2. Calls");
            System.out.println("3. Ringtones");
            System.out.println("4. Games");
            System.out.println("5. Settings");
            System.out.println("6. Exit");

            System.out.print("Enter option: ");
            int mainChoice = input.nextInt();

            switch (mainChoice) {

                case 1:

                    while (true) {

                        System.out.println("\n Messages ");
                        System.out.println("1. Write Message");
                        System.out.println("2. Inbox");
                        System.out.println("3. Sent Messages");
                        System.out.println("4. Drafts");
                        System.out.println("5. Delete Messages");
                        System.out.println("6. Back");

                        System.out.print("Enter option: ");
                        int messageChoice = input.nextInt();

                        switch (messageChoice) {

                            case 1:
                                System.out.println("Write Message selected");
                                break;

                            case 2:
                                System.out.println("Inbox selected");
                                break;

                            case 3:
                                System.out.println("Sent Messages selected");
                                break;

                            case 4:
                                System.out.println("Drafts selected");
                                break;

                            case 5:
                                System.out.println("Delete Messages selected");
                                break;

                            case 6:
                                break;

                            default:
                                System.out.println("Invalid option");
                                continue;
                        }

                        if (messageChoice == 6) {
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
                        System.out.println("4. Call Duration");
                        System.out.println("5. Delete Call Logs");
                        System.out.println("6. Back");

                        System.out.print("Enter option: ");
                        int callChoice = input.nextInt();

                        switch (callChoice) {

                            case 1:
                                System.out.println("Missed Calls selected");
                                break;

                            case 2:
                                System.out.println("Dialed Calls selected");
                                break;

                            case 3:
                                System.out.println("Received Calls selected");
                                break;

                            case 4:
                                System.out.println("Call Duration selected");
                                break;

                            case 5:
                                System.out.println("Delete Call Logs selected");
                                break;

                            case 6:
                                break;

                            default:
                                System.out.println("Invalid option");
                                continue;
                        }

                        if (callChoice == 6) {
                            break;
                        }
                    }

                    break;

                case 3:

                    while (true) {

                        System.out.println("\n Ringtones ");
                        System.out.println("1. Default Tone");
                        System.out.println("2. Silent");
                        System.out.println("3. Vibrate");
                        System.out.println("4. Volume Control");
                        System.out.println("5. Composer");
                        System.out.println("6. Back");

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
                                System.out.println("Volume Control selected");
                                break;

                            case 5:
                                System.out.println("Composer selected");
                                break;

                            case 6:
                                break;

                            default:
                                System.out.println("Invalid option");
                                continue;
                        }

                        if (ringtoneChoice == 6) {
                            break;
                        }
                    }

                    break;

                case 4:

                    while (true) {

                        System.out.println("\n Games ");
                        System.out.println("1. Snake");
                        System.out.println("2. Space Impact");
                        System.out.println("3. Bantumi");
                        System.out.println("4. Memory Game");
                        System.out.println("5. Back");

                        System.out.print("Enter option: ");
                        int gameChoice = input.nextInt();

                        switch (gameChoice) {

                            case 1:
                                System.out.println("Snake selected");
                                break;

                            case 2:
                                System.out.println("Space Impact selected");
                                break;

                            case 3:
                                System.out.println("Bantumi selected");
                                break;

                            case 4:
                                System.out.println("Memory Game selected");
                                break;

                            case 5:
                                break;

                            default:
                                System.out.println("Invalid option");
                                continue;
                        }

                        if (gameChoice == 5) {
                            break;
                        }
                    }

                    break;

                case 5:

                    while (true) {

                        System.out.println("\n Settings ");
                        System.out.println("1. Phone Settings");
                        System.out.println("2. Display Settings");
                        System.out.println("3. Security Settings");
                        System.out.println("4. Date and Time");
                        System.out.println("5. Restore Factory Settings");
                        System.out.println("6. Back");

                        System.out.print("Enter option: ");
                        int settingChoice = input.nextInt();

                        switch (settingChoice) {

                            case 1:
                                System.out.println("Phone Settings selected");
                                break;

                            case 2:
                                System.out.println("Display Settings selected");
                                break;

                            case 3:
                                System.out.println("Security Settings selected");
                                break;

                            case 4:
                                System.out.println("Date and Time selected");
                                break;

                            case 5:
                                System.out.println("Restore Factory Settings selected");
                                break;

                            case 6:
                                break;

                            default:
                                System.out.println("Invalid option");
                                continue;
                        }

                        if (settingChoice == 6) {
                            break;
                        }
                    }

                    break;

                case 6:
                    System.out.println("Exiting program...");
                    return;

                default:
                    System.out.println("Invalid option");
            }
        }
    }
}