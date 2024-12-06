
public enum Record {
    BIGFOOT {
        @Override
        public Watcher<Bigfoot> make() {
            return new BigfootWatcher();
        }
    },
    FROGMAN {
        @Override
        public Watcher<Frogman> make() {
            return new FrogmanWatcher();
        }
    };

    public abstract <T> Watcher<T> make();
}