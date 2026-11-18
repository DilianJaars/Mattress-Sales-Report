public class Main {
    public static void main(String[] args) {
        SalesReport model = new SalesReport();
        model.Mattress = "Mattress";
        model.getMonths = "Months";
        PrintProduct printProduct = new PrintProduct(model);
        printProduct.
                Print();
    }
}