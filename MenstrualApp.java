import java.util.Scanner;

public class MenstrualApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" MENSTRUAL CYCLE APP ");

        
        System.out.print("Enter flow start day: ");
        int flowStart = input.nextInt();

        
        System.out.print("Enter cycle length: ");
        int cycleLength = input.nextInt();

        
        System.out.print("Enter flow duration: ");
        int flowDuration = input.nextInt();



        
        int flowEnd = flowStart + flowDuration - 1;

        
        int nextPeriod = flowStart + cycleLength;

        
        int ovulationDay = nextPeriod - 14;

        
        int fertileStart = ovulationDay - 5;
        int fertileEnd = ovulationDay + 1;

        
        int safeStart1 = flowEnd + 1;
        int safeEnd1 = fertileStart - 1;

        
        int safeStart2 = fertileEnd + 1;
        int safeEnd2 = nextPeriod - 1;



        
        System.out.println("\n RESULTS ");

        System.out.println("Flow Period: Day " + flowStart + " to Day " + flowEnd);

        System.out.println("Next Period Day: " + nextPeriod);

        System.out.println("Ovulation Day: " + ovulationDay);

        System.out.println("Fertile Period: Day " + fertileStart + " to Day " + fertileEnd);

        System.out.println("Safe Period 1: Day " + safeStart1 + " to Day " + safeEnd1);

        System.out.println("Safe Period 2: Day " + safeStart2 + " to Day " + safeEnd2);

    }
}