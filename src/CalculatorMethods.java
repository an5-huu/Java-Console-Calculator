public class CalculatorMethods {
    public static double add(double n1, double n2){
        return n1+n2;
    }

    public static double subtract(double n1, double n2){
        return n1-n2;
    }

    public static double multiplication(double n1, double n2){
        return n1*n2;
    }

    public static double divide(double n1, double n2){
        if(n2==0) {
            throw new IllegalArgumentException("Can't divide by zero");
        }
        return n1/n2;
    }
}
