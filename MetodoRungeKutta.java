public class MetodoRungeKutta {

    public static double evaluarFuncion(double x, double y) {
        return x + y;
    }

    public static double exacta(double x) {
        return 2 * Math.exp(x) - x - 1;
    }

    public static void main(String[] args) {
        double x0 = 0.0, y0 = 1.0;
        double h = 0.1;
        double xFinal = 0.3;

        int nPasos = (int) Math.round((xFinal - x0) / h);
        double x = x0, y = y0;

        System.out.println("n\t x_n\t y_n (RK4)\t y_exacta\t error");
        System.out.println("------------------------------------------------------");
        System.out.printf("%d\t %.4f\t %.8f\t %.8f\t %.2e\n",
                0, x, y, exacta(x), Math.abs(exacta(x) - y));

        for (int i = 0; i < nPasos; i++) {
            double k1 = evaluarFuncion(x, y);
            double k2 = evaluarFuncion(x + h / 2, y + h * k1 / 2);
            double k3 = evaluarFuncion(x + h / 2, y + h * k2 / 2);
            double k4 = evaluarFuncion(x + h, y + h * k3);

            y = y + (h / 6) * (k1 + 2 * k2 + 2 * k3 + k4);
            x = x0 + (i + 1) * h;
            System.out.printf("%d\t %.4f\t %.8f\t %.8f\t %.2e\n",
                    i + 1, x, y, exacta(x), Math.abs(exacta(x) - y));
        }
    }
}