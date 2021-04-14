public class CargoCar implements Car {

    public static final int CODE = 200;
    private static final double fuelCost = 48.90;
    private static final double fuelConsumption = 12;

    private String number;
    private Integer mileage;
    private Integer cargoVolume;

    public CargoCar(String number, Integer mileage, Integer cargoVolume) {
        this.number = number;
        this.mileage = mileage;
        this.cargoVolume = cargoVolume;
    }

    @Override
    public String toString() {
        return "CargoCar{" +
                "number='" + number + '\'' +
                ", mileage=" + mileage +
                ", cargoVolume=" + cargoVolume +
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
