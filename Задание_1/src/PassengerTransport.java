public class PassengerTransport implements Car {

    public static final int CODE = 300;
    private static final double fuelCost = 47.5;
    private static final double fuelConsumption = 11.5;

    private String number;
    private Integer mileage;
    private Integer passengersCarriedCount;

    public PassengerTransport(String number, Integer mileage, Integer passengersCarriedCount) {
        this.number = number;
        this.mileage = mileage;
        this.passengersCarriedCount = passengersCarriedCount;
    }

    @Override
    public String toString() {
        return "PassengerTransport{" +
                "number='" + number + '\'' +
                ", mileage=" + mileage +
                ", passengersCarriedCount=" + passengersCarriedCount +
                '}';
    }

    @Override
    public double getExpense() {
        return (mileage / fuelConsumption) * fuelCost;
    }

    @Override
    public int getCode() {
        return CODE;
    }

    @Override
    public double getFuelCost() {
        return fuelCost;
    }

    @Override
    public double getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public int getMileage() {
        return mileage;
    }
}
