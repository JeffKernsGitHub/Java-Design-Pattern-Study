
public class FrogmanWatcher implements Watcher<Frogman> {

    @Override
    public void see(Frogman fm) {
        System.out.println("Watching: " + fm.toString());
    }
}