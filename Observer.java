// File: ObserverDemo.java
import java.util.*;

interface Observer {
    void update(String news);
}

class NewsAgency {
    private List<Observer> observers = new ArrayList<>();
    public void addObserver(Observer o) { observers.add(o); }
    public void notifyObservers(String news) {
        for (Observer o : observers) o.update(news);
    }
}

class NewsChannel implements Observer {
    private String name;
    public NewsChannel(String name) { this.name = name; }
    public void update(String news) {
        System.out.println(name + " got news: " + news);
    }
}

public class ObserverDemo {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();
        agency.addObserver(new NewsChannel("Channel A"));
        agency.addObserver(new NewsChannel("Channel B"));
        agency.notifyObservers("Breaking News: Observer Pattern Works!");
    }
}
