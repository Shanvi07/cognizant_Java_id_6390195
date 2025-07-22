public class ForecastService {
    private final ForecastStrategy strategy;

    public ForecastService(ForecastStrategy strategy) {
        this.strategy = strategy;
    }

    public double predict(ForecastRequest request) {
        return strategy.calculate(request);
    }
}
