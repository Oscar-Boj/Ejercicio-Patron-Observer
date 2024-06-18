import java.util.ArrayList;
import java.util.List;


public class WeatherStation implements Subject{
    private List<Observer> observers;
    private int temperatura;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    public void setTemperature(int temperatura) {
        this.temperatura = temperatura;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperatura);
        }
    }
}
