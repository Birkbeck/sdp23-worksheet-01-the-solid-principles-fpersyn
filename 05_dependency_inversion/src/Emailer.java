public class Emailer implements TrackerClient {
    public void weatherAlert(String weatherConditions) {
        if (weatherConditions == "sunny") {
            String alert = "It is " + weatherConditions;
            System.out.print(alert);
        }
    }
}
