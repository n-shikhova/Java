public class LightCar implements Car{

    public static final int CODE = 100;
    private static final double fuelCost  = 46.10;
    private static final double fuelConsumption = 12.5;

    private String number;
    private Integer mileage;

    public LightCar(String number, Integer mileage) {
        this.number = number;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "LightCar{" +
                "number='" + number + '\'' +
                ", mileage=" + mileage +
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
