public class Main {
    public static void main(String[] args) {
        System.out.println("===== MÉTODO DE EULER: y' = x - y =====");
        MetodoEuler.main(args);

        System.out.println();
        System.out.println("===== RUNGE-KUTTA 4: y' = x + y =====");
        MetodoRungeKutta.main(args);
    }
}