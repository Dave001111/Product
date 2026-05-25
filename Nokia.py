while True:

    print("\n NOKIA 3310 ")
    print("1. Messages")
    print("2. Calls")
    print("3. Ringtones")
    print("4. Games")
    print("5. Settings")
    print("6. Exit")

    mainChoice = int(input("Enter option: "))

    match mainChoice:

        case 1:

            while True:

                print("\n Messages ")
                print("1. Write Message")
                print("2. Inbox")
                print("3. Sent Messages")
                print("4. Drafts")
                print("5. Delete Messages")
                print("6. Back")

                messageChoice = int(input("Enter option: "))

                match messageChoice:

                    case 1:
                        print("Write Message selected")

                    case 2:
                        print("Inbox selected")

                    case 3:
                        print("Sent Messages selected")

                    case 4:
                        print("Drafts selected")

                    case 5:
                        print("Delete Messages selected")

                    case 6:
                        break

                    case _:
                        print("Invalid option")

        case 2:

            while True:

                print("\n Calls ")
                print("1. Missed Calls")
                print("2. Dialed Calls")
                print("3. Received Calls")
                print("4. Call Duration")
                print("5. Delete Call Logs")
                print("6. Back")

                callChoice = int(input("Enter option: "))

                match callChoice:

                    case 1:
                        print("Missed Calls selected")

                    case 2:
                        print("Dialed Calls selected")

                    case 3:
                        print("Received Calls selected")

                    case 4:
                        print("Call Duration selected")

                    case 5:
                        print("Delete Call Logs selected")

                    case 6:
                        break

                    case _:
                        print("Invalid option")

        case 3:

            while True:

                print("\n Ringtones ")
                print("1. Default Tone")
                print("2. Silent")
                print("3. Vibrate")
                print("4. Volume Control")
                print("5. Composer")
                print("6. Back")

                ringtoneChoice = int(input("Enter option: "))

                match ringtoneChoice:

                    case 1:
                        print("Default Tone selected")

                    case 2:
                        print("Silent selected")

                    case 3:
                        print("Vibrate selected")

                    case 4:
                        print("Volume Control selected")

                    case 5:
                        print("Composer selected")

                    case 6:
                        break

                    case _:
                        print("Invalid option")

        case 4:

            while True:

                print("\n Games ")
                print("1. Snake")
                print("2. Space Impact")
                print("3. Bantumi")
                print("4. Memory Game")
                print("5. Back")

                gameChoice = int(input("Enter option: "))

                match gameChoice:

                    case 1:
                        print("Snake selected")

                    case 2:
                        print("Space Impact selected")

                    case 3:
                        print("Bantumi selected")

                    case 4:
                        print("Memory Game selected")

                    case 5:
                        break

                    case _:
                        print("Invalid option")

        case 5:

            while True:

                print("\n Settings ")
                print("1. Phone Settings")
                print("2. Display Settings")
                print("3. Security Settings")
                print("4. Date and Time")
                print("5. Restore Factory Settings")
                print("6. Back")

                settingChoice = int(input("Enter option: "))

                match settingChoice:

                    case 1:
                        print("Phone Settings selected")

                    case 2:
                        print("Display Settings selected")

                    case 3:
                        print("Security Settings selected")

                    case 4:
                        print("Date and Time selected")

                    case 5:
                        print("Restore Factory Settings selected")

                    case 6:
                        break

                    case _:
                        print("Invalid option")

        case 6:
            print("Exiting program...")
            break

        case _:
            print("Invalid option")