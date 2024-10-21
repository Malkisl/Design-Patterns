// observer pattern
import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private List<Observer> observers = new ArrayList<>();
    private float temperature;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}
// Observer
interface Observer {
    void update(float temperature);
}
// Concrete Observer
class CurrentConditionsDisplay implements Observer {
    private float temperature;
    @Override
    public void update(float temperature) {
        this.temperature = temperature;
        display();
    }
    private void display() {
        System.out.println("Current Conditions Display: Temperature = " + temperature);
    }
}
// Concrete Observer
class StatisticsDisplay implements Observer {
    private float temperature;
    @Override
    public void update(float temperature) {
        this.temperature = temperature;
        display();
    }
    private void display() {
        System.out.println("Statistics Display: Temperature = " + temperature);
    }
}

