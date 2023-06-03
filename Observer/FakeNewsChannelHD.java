import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class FakeNewsChannelHD implements PropertyChangeListener {

    private String news;

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.setNews((String) propertyChangeEvent.getNewValue());
    }

    private void setNews(String news) {
        this.news = news;
        System.out.println("Hello Fake News Channel HD Readers, We received an update:");
        System.out.println(news);
    }
}
