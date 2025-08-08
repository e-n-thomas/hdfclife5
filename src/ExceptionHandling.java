public class ExceptionHandling {
    public static int div(int a, int b){
        int c = 0;
        try {
            c = a/b;

        }catch (ArithmeticException e){
            System.out.println("Cannot divide by zero.");
        }
        return c;
    }



}