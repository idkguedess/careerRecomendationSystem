package hpi.ulpgc.model;

public class Revenue {
    private RevenueModel revenueModel;
    private double value;

    public Revenue(RevenueModel revenueModel, double value) {
        this.revenueModel = revenueModel;
        this.value = value;
    }

    public RevenueModel getRevenueModel() {
        return revenueModel;
    }

    public double getValue() {
        return value;
    }

    public void setRevenueModel(RevenueModel revenueModel) {
        this.revenueModel = revenueModel;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Revenue{" +
                "revenueModel=" + revenueModel +
                ", value=" + value +
                '}';
    }
}
