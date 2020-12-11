class BooleanExample {
    public static void main (String args[]) {
        boolean b;

        b = false;
        System.out.println("b is " + b);

        b = true;
        System.out.println("b is now " + b);

        // A boolean value can control the if statement
        if (b) {
            System.out.println("This is executed when b is true");
        }

        // Outcome of a rational operator is a boolean value
        System.out.println("10 > 9 is " + (10 > 9));
    }    
}
