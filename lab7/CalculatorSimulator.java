package lab7;

class TaxCalculator {
    String empName;
    boolean isIndian;
    double empSal;

    TaxCalculator() {}

    public TaxCalculator(String empName, boolean isIndian, double empSal) {
        this.empName = empName;
        this.isIndian = isIndian;
        this.empSal = empSal;
    }

    public double taxAmount()
            throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligible {
        if (!isIndian) {
            throw new CountryNotValidException("The Employee should be an Indian Citizen for Calculating tax");
        }

        if (empName == null || empName.isEmpty()) {
            throw new EmployeeNameInvalidException("The Employee Name Cannot be Empty");
        }

        if (empSal > 100000 && isIndian) {
            return empSal * 8 / 100;
        } else if ((empSal > 50000 && empSal <= 100000) && isIndian) {
            return empSal * 6 / 100;
        } else if ((empSal > 30000 && empSal <= 50000) && isIndian) {
            return empSal * 5 / 100;
        } else if ((empSal > 10000 && empSal <= 30000) && isIndian) {
            return empSal * 4 / 100;
        } else {
            throw new TaxNotEligible("The employee does not need to pay tax");
        }
    }
}

public class CalculatorSimulator {
    public static void main(String[] args) {
        TaxCalculator e1 = new TaxCalculator("Ron", false, 34000);
        try {
            System.out.println("Tax amount is: "+e1.taxAmount());
        } catch (TaxNotEligible | CountryNotValidException | EmployeeNameInvalidException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("=============================================================================================");

        TaxCalculator e2 = new TaxCalculator("Tim", true, 1000);
        try {
            System.out.println("Tax amount is: "+e2.taxAmount());
        } catch (TaxNotEligible | CountryNotValidException | EmployeeNameInvalidException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("=============================================================================================");

        TaxCalculator e3 = new TaxCalculator("Jack", true, 55000);
        try {
            System.out.println("Tax amount is: "+e3.taxAmount());
        } catch (TaxNotEligible | CountryNotValidException | EmployeeNameInvalidException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("=============================================================================================");

        TaxCalculator e4 = new TaxCalculator("", true, 30000);
        try {
            System.out.println("Tax amount is: "+e4.taxAmount());
        } catch (TaxNotEligible | CountryNotValidException | EmployeeNameInvalidException e) {
            System.out.println(e.getMessage());
        }
    }
}
