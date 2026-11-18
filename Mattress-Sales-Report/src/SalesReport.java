public class SalesReport {

    public static void main(String[] args) {

// Single-dimensional arrays

        String[] Months =  {"Month 1", "Month 2", "Month 3"};{"Cozy Nights Monarch Mattress", "Restonic Barbados Mattress", "Sealy Phuket Mattress"};
        String[] Mattress = {"Cozy Nights Monarch Mattress", "Restonic Barbados Mattress", "Sealy Phuket Mattress"};

        // Two-dimensional array: rows = Mattress, columns = Months

        int[][] sales = {
                {25,18,20},   //Cozy Nights Monarch Mattress
                {15,10,12},   //Restonic Barbados Mattress
                {18, 15,20}    //Sealy Phuket Mattress
        };
        String line = "-".repeat(60);

        // ---- Sales per  ----
        System.out.println(line);
        System.out.println("SalesReport");
        System.out.println(line);

        System.out.printf("%-18s", "");
        for (String console : Mattress) {
            System.out.printf("%-10s",Mattress);
        }
        System.out.println();

        for (int i = 0; i < Mattress.length; i++) {
            System.out.printf("%-18s", Mattress[i]);
            for (int j = 0; j < Mattress.length; j++) {
                System.out.printf("%-10d", sales[i][j]);
            }
            System.out.println();
        }

        // ---- Totals per Mattress ----
        int[] totals = new int[Mattress.length];
        for (int i = 0; i < Mattress.length; i++) {
            for (int j = 0; j < Mattress.length; j++) {
                totals[i] += sales[i][j];
            }
        }


    }
}
