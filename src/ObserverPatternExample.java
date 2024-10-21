public class ObserverPatternExample {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();

        weatherStation.addObserver(currentConditionsDisplay);
        weatherStation.addObserver(statisticsDisplay);

        weatherStation.setTemperature(25.5f);
        // Simulate another change in temperature
        weatherStation.setTemperature(30.0f);
        // Remove an observer
        weatherStation.removeObserver(currentConditionsDisplay);
        // Simulate another change in temperature
        weatherStation.setTemperature(28.0f);

    }
}


