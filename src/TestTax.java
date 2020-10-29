public class TestTax {

    public static void main(String[] args) {
        Tax tax1 = new Tax();
        tax1.grossIncome = 60000;

        System.out.println("Tax is " + tax1.calcTax());
    }


}

