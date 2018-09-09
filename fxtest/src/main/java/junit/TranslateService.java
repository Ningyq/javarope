package junit;

import org.junit.platform.commons.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class TranslateService {
    private Map<String, String> dictionary = new HashMap<>();

    TranslateService() {
        initDict();
    }

    public String translate(String text) {
        if (StringUtils.isBlank(text)) {
            throw new IllegalArgumentException("Translating text is not blank");
        }
        return fromEnglishToFrench(text);
    }

    private void initDict() {
        dictionary.put("hello", "Bonjour");
        dictionary.put("yes", "Qui");
        dictionary.put("no", "Non");
        dictionary.put("goodbye" ,"Au revoir");
        dictionary.put("thank you", "Merci");
    }

    private String fromEnglishToFrench(String text) {
        String textLowerCase = text.toLowerCase();
        return dictionary.getOrDefault(textLowerCase, "Not found");
    }
}
