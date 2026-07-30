public class Main {
    public static void main(String[] args) {

        StyleFactory factory =
                new StyleFactory();

        Document document =
                new Document();

        CharacterStyle style1 =
                factory.getStyle(
                        "Arial",
                        12,
                        "Black",
                        false,
                        false,
                        false);

        CharacterStyle style2 =
                factory.getStyle(
                        "Arial",
                        12,
                        "Black",
                        false,
                        false,
                        false);

        CharacterStyle style3 =
                factory.getStyle(
                        "Times",
                        16,
                        "Blue",
                        true,
                        false,
                        false);

        document.insert(
                new DocumentCharacter(
                        'H',
                        1,
                        1,
                        style1));

        document.insert(
                new DocumentCharacter(
                        'e',
                        1,
                        2,
                        style2));

        document.insert(
                new DocumentCharacter(
                        'l',
                        1,
                        3,
                        style2));

        document.insert(
                new DocumentCharacter(
                        'l',
                        1,
                        4,
                        style2));

        document.insert(
                new DocumentCharacter(
                        'o',
                        1,
                        5,
                        style3));

        document.displayDocument();

        document.modifyCharacter(4,'!');

        document.modifyStyle(0,style3);

        document.delete(2);

        document.displayDocument();

        StatisticsManager.showStatistics(document, factory);
    }
}