package net.nightpixel.cyberpunk.system.strings;

import dev.lupluv.langmodule.Lang;
import dev.lupluv.langmodule.api.StringGetter;
import net.nightpixel.cyberpunk.system.SystemMain;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class Strings {

    private static Strings instance;

    public static Strings getInstance() {
        if(instance == null){
            instance = new Strings();
        }
        return instance;
    }

    public String getPrefix(Player p){
        return StringGetter.getInstance().getLanguageString("plugins//System", Lang.getApi().getUserManager().getUser(p).getLanguage(), "Prefix")
                .replace("&", "§");
    }

    public String getMessage(Player p, String key){
        return StringGetter.getInstance().getLanguageString("plugins//System", Lang.getApi().getUserManager().getUser(p).getLanguage(), key)
                .replace("&", "§").replace("%prefix%", getPrefix(p)).replace("%version%", SystemMain.getInstance().getVersion());
    }

    public List<String> getMessageLines(Player p, String key){
        List<String> toReturn = new ArrayList<>();
        StringGetter.getInstance().getLanguageLines("plugins//System", Lang.getApi().getUserManager().getUser(p).getLanguage(), key).forEach(all ->{
            toReturn.add(all.replace("&", "§").replace("%prefix%", getPrefix(p)).replace("%version%", SystemMain.getInstance().getVersion()));
        });
        return toReturn;
    }

}
