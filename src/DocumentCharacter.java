public class DocumentCharacter {

    private char value;
    private int line;
    private int column;

    private CharacterStyle style;

    public DocumentCharacter(char value, int line, int column, CharacterStyle style) {

        this.value = value;
        this.line = line;
        this.column = column;
        this.style = style;
    }

    public void setCharacter(char c) {
        value = c;
    }

    public void setStyle(CharacterStyle style) {
        this.style = style;
    }

    public void display() {

        System.out.print("Character : " + value);

        System.out.print(" Position(" + line + "," + column + ") ");

        style.displayStyle();

        System.out.println();
    }
}