package net.nightpixel.cyberpunk.system.strings;

import dev.lupluv.langmodule.api.LanguageBuilder;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class SystemLanguageBuilder extends LanguageBuilder {

    public static SystemLanguageBuilder create(String defaultLanguage, String pluginDir) {
        if (!new File(pluginDir + "//Languages").exists()) {
            new File(pluginDir + "//Languages").mkdir();
        }

        return new SystemLanguageBuilder(defaultLanguage, new HashMap<>(), new HashMap<>());
    }

    public SystemLanguageBuilder(String defaultLanguage, Map<String, String> translations, Map<String, String> manualTranslations) {
        super(defaultLanguage, translations, manualTranslations);
    }
}
