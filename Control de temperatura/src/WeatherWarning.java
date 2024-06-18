public class WeatherWarning implements Observer{
    private static final int UMBRAL_DE_ADVERTENCIA = 30;

    @Override
    public void update(int temperatura) {
        if (temperatura > UMBRAL_DE_ADVERTENCIA) {
            System.out.println("Advertencia de Clima: ¡Advertencia! La temperatura excede los " + UMBRAL_DE_ADVERTENCIA + " grados.");
        }
    }
}
