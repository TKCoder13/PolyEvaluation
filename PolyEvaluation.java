public class PolyEvaluation {

    public static double standardEval(double x) {
        //x -- the input value for the polynomial (given in the prompt)
        int[] a = {3,2,9,6,8,0,4,1};
        double result = a[0] + x*a[1];
        double xPower = x;

        for (int i = 2; i < a.length; i++) {
            xPower *= x;
            result += a[i]*xPower;
        }

        return result;
    }

    public static double hornersMethod(int[] a, double x) {
        //x -- the input value for the polynomial (given in the prompt)
        int n = a.length - 1;
        double result = a[n];
        for (int i = n - 1; i >= 0; i--) {
            result *= x;
            result += a[i];
        }
        return result;
    }

    public static double ppCoefs(double x) {
        int[] t1a = {5,0,0,0,1};
        double t1 = hornersMethod(t1a, x);
        int[] t2a = {-1,0,1};
        double t2 = hornersMethod(t2a, x);
        int[] t3a = {4,1};
        double t3 = hornersMethod(t3a, x);
        int[] t4a = {12,1};
        double t4 = hornersMethod(t4a, x);
        int[] t5a = {1,0,1};
        double t5 = hornersMethod(t5a, x);
        int[] t6a = {-11,1};
        double t6 = hornersMethod(t6a, x);
        int[] t7a = {-26,1};
        double t7 = hornersMethod(t7a, x);

        return t1*(t2*t3+t4)+(t5*t6+t7);
    }
    public static void main(String args[]) {

        System.out.println("Given Polynomial: p(x) = x^7 + 4x^6 + 8x^4 + 6x^3 + 9x^2 + 2x + 3");

        for (float i = -20.0f; i <= 20.1; i += 0.2) {
            System.out.println(standardEval(i));
        }

        System.out.println();

        for (float i = -20.0f; i <= 20.1; i += 0.2) {
            System.out.println(ppCoefs(i));
        }
    }
}