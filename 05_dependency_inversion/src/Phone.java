public class Phone implements TrackerClient {
    public void weatherAlert(String weatherConditions) {
        if (weatherConditions == "rainy") {
            String alert = "It is " + weatherConditions;
            System.out.print(alert);
        }
    }
}
