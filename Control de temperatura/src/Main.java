public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        TemperatureDisplay tempDisplay = new TemperatureDisplay();
        WeatherWarning weatherWarning = new WeatherWarning();

        weatherStation.addObserver(tempDisplay);
        weatherStation.addObserver(weatherWarning);

        weatherStation.setTemperature(22);
        weatherStation.setTemperature(35);
    }
}