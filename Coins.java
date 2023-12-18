public class Coins {
    public static void main(String[] args) {
        //get number of cents from the command-line and define him as a variable of type int
        int sumCents = Integer.parseInt(args[0]);
        // calculate the amount of quarters 
        int quarters = sumCents / 25;
        // calculate the remaining cents
        int cents = sumCents - (quarters*25);
        // print 
        System.err.println("Use " + quarters + " quarters and " + cents + " cents");
    }
}
