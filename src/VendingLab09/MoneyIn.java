package VendingLab09;

public class MoneyIn implements CoinStation {
    VendingMachineMain vm;

    public MoneyIn(VendingMachineMain vendingMachine) {
        this.vm = vendingMachine;
    }

    @Override
    public void insertCoin(int amount) {
        int useAmount = vm.getAmount() + amount;
        if (useAmount >= vm.getPrice()) {
            if (useAmount > vm.getPrice())
                System.out.println("Change " + (useAmount - vm.getPrice()));
            System.out.println("Completed :You Got ticket!");
            vm.setAmount(0);
            vm.setPrice(0);
            vm.setCurrentCoinStation(vm.getEnd());
        } else if (useAmount < vm.getPrice())
            System.out.println("Please give me a coin " + (vm.getPrice() - useAmount));
    }

    @Override
    public void chooseIt(String station) {
        System.err.println("Error");
    }

    @Override
    public void getTicket() {
        System.err.println("Error");
    }
}
