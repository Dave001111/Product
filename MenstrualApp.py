print("MENSTRUAL CYCLE APP")

flowstart = int(input("Enter flow start day: "))

cyclelength = int(input("Enter cycle length: "))

flowduration = int(input("Enter flow duration: "))


flowend = flowstart + flowduration - 1

nextperiod = flowstart + cyclelength

ovulationday = nextperiod - 14

fertilestart = ovulationday - 5
fertileend = ovulationday + 1

safestart1 = flowend + 1
safeend1 = fertilestart - 1

safestart2 = fertileend + 1
safeend2 = nextperiod - 1


print("\nRESULTS")

print("Flow Period: Day", flowstart, "to Day", flowend)

print("Next Period Day:", nextperiod)

print("Ovulation Day:", ovulationday)

print("Fertile Period: Day", fertilestart, "to Day", fertileend)

print("Safe Period 1: Day", safestart1, "to Day", safeend1)

print("Safe Period 2: Day", safestart2, "to Day", safeend2)