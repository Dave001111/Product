# Nokia 3310 Menu in Python

inbox = []
sent_messages = []

missed_calls = ["David", "Dayo"]
dialed_calls = ["Wale", "Afolabi"]
received_calls = ["Abbey", "Maleek"]

while True:

    print("\n NOKIA 3310 ")
    print("1. Messages")
    print("2. Calls")
    print("3. Settings")
    print("4. Ringtones")
    print("5. Games")
    print("6. Exit")

    main_choice = int(input("Enter option: "))

    #  MESSAGES 
    if main_choice == 1:

        while True:

            print("\n Messages ")
            print("1. Write Message")
            print("2. Inbox")
            print("3. Sent Messages")
            print("4. Back")

            message_choice = int(input("Enter option: "))

            if message_choice == 1:
                message = input("Write your message: ")
                sent_messages.append(message)
                inbox.append(message)
                print("Message sent successfully")

            elif message_choice == 2:
                print("\n Inbox ")
                if len(inbox) == 0:
                    print("No messages")
                else:
                    for i in range(len(inbox)):
                        print(i + 1, inbox[i])

            elif message_choice == 3:
                print("\n Sent Messages ")
                if len(sent_messages) == 0:
                    print("No sent messages")
                else:
                    for i in range(len(sent_messages)):
                        print(i + 1, sent_messages[i])

            elif message_choice == 4:
                break

            else:
                print("Invalid option")

    #  CALLS 
    elif main_choice == 2:

        while True:

            print("\n Calls ")
            print("1. Missed Calls")
            print("2. Dialed Calls")
            print("3. Received Calls")
            print("4. Back")

            call_choice = int(input("Enter option: "))

            if call_choice == 1:
                print("\n Missed Calls ")
                for i in range(len(missed_calls)):
                    print(i + 1, missed_calls[i])

            elif call_choice == 2:
                print("\n Dialed Calls ")
                for i in range(len(dialed_calls)):
                    print(i + 1, dialed_calls[i])

            elif call_choice == 3:
                print("\n Received Calls ")
                for i in range(len(received_calls)):
                    print(i + 1, received_calls[i])

            elif call_choice == 4:
                break

            else:
                print("Invalid option")

    # SETTINGS 
    elif main_choice == 3:

        while True:

            print("\n Settings ")
            print("1. Phone Settings")
            print("2. Display Settings")
            print("3. Security Settings")
            print("4. Back")

            setting_choice = int(input("Enter option: "))

            # Phone Settings
            if setting_choice == 1:

                while True:
                    print("\n Phone Settings ")
                    print("1. Language")
                    print("2. Phone Name")
                    print("3. Back")

                    phone_choice = int(input("Enter option: "))

                    if phone_choice == 1:
                        print("Language selected")
                    elif phone_choice == 2:
                        print("Phone Name selected")
                    elif phone_choice == 3:
                        break
                    else:
                        print("Invalid option")

            # Display Settings
            elif setting_choice == 2:

                while True:
                    print("\n Display Settings ")
                    print("1. Brightness")
                    print("2. Wallpaper")
                    print("3. Back")

                    display_choice = int(input("Enter option: "))

                    if display_choice == 1:
                        print("Brightness selected")
                    elif display_choice == 2:
                        print("Wallpaper selected")
                    elif display_choice == 3:
                        break
                    else:
                        print("Invalid option")

            # Security Settings
            elif setting_choice == 3:

                while True:
                    print("\n Security Settings ")
                    print("1. Change PIN")
                    print("2. Phone Lock")
                    print("3. Back")

                    security_choice = int(input("Enter option: "))

                    if security_choice == 1:
                        print("Change PIN selected")
                    elif security_choice == 2:
                        print("Phone Lock selected")
                    elif security_choice == 3:
                        break
                    else:
                        print("Invalid option")

            elif setting_choice == 4:
                break

            else:
                print("Invalid option")

    #  RINGTONES 
    elif main_choice == 4:

        while True:

            print("\n Ringtones ")
            print("1. Default Tone")
            print("2. Silent")
            print("3. Vibrate")
            print("4. Volume")
            print("5. Back")

            ringtone_choice = int(input("Enter option: "))

            if ringtone_choice == 1:
                print("Default Tone selected")
            elif ringtone_choice == 2:
                print("Silent selected")
            elif ringtone_choice == 3:
                print("Vibrate selected")
            elif ringtone_choice == 4:
                print("Volume selected")
            elif ringtone_choice == 5:
                break
            else:
                print("Invalid option")

    #  GAMES 
    elif main_choice == 5:

        while True:

            print("\n Games ")
            print("1. Football")
            print("2. COD")
            print("3. SM Manager")
            print("4. Temple Run")
            print("5. Back")

            game_choice = int(input("Enter option: "))

            if game_choice == 1:
                print("Football selected")
            elif game_choice == 2:
                print("COD selected")
            elif game_choice == 3:
                print("SM Manager selected")
            elif game_choice == 4:
                print("Temple Run selected")
            elif game_choice == 5:
                break
            else:
                print("Invalid option")

    #      EXIT 
    elif main_choice == 6:
        print("Exiting program...")
        break

    else:
        print("Invalid option")