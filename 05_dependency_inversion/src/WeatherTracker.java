public class WeatherTracker implements Tracker {
    String currentConditions;
    TrackerClient client;

    public WeatherTracker(TrackerClient client) {
        this.client = client;
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        this.client.weatherAlert(weatherDescription);
    }
}
