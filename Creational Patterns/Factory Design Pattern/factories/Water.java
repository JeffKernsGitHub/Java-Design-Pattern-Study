package factories;

import critters.Cryptid;
import critters.FrogMan;

public class Water extends Place{


    @Override
    protected Cryptid huntCryptid() {
        System.out.println("Hunting Frogman...");
        return new FrogMan();
    }
}
