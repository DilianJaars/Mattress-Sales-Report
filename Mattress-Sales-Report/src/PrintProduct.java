public class PrintProduct extends SalesReport {
    public PrintProduct(SalesReport model) {
        super(model);

    }

    public void Print() {
        System.out.println("********************************");
        System.out.println("Mattress Sales Printout");
        System.out.println("********************************");
        System.out.println("Mattress: " + getMattress());
        System.out.println("Sales: " + getMonths());
        System.out.println("********************************");


    }

}