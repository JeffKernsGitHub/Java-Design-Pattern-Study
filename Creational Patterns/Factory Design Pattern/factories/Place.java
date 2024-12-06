package factories;

import critters.Cryptid;

public abstract class  Place {


    public void findCryptid() {
        System.out.println("Hunting Cryptid ...");
        Cryptid critter = huntCryptid();
        critter.didntSee();
    }

    protected abstract Cryptid huntCryptid();


}