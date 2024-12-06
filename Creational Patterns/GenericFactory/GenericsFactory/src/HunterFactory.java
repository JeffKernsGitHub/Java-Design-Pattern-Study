
public class HunterFactory{

    public <T> Watcher<T> getCritter(Class <T> c) {
        if (c == Bigfoot.class) {
            return Record.BIGFOOT.make();
        }
        if (c == Frogman.class) {
            return Record.FROGMAN.make();
        }
        return null;
    }
}
