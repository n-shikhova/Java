public class HeavyMachine implements Car {

    public static final int CODE = 400;
    private static final double fuelCost = 48.90;
    private static final double fuelConsumption = 20;

    private String number;
    private Integer mileage;
    private Integer liftedLoadsWeight;

    public HeavyMachine(String number, Integer mileage, Integer liftedLoadsWeight) {
        this.number = number;
        this.mileage = mileage;
        this.liftedLoadsWeight = liftedLoadsWeight;
    }

    @Override
    public String toString() {
        return "HeavyMachine{" +
                "number='" + number + '\'' +
                ", mileage=" + mileage +
                ", liftedLoadsWeight=" + liftedLoadsWeight +
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
