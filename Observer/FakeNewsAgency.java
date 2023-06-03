import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class FakeNewsAgency {

    private String news;
    private final PropertyChangeSupport propertyChangeSupport;

    public FakeNewsAgency() {
        propertyChangeSupport = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener propertyChangeListener) {
        propertyChangeSupport.addPropertyChangeListener(propertyChangeListener);
    }

    public void removePropertyChangeListener(PropertyChangeListener propertyChangeListener) {
        propertyChangeSupport.removePropertyChangeListener(propertyChangeListener);
    }

    public void setNews(String value) {
        propertyChangeSupport.firePropertyChange("news", this.news, value);
        this.news = value;
    }
}
