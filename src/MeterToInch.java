class MeterToInch {
    public static void main (String args[]) {
        double meters, inches;
        int counter;

        counter = 0;
        for (meters = 0; meters <= 100; meters++) {
            inches = meters * 39.37;
            System.out.println(meters + " meters are " +
                               inches + " inches.");

            if (counter == 10) {
                System.out.println(); //Print an empty line
                counter = 0; //Reset the counter after printing an empty line
            }

            counter++;
        }
    }
}
