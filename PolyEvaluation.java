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

    public static double hornersMethod(double x) {
        //x -- the input value for the polynomial (given in the prompt)
        int[] a = {3,2,9,6,8,0,4,1};
        int n = a.length - 1;
        double result = a[n];
        for (int i = n; i >= 0; i--) {
            result *= x;
            result += a[i];
        }
        return result;
    }

    //Matrix Multiplication
    public static double[][] matMult(double[][] A, double[][] B) throws IllegalArgumentException {
        if (A[0].length != B.length) throw new IllegalArgumentException("Mismatched Arrays");

        double[][] result = new double[A.length][B[0].length];
        //try catch statement to ensure that the lengths of the array are valid arguments
        // look at diagram on Marker I
        try {
            for (int i = 0; i < A.length; i++) { // pick a row
                for (int j = 0; j < B[0].length; j++) { // pick a col
                    for (int k = 0; k < B.length; k++) {
                        result[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
            
            return result;

        } catch (Exception e){
            throw new IllegalArgumentException("Missmatched Arrays");
        }
    }

    public static double preProcCoefs() {
        double result = 0;
        return result;
    }

    public static void main(String args[]) {
        System.out.println("Standard Method: ");
        
        for (float i = -20.0f; i <= 20.1; i += 0.2) {
            System.out.println();
            System.out.print("i = ");
            System.out.printf("%.1f", i);
            System.out.print(", p(");
            System.out.printf("%.1f", i);
            System.out.print(") = " + standardEval(i));
        }
        System.out.println("\n\nHorner's Method: ");

        for (float i = -20.0f; i <= 20.1; i += 0.2) {
            System.out.println();
            System.out.print("i = ");
            System.out.printf("%.1f", i);
            System.out.print(", p(");
            System.out.printf("%.1f", i);
            System.out.print(") = " + hornersMethod(i));
        }
    }

}