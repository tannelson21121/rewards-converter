import java.util.Scanner;

public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor accepting cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertToMiles(cashValue);
    }

    // Constructor accepting miles value
    public RewardValue(double milesValue, boolean isMiles) {
        this.milesValue = milesValue;
        this.cashValue = convertToCash(milesValue);
    }

    // Getter method for cash value
    public double getCashValue() {
        return cashValue;
    }

    // Getter method for miles value
    public double getMilesValue() {
        return milesValue;
    }

    // Conversion method: cash to miles
    private double convertToMiles(double cashValue) {
        return cashValue / 0.0035;
    }

    // Conversion method: miles to cash
    private double convertToCash(double milesValue) {
        return milesValue * 0.0035;
    }
}
