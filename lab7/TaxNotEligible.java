package lab7;

public class TaxNotEligible extends Exception {
    TaxNotEligible(){}

    TaxNotEligible(String msg) {
        super(msg);
    }
}
