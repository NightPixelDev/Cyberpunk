package net.nightpixel.cyberpunk.system;

import net.nightpixel.cyberpunk.system.strings.SystemLanguageBuilder;
import org.bukkit.plugin.java.JavaPlugin;

public class SystemMain extends JavaPlugin {

    private static SystemMain instance;
    private String version;

    @Override
    public void onLoad() {

        instance = this;
        version = this.getDescription().getVersion();

    }

    @Override
    public void onEnable() {








        // System Language
        SystemLanguageBuilder systemLanguageBuilder = SystemLanguageBuilder.create("en_US", "plugins//System");
        systemLanguageBuilder.addTranslation("plugins//System", "en_US", "/defaults/en_US.yml");
        systemLanguageBuilder.build();






    }

    @Override
    public void onDisable() {

    }

    public static SystemMain getInstance() {
        return instance;
    }

    public String getVersion() {
        return version;
    }

    public static void sendColoredConsoleMessage(String msg){
        getInstance().getServer().getConsoleSender().sendMessage(msg);
    }

}
