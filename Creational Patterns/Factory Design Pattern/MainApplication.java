import factories.Water;
import factories.Woods;

public class MainApplication {

    public static void main(String[] args) {
        Water greatMiamiRiver = new Water();
        greatMiamiRiver.findCryptid();
        System.out.println("==========================================");
        Woods rushRunWMA = new Woods();
        rushRunWMA.findCryptid();
    }

}
