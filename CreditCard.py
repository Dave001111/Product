cardnumber = input("Hello, Kindly Enter card number: ")

if len(cardnumber) == 13 or len(cardnumber) == 16:

    totalsum = 0
    count = 0

    for i in range(len(cardnumber) - 1, -1, -1):

        digit = int(cardnumber[i])

        if count % 2 == 1:
            digit = digit * 2

            if digit > 9:
                digit = digit - 9

        totalsum = totalsum + digit
        count = count + 1

    cardtype = "Unknown"

    if cardnumber.startswith("4"):
        cardtype = "Visa"
    elif cardnumber.startswith("5"):
        cardtype = "MasterCard"
    elif cardnumber.startswith("37"):
        cardtype = "American Express"
    elif cardnumber.startswith("6"):
        cardtype = "Discover"

    if totalsum % 10 == 0:
        status = "Valid"
    else:
        status = "Invalid"

    print("\nCARD DETAILS")
    print("Type:", cardtype)
    print("Number:", cardnumber)
    print("Length:", len(cardnumber))
    print("Status:", status)

else:
    print("Card must be 13 or 16 digits")