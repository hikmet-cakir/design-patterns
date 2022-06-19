
import java.math.BigDecimal;

public class Wallet {
    private BigDecimal moneyInWallet;

    public Wallet(double moneyInWallet) {
        this.moneyInWallet = new BigDecimal(moneyInWallet);
    }

    public BigDecimal getMoneyInWallet() {
        return moneyInWallet;
    }

    public void setMoneyInWallet(BigDecimal moneyInWallet) {
        this.moneyInWallet = moneyInWallet;
    }
}
