
public class BigfootWatcher implements Watcher<Bigfoot> {

    @Override
    public void see(Bigfoot bf) {
        System.out.println("Watching: " + bf.toString());
    }
}