



public class Main {
    public static void main(String[] args)  {

        User user = new User("Elijah", 20);

        user.sayHello();

        TaxCalculator calculator = getCalculator2022();
        calculator.calculateTax();

    }

    public static TaxCalculator getCalculator2022() {
        return new TaxCalculator2022();
    }
}
