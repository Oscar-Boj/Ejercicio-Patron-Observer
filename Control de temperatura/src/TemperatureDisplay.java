public class TemperatureDisplay implements Observer{
    @Override
    public void update(int temperatura) {
        System.out.println("Pantalla de Temperatura: La temperatura actual es " + temperatura + " grados.");
    }
}
