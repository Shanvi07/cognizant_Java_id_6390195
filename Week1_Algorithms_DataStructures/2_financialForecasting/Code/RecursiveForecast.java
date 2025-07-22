public class RecursiveForecast implements ForecastStrategy {

    @Override
    public double calculate(ForecastRequest request) {
        return forecast(request.initialValue, request.rate, request.years);
    }

    private double forecast(double value, double rate, int years) {
        if (years == 0) return value;
        return forecast(value * (1 + rate), rate, years - 1);
    }
}
