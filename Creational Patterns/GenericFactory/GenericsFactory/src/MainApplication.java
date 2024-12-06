
public class MainApplication {

    public static void main(String[] args) {
        HunterFactory factory = new HunterFactory();
        Watcher<Bigfoot> squatchWatcher = factory.getCritter(Bigfoot.class);
        Watcher<Frogman> frogmanWatcher = factory.getCritter(Frogman.class);

        squatchWatcher.see(new Bigfoot());
        frogmanWatcher.see(new Frogman());
    }
}
