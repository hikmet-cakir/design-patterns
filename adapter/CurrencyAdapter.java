import java.math.BigDecimal;

public class CurrencyAdapter {

    private BigDecimal exchangeRateTLtoEuro = new BigDecimal(20);

    public BigDecimal convertTurkishLiraToEuro(BigDecimal turkishLira) {
        return turkishLira.divide(exchangeRateTLtoEuro);
    }

    public BigDecimal convertEuroToTurkishLira(BigDecimal euro) {
        return euro.multiply(exchangeRateTLtoEuro);
    }
}