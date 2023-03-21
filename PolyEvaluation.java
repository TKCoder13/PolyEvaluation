public class PolyEvaluation {

    public static double standardEval(double x) {
        //x -- the input value for the polynomial (given in the prompt)
        int[] a = {3,2,9,6,8,0,4,1};
        double result = a[0];
        double xPower = x;

        for (int i = 2; i < a.length; i++) {
            xPower *= x;
            result += a[i]*xPower;
        }

        return result;
    }

    public static void main(String args[]) {
        for (float i = -20.0f; i <= 20.1; i += 0.2) {
            System.out.println();
            System.out.print("i = ");
            System.out.printf("%.1f", i);
            System.out.print(", p(");
            System.out.printf("%.1f", i);
            System.out.print(") = " + standardEval(i));
        }
        
    }

}