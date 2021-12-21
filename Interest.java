public class Interest {
    public static void main(String[] args) {
        double x = calculateInterest(10000,2);
        System.out.println(x);
    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }
}
