package VendiMachineFP;

public class SecondCalculator implements Calculator{


    @Override
    public int calculateTotal(CoinGroup enteredCoins) {
        return enteredCoins.getTotal();
    }


    @Override
    public CoinGroup calculateChange(int amountMoneyToReturn) {

        CoinGroup change = new CoinGroup(new int[5]);
        int remainingAmount = amountMoneyToReturn;

        //returns proper amount of coins and check leftovers
        change.number100CentsCoins = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        change.number50CentsCoins = remainingAmount / 50;
        remainingAmount = remainingAmount % 50;

        change.number20CentsCoins = remainingAmount / 20;
        remainingAmount = remainingAmount % 20;

        change.number10CentsCoins = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        change.number5CentsCoins = remainingAmount / 5;

        return change;
    }
}
