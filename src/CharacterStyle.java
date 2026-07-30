public class CharacterStyle {

    private String fontFamily;
    private int fontSize;
    private String color;
    private boolean bold;
    private boolean italic;
    private boolean underline;

    public CharacterStyle(String fontFamily, int fontSize, String color, boolean bold, boolean italic, boolean underline) {

        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
        this.color = color;
        this.bold = bold;
        this.italic = italic;
        this.underline = underline;
    }

    public void displayStyle() {
        System.out.print("["
                + fontFamily + ", "
                + fontSize + ", "
                + color + ", "
                + "Bold=" + bold + ", "
                + "Italic=" + italic + ", "
                + "Underline=" + underline + "]");
    }
}