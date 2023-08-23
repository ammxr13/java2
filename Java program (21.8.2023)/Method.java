public class Method {
    public static void main(String args[]) { //Main method
        SET2 sonia = new DSETclasses(); // create object sonia in class SET2
        sonia.representative(); // Run method in DSETclasses class

        DSETclasses marvin = new DSETclasses(); // create object marvin in class DSETclasses
        marvin.helper(); // Run method in DSETclasses class
    }
    static class SET2 { // Superclass
        public void representative() { // representative method
            System.out.println("\nWe are SET2");
        }
    }
    static class DSETclasses extends SET2{ // Subclass
        public void representative() { // override representative method
            super.representative(); // extend representative to SET2 superclass
            System.out.println("\nI am Sonia and I am the class representative for SET2");
        }   

        public void helper() { // Method
            System.out.println("\nI am Marvin and I am the helper for the class representative of SET2");
        }

    }
}
