package hpi.ulpgc.model;

class Revenue {
    private RevenueModel revenueModel;
    private double price;

    public Revenue(RevenueModel revenueModel, double price) {
        this.revenueModel = revenueModel;
        this.price = price;
    }

    public RevenueModel getRevenueModel() {
        return revenueModel;
    }

    public void setRevenueModel(RevenueModel revenueModel) {
        this.revenueModel = revenueModel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}