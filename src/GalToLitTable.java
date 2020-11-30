class GalToLitTable {
    public static void main (String args[]) {
        double gallons, liters;
        int counter;

        counter = 0;
        for(gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854; // convert to liters
            System.out.println(gallons + " gallons is " +
                                           liters + " liters.");
            
            counter++;

            if (counter == 10) {
                System.out.println(); //Print an empty line for readability
                counter = 0; //Reset this counter after printing the empty line.
            }
        }
    }
}
