package classwork;

class Main {
    public static void main(String[] args) {
    try{
        int quantity = Integer.parseInt("abc");
        double price = 100.0;
        double total = quantity * price;
        System.out.println("Total: " + total);
    }catch(NumberFormatException e){
        System.out.println("Invalid input for quantity. Please enter a valid integer.");
        System.out.println("using default quantity of 1.");
        int quantity = 1;
        double price = 100.0;
        double total = quantity * price;
        System.out.println("Total: " + total);
    }
    System.out.println("checkout completed.");
    }
}