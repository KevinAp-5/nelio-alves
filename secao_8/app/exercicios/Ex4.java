package secao_8.app.exercicios;

public final class Ex4 {

    private Ex4() {
    }

    public static double calculaDolar(double dolarPrice, double dolarQuantity) {
        if (dolarPrice < 0.0 || dolarQuantity < 0.0) {
            throw new IllegalArgumentException("Dolar com valor negativo.");
        }

        double total = dolarPrice * dolarQuantity;
        return total + (dolarPrice * dolarQuantity) * 0.06;
    }
}
