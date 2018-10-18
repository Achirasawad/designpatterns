package VendingLab09;

import java.util.Map;
import java.util.TreeMap;

public class Standby implements CoinStation {
    VendingMachineMain vm;
    Map<String, Integer> howMuchPrice = new TreeMap<>();

    public Standby(VendingMachineMain vendingMachine) {
        this.vm = vendingMachine;
        howMuchPrice.put("Siam", 10);
        howMuchPrice.put("See lom", 25);
        howMuchPrice.put("Sanampap", 35);
        howMuchPrice.put("Ekamai", 45);
        howMuchPrice.put("Mao chi", 55);
    }


    @Override
    public void getTicket() {
        System.err.println("Error");
    }

    @Override
    public void insertCoin(int amount) {
        System.err.println("Error");
    }


    @Override
    public void chooseIt(String station) {
        if (howMuchPrice.containsKey(station)) {
            System.err.println("Can't find this station");
            return;
        }
        int price = howMuchPrice.get(station);
        System.out.println("Choose " + station + "-> " + price + " Bath");
        vm.setCurrentCoinStation(vm.getPay());
    }
}
