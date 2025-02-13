package v25;

public class WhileExamples {
    public static void main(String[] args) {

//        // udskriv 5 gange
//        //     Programming is fun
//        int i = 0; // indeks for udskriften
//        while (i < 5) {
//            System.out.println(i + " Programming is fun");
//            i = i + 1;
//        }


//        // udskriv tallene fra 1 til 10
//        int i = 1;
//        while (i <= 10) {
//            System.out.println(i);
//            i++;
//        }

//        // beregn summen af tallene fra 1 til 10
//        int sum = 0;
//        int i = 1;
//        while (i <= 1000) {
//            sum = sum + i;
//            i++;
//        }
//        System.out.println(sum);

        // beregn summen af de lige kvadrattal i 1 til 10
        int sum = 0;
        int i = 2;
        while (i <= 10) {
            sum = sum + i * i;
            i = i + 2;
        }
        System.out.println(sum);
    }
}
