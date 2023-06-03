import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class FakeNewsChannel implements PropertyChangeListener {

    private String news;

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        this.setNews((String) propertyChangeEvent.getNewValue());
    }

    private void setNews(String news) {
        this.news = news;
        System.out.println("Hello Fake News Channel Readers, We received an update:");
        System.out.println(news);
    }
}
