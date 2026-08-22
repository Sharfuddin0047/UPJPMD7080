package lab7;

public class CountryNotValidException extends Exception {

    CountryNotValidException() {}

    CountryNotValidException(String msg) {
        super(msg);
    }
}
