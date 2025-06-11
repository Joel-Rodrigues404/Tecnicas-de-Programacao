public class teste0101 {
    public static void main(String[] args) {
        double[] x = new double[3];
        double[] y = new double[3];

        double semip = (x[0] + x[1] + x[2]) / 2.0;
        double area = Math.sqrt(semip * ((semip - x[0]) * (semip - x[1]) * (semip - x[2])));

        double semipy = (y[0] + y[1] + y[2]) / 2;
        double areay = Math.sqrt(semipy * ((semipy - y[0]) * (semipy - y[1]) * (semipy - y[2])));
    }
}
