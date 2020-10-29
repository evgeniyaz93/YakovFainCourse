public class TestNJTax {

    public static void main(String[] args)
    {
        double totalForStudent;
        NJTax NJTax1 = new NJTax();
        NJTax1.grossIncome=60000;
        totalForStudent = NJTax1.adjustForStudent(NJTax1.calcTax());
        System.out.println(totalForStudent);

    }
}
