public class Main {
    public static void main(String[] args) {
        FakeNewsAgency observable = new FakeNewsAgency();

        FakeNewsChannel observer1 = new FakeNewsChannel();
        FakeNewsChannelHD observer2 = new FakeNewsChannelHD();

        observable.addPropertyChangeListener(observer1);
        observable.addPropertyChangeListener(observer2);

        observable.setNews("BREAKING NEWS: I sneezed");
        System.out.println("---");
        observable.setNews("ANOTHER BREAKING NEWS: I sneezed again");
    }
}
