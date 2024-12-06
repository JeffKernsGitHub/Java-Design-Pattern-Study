package factories;

import critters.Bigfoot;
import critters.Cryptid;

public class Woods extends Place{

    @Override
    protected Cryptid huntCryptid() {
        System.out.println("Hunting Bigfoot...");
        return new Bigfoot();
    }
}
