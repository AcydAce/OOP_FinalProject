package VendiMachineFP;

public interface Calculator {

    int calculateTotal(CoinGroup enteredCoins);
    CoinGroup calculateChange(int amountMoneyToReturn);

}
