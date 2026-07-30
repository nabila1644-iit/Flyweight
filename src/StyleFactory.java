import java.util.HashMap;

public class StyleFactory {

    private HashMap<String, CharacterStyle> styles = new HashMap<>();

    public CharacterStyle getStyle(String font, int size, String color, boolean bold, boolean italic, boolean underline) {

        String key = font + "-" + size + "-" + color + "-"
                + bold + "-" + italic + "-" + underline;

        if (!styles.containsKey(key)) {

            System.out.println("Creating New Style -> " + key);

            styles.put(key,
                    new CharacterStyle(font,
                            size,
                            color,
                            bold,
                            italic,
                            underline));
        }

        return styles.get(key);
    }

    public int getStyleCount() {
        return styles.size();
    }
}