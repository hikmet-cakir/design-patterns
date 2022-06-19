import java.math.BigDecimal;

public class Client {

    public static void main(String[] args) {
        Wallet wallet = new Wallet(1000D);
        CurrencyAdapter currencyAdapter = new CurrencyAdapter();
        BigDecimal euro = currencyAdapter.convertTurkishLiraToEuro(wallet.getMoneyInWallet());
        System.out.println(euro);
    }
}