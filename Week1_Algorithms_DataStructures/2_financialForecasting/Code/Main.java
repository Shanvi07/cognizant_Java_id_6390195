public class Main {
    public static void main(String[] args) {
        ForecastRequest request = new ForecastRequest(10000, 0.05, 5);
        ForecastService service = new ForecastService(new RecursiveForecast());

        double result = service.predict(request);
        System.out.printf("Future value after %d years: Rs. %.2f\n", request.years, result);
    }
}
