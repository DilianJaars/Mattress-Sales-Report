public abstract class Sales implements IProducts {
    String getMattress;
    int getMonths;

    public Sales(SalesReport model) {
        this.getMattress = model.Mattress;
        this.getMonths= model.Months;
    }

    @Override
    public String getMattress() {
        return getMattress;
    }

    @Override
    public int getMonths() {
        return getMonths;
    }
}

