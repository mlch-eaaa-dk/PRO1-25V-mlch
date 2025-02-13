package ex3;

public class Ex539 {
    public static void main(String[] args) {
        int totalSalary;
        int salesAmount = 0;
        do {
            salesAmount += 1000; // $
            int commission;
            if (salesAmount <= 5000) {
                commission = salesAmount * 6 / 100;
            } else if (salesAmount <= 10000) {
                commission = 5000 * 6 / 100 + (salesAmount - 5000) * 8 / 100;
            } else {
                commission = 5000 * 6 / 100 + (10000 - 5000) * 8 / 100 +
                        (salesAmount - 10000) * 10 / 100;
            }
            totalSalary = 5000 + commission;
            System.out.println(salesAmount + "\t" + totalSalary);
        } while (totalSalary < 30000);
        System.out.println();

        System.out.println("Test");
        System.out.println(5000 + 5000 * 6 / 100 + 5000 * 8 / 100 + (253000 - 10000) * 10 / 100);
        System.out.println();

        // Matematisk: salesAmount kaldes sA
        // sA = 10.000 giver
        // totalSalary = 5000 + 5000 * 6/100 + 5000 * 8/100
        //             = 5000 + 300 + 400 = 5700,
        // så sA skal være mere end 10.000.
        //
        // Ligning:
        // 5700 + (sA - 10000) * 10/100 = 30000 <=>
        // sA - 10000 = (30000 - 5700) / 0,1 <=>
        // sA = 243000 + 10000 <=>
        // sA = 253000
//        double sA = (30000 - 5700) / 0.1 + 10000;
//        System.out.println("Test af ligningsløsning:");
//        System.out.println("sA = " + sA);
    }
}
