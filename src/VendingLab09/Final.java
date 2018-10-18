package VendingLab09;

public class Final implements CoinStation {
    VendingMachineMain vm;

    public Final(VendingMachineMain vendingMachine) {
        this.vm = vendingMachine;
    }

    @Override
    public void insertCoin(int amount) {
        System.err.println("Error");
    }

    @Override
    public void chooseIt(String station) {
        System.err.println("Error");
    }

    @Override
    public void getTicket() {
        System.out.println("This is your ticket!!!");
        vm.setCurrentCoinStation(vm.getReady());
    }
}
