// File: SingletonDemo.java
class ConfigManager {
    private static ConfigManager instance;
    private String setting = "Default Config";

    private ConfigManager() {}

    public static ConfigManager getInstance() {
        if (instance == null) instance = new ConfigManager();
        return instance;
    }

    public String getSetting() { return setting; }
    public void setSetting(String setting) { this.setting = setting; }
}

public class SingletonDemo {
    public static void main(String[] args) {
        ConfigManager c1 = ConfigManager.getInstance();
        c1.setSetting("Production Mode");
        ConfigManager c2 = ConfigManager.getInstance();
        System.out.println("Both point to same object? " + (c1 == c2));
        System.out.println("Setting: " + c2.getSetting());
    }
}
