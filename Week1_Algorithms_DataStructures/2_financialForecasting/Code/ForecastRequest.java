public class ForecastRequest {
    public double initialValue;
    public double rate;
    public int years;

    public ForecastRequest(double initialValue, double rate, int years) {
        this.initialValue = initialValue;
        this.rate = rate;
        this.years = years;
    }
}
